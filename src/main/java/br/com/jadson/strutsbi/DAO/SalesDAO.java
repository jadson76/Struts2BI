package br.com.jadson.strutsbi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.jadson.strutsbi.beans.Sales;

public class SalesDAO {
	
	private static Logger logger = LoggerFactory.getLogger(SalesDAO.class);
	

	public List<Sales> getLast6MonthSales(String iniDate, String endDate) throws SQLException {
		List<Sales> lastMonth = new ArrayList<Sales>();				
		Connection conn = HikariCPDataSource.getConnection();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		//DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			pstm = conn.prepareStatement("select * from struts_bi.sales where sales_date between ? and ? order by id ");
			pstm.setDate(1, new java.sql.Date(fmt.parse(iniDate).getTime()));
			pstm.setDate(2, new java.sql.Date(fmt.parse(endDate).getTime()));
			rs = pstm.executeQuery();
			 while (rs.next()) {
				 Sales sales = new Sales();
	             sales.setMonth(rs.getString("month"));
	             sales.setTotal(rs.getDouble("total"));
	             lastMonth.add(sales);
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

}
