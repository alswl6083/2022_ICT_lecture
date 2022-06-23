package database;

import java.sql.*;


public class jdbc_test {

	  public static void main(String[] args) {
		    try{
		  		Connection conn = null;
		  		String url= "jdbc:mariadb://127.0.0.1:3307/test_user";
		  		PreparedStatement stmt = null;
		  		PreparedStatement stmt2 = null;
		  		ResultSet rsTable = null;
		  		ResultSet rsTable2 = null;

		  		try{
		  		  Class.forName("org.mariadb.jdbc.Driver");
		        System.out.println("Connect.....");
		        conn=DriverManager.getConnection(url,"root","0805");
		        if( conn == null ) {
		          System.out.println("Not connected!!!");
		        }else{
		          System.out.println("Connected!!!");
		          stmt = conn.prepareStatement("SELECT COUNT(*) FROM VOUCHER ");
		    			rsTable = stmt.executeQuery();
		    			if( rsTable != null && rsTable.next()){
		    			  System.out.println("voucher result table row count:"+rsTable.getInt(1));
		    			}
		    	//customer 테이블 추가
		    	 stmt2 = conn.prepareStatement("SELECT COUNT(*) FROM CUSTOMER");
		    	 		rsTable2 = stmt2.executeQuery();
		    	 		if( rsTable2 != null && rsTable2.next()){
			    			  System.out.println("customer result table row count:"+rsTable2.getInt(1));
			    			}
		    	//끝 		
		    		}
		  		}catch(Exception e){
		  			System.out.println("error:"+e.toString());
		  		}finally{
		  		  if( stmt != null ) stmt.close();
		  		  if( rsTable != null ) rsTable.close();
		  		  if( conn != null ) conn.close();
		  		}
		    }catch(Exception exx){
		      System.out.println("error : " + exx.toString());
		    }
		  }
		}


