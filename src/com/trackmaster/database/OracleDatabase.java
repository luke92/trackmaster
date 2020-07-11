package com.trackmaster.database;

import java.io.Closeable;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class OracleDatabase implements Closeable
{
	private ComboPooledDataSource pool;
	private Connection connection = null;
	private PreparedStatement prepStatement = null;
    private ResultSet resultSet = null;
    private Statement statement=null;
    
    public OracleDatabase()
    {
    	connect();
    }
    
	private void connect() 
	{
		pool = new ComboPooledDataSource();
	    try 
	    {
	    	Locale.setDefault(Locale.US);
	    	pool.setDriverClass("oracle.jdbc.driver.OracleDriver");
	    	pool.setUser("Trackmaster");
	    	pool.setPassword("Trackmaster");
	    	//pool.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE"); 
	    	pool.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE"); 
	    	pool.setMaxPoolSize(50);
	    	connection = pool.getConnection();
	    }
	    catch (Exception e) 
	    {
            e.printStackTrace();
        }
	}
	
	private void releaseResources() throws SQLException {
        if(null!=resultSet){
            resultSet.close();
        }
        if(null!=prepStatement){
            prepStatement.close();
        }
        if(null!=statement){
            statement.close();
        }
    }
	
	 private void disconnect() throws SQLException {
         if (connection != null && !connection.isClosed() ) {
             connection.close();
         }
         pool.close();
	 }  
	 
	private List<Map<String, String>> resultSetToList(ResultSet rs) throws SQLException {
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        ResultSetMetaData meta = rs.getMetaData();
        while (rs.next()) {
            Map<String, String> map = new HashMap<String, String>();
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                String key = meta.getColumnName(i);
                String value = rs.getString(key);
                map.put(key, value);
            }
            list.add(map);
        }
        return list;
	}
	
	public List<Map<String, String>> executeQuery(String query)
	{
		List<Map<String, String>> lista = null;
		try
		{
			prepStatement = connection.prepareStatement(query);
			resultSet = prepStatement.executeQuery(query);
			lista = resultSetToList(resultSet);
			releaseResources();
		}
		catch (Exception e) 
	    {
            e.printStackTrace();
        }
		
		return lista;
	}
	
	public void executeUpdate(String query){
		try
		{
			statement = connection.createStatement();
			statement.executeUpdate(query);
			releaseResources();
		}
		catch (Exception e) 
	    {
            e.printStackTrace();
        }
}
		
	public int getLastId(String field, String table){
	int id = 0;
	String query = "SELECT CAST(MAX (" + field + ") AS INT) AS ID FROM " + table;
	try
	{	
		prepStatement = connection.prepareStatement(query);
		resultSet = prepStatement.executeQuery(query);
		while(resultSet.next()){ 
			id = resultSet.getInt("ID");
		}
		releaseResources();
	}
	catch (Exception e) 
    {
        e.printStackTrace();
    }
	
	return id;
	}
	
	@Override
	public void close() throws IOException {
		try {
			disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
