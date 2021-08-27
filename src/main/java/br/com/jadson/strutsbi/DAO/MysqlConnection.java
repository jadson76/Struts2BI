package br.com.jadson.strutsbi.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;


public class MysqlConnection {
	
    // JDBC Driver Name & Database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/struts_bi";
 
    // JDBC Database Credentials
    static final String JDBC_USER = "root";
    static final String JDBC_PASS = "Ricardo@279";
 
    private static BasicDataSource ds = new BasicDataSource();
    
    static {
    	ds.setDriverClassName(JDBC_DRIVER);
        ds.setUrl("JDBC_DB_URL");
        ds.setUsername(JDBC_USER);
        ds.setPassword("JDBC_PASS");
        ds.setMinIdle(5);
        ds.setMaxIdle(10);
        ds.setMaxOpenPreparedStatements(10);
    }
    
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}


