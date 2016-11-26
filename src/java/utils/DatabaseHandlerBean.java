package utils;

import java.util.*;
import java.sql.*;
import java.util.HashMap;

public class DatabaseHandlerBean {

    String l_driver = "com.mysql.jdbc.Driver";
    String l_URL = "jdbc:mysql://localhost:";
    String PORT = "3306";
    String USER = "root";
    String PASS = "";
    String DATABASE_NAME = "xyz_assoc";
    
    Connection connection = null; // JDBC Connection
    java.sql.Statement sqlStatement = null; // JDBC Statement
    ResultSet resultSet = null; // JDBC Result Set
    ResultSetMetaData resultMetaData = null; // Meta Data
    String NOWT = "---";// null marker

    public DatabaseHandlerBean() {
        // Constructor
        l_URL = l_URL + PORT + "/" + DATABASE_NAME;
    }
    
    /**
     * Initialise the connection to the Database
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public void connect() throws ClassNotFoundException, SQLException {
        String l_UID = USER; // Database UserID
        String l_PWD = PASS; // Database Password

        // Load the PointBase JDBC Driver
        Class.forName(l_driver);

        // Establish connection and return a Connection object
        connection = DriverManager.getConnection(l_URL, l_UID, l_PWD);

        System.out.println(connection.toString());
    }
    /**
     * Close the database connection.
     * @throws Exception 
     */
    public void close() throws Exception {
        connection.close();// Close the connection
    }
    
    /**
     * Run a query on the database Returning a parsed results set.
     * 
     * @param query - SQL query to run
     * @return ArrayList<HashMap<String, String>>
     * The key in the HashMap is the column name, null if no results found
     * @throws Exception 
     */
    public ArrayList<HashMap<String, String>> getResultsSet (String query) throws SQLException{
        ArrayList<HashMap<String, String>> results = new ArrayList<HashMap<String, String>>();
        int resultColumns = 0;
        sqlStatement = connection.createStatement();
        
        resultSet = sqlStatement.executeQuery(query);
        resultMetaData = resultSet.getMetaData();
        
        resultColumns = resultMetaData.getColumnCount();
        
        while (resultSet.next()){
            HashMap<String,String> resultHash = new HashMap<String,String>();
                //Add a column ArrayList if one does not already exist
            for(int i = 1; i <= resultColumns; ++i){    
                String value = resultSet.getString(i);
                
                if(resultSet.wasNull() || value.equals("")){
                    value = NOWT;
                }
                resultHash.put(resultMetaData.getColumnName(i), value);
            }
            results.add(resultHash);
        }
        
        return results;
    }

    public void executeQuery(String query) throws SQLException{
        sqlStatement = connection.createStatement();       
        sqlStatement.execute(query);
    }
    
    public String getPORT() {
        return PORT;
    }
} //class
