package br.com.jadson.strutsbi.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPDataSource {
	
	private static Logger logger = LoggerFactory.getLogger(HikariCPDataSource.class);
	
	  private static HikariConfig config = new HikariConfig();
	    private static HikariDataSource ds;
	    
	    static {
	    	try {
	    		config.setJdbcUrl("jdbc:mysql://localhost:3306/struts_bi");
	    		config.setUsername("root");
	    		config.setDriverClassName("com.mysql.jdbc.Driver");
	    		config.setPassword("Ricardo@279");
	    		config.addDataSourceProperty("cachePrepStmts", "true");
	    		config.addDataSourceProperty("prepStmtCacheSize", "250");
	    		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
	    		ds = new HikariDataSource(config);
	    	}catch(Throwable t) {
	    		logger.error(t.getMessage());
	    	}
	    }
	    
	    public static Connection getConnection() throws SQLException {
	        return ds.getConnection();
	    }
	    
	    private HikariCPDataSource(){}

}
