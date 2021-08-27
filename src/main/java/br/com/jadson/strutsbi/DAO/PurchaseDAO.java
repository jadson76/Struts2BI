package br.com.jadson.strutsbi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.jadson.strutsbi.beans.Purchase;

public class PurchaseDAO {
	
	private static Logger logger = LoggerFactory.getLogger(PurchaseDAO.class);

	public List<Purchase> getLastMonthPurchases() throws SQLException {
		List<Purchase> lastMonth = new ArrayList<Purchase>();
		Connection conn = HikariCPDataSource.getConnection();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		
		try {
			pstm = conn.prepareStatement("SELECT * FROM struts_bi.purchases WHERE date BETWEEN DATE_FORMAT(NOW() - INTERVAL 1 MONTH, '%Y-%m-01 00:00:00')"
					+ "AND DATE_FORMAT(LAST_DAY(NOW() - INTERVAL 1 MONTH), '%Y-%m-%d 23:59:59') ");		
			rs = pstm.executeQuery();
			 while (rs.next()) {
				 Purchase p = new Purchase();
	             p.setPurchaseNumber(rs.getString("id"));
	             java.sql.Date dbSqlDate = rs.getDate("date");
	             p.setDate(new java.util.Date(dbSqlDate.getTime()));
	             p.setItem(rs.getString("item"));
	             p.setTotal(rs.getDouble("total"));	            
	             lastMonth.add(p);
	          }
			
		}catch(Exception sqlException) {
			sqlException.printStackTrace();
			logger.error(sqlException.getMessage());
			conn.rollback();
		}finally {
			try {               
                if(rs != null) {
                    rs.close();
                }                
                if(pstm != null) {
                    pstm.close();
                }                
                if(conn != null) {
                    conn.close();
                }
            } catch(Exception sqlException) {
                sqlException.printStackTrace();
                logger.error(sqlException.getMessage());
            }			
		}	
	
		return lastMonth;
	}

	public List<Purchase> getActualMonthPurchases() throws SQLException {
		List<Purchase> actualMonth = new ArrayList<Purchase>();
		Connection conn = HikariCPDataSource.getConnection();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		
		try {
			pstm = conn.prepareStatement("SELECT * FROM struts_bi.purchases WHERE date >= date_sub(current_date, INTERVAL 1 MONTH)");		
			rs = pstm.executeQuery();
			 while (rs.next()) {
				 Purchase p = new Purchase();
	             p.setPurchaseNumber(rs.getString("id"));
	             java.sql.Date dbSqlDate = rs.getDate("date");
	             p.setDate(new java.util.Date(dbSqlDate.getTime()));
	             p.setItem(rs.getString("item"));
	             p.setTotal(rs.getDouble("total"));	            
	             actualMonth.add(p);
	          }
			
		}catch(Exception sqlException) {
			sqlException.printStackTrace();
			conn.rollback();
		}finally {
			try {               
                if(rs != null) {
                    rs.close();
                }                
                if(pstm != null) {
                    pstm.close();
                }                
                if(conn != null) {
                    conn.close();
                }
            } catch(Exception sqlException) {
                sqlException.printStackTrace();
            }			
		}	
		return actualMonth;
	}

	public List<Purchase> getYearPurchases() throws SQLException {
		List<Purchase> year = new ArrayList	<Purchase>();
		Connection conn = HikariCPDataSource.getConnection();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		
		try {
			pstm = conn.prepareStatement("SELECT * FROM struts_bi.purchases WHERE YEAR(date) = 2021");		
			rs = pstm.executeQuery();
			 while (rs.next()) {
				 Purchase p = new Purchase();
	             p.setPurchaseNumber(rs.getString("id"));
	             java.sql.Date dbSqlDate = rs.getDate("date");
	             p.setDate(new java.util.Date(dbSqlDate.getTime()));
	             p.setItem(rs.getString("item"));
	             p.setTotal(rs.getDouble("total"));	            
	             year.add(p);
	          }
			
		}catch(Exception sqlException) {
			sqlException.printStackTrace();
			conn.rollback();
		}finally {
			try {               
                if(rs != null) {
                    rs.close();
                }                
                if(pstm != null) {
                    pstm.close();
                }                
                if(conn != null) {
                    conn.close();
                }
            } catch(Exception sqlException) {
                sqlException.printStackTrace();
            }			
		}	
		return year;
	}

}
