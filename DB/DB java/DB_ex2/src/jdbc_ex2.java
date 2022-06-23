import java.sql.*;

public class jdbc_ex2 {
	public static void main(String[] args) {
	    try{
	  		Connection conn = null;
	  		String url= "jdbc:mariadb://127.0.0.1:3307/test_user";
	  		PreparedStatement pstmt = null;
	  		PreparedStatement pstmt2 = null;
	  		ResultSet rsTable2 = null;
	  		int result = 0;

	  		try{
	  		  Class.forName("org.mariadb.jdbc.Driver");
	        System.out.println("Connect.....");
	        conn=DriverManager.getConnection(url,"root","0805");
	        if( conn == null ) {
	          System.out.println("Not connected!!!");
	        }else{
	          System.out.println("Connected!!!");
	        //실습 7
	          pstmt = conn.prepareStatement("INSERT INTO emp values(?, ?, ?, ?, ?, ?) ");
	          pstmt.setInt(1, 11);
	          pstmt.setString(2, "김이름");
	          pstmt.setInt(3, 30);
	          pstmt.setInt(4, 6);
	          pstmt.setString(5, "부장");
	          pstmt.setDouble(6, 7000000);
	    			result = pstmt.executeUpdate();
	    			System.out.println("insert result 1 : "+result);
	    		}
	        //실습 8
	          pstmt.setInt(1, 12);
	          pstmt.setString(2, "나이름");
	          pstmt.setInt(3, 31);
	          pstmt.setInt(4, 4);
	          pstmt.setString(5, "차장");
	          pstmt.setDouble(6, 6000000);
	          		result = pstmt.executeUpdate();
	  	      pstmt.setInt(1, 13);
		      pstmt.setString(2, "다이름");
		      pstmt.setInt(3, 32);
		      pstmt.setInt(4, 4);
		      pstmt.setString(5, "과장");
	          pstmt.setDouble(6, 6500000);
		          		result = pstmt.executeUpdate();     	
		      pstmt.setInt(1, 14);
              pstmt.setString(2, "라이름");
              pstmt.setInt(3, 32);
              pstmt.setInt(4, 4);
		      pstmt.setString(5, "사원");
		      pstmt.setDouble(6, 5000000);
		  	          		result = pstmt.executeUpdate();
		  	 //실습9
		      pstmt.setInt(1, 12);
		      pstmt.setString(2, "나이름");
		      pstmt.setInt(3, 31);
		      pstmt.setInt(4, 5);
		      pstmt.setString(5, "차장");
		      pstmt.setDouble(6, 6000000);
		  		          		result = pstmt.executeUpdate();	
		      StringBuffer sql = new StringBuffer("");
		      sql.append("SELECT COUNT(*) AS 'cnt' ");
		      sql.append("FROM emp ");
		      sql.append("WHERE dept_no = 5");
		      pstmt2 = conn.prepareStatement(sql.toString());
		      rsTable2 = pstmt2.executeQuery();
		      for(; rsTable2 != null && rsTable2.next();) {
		    	  System.out.println("강원지사 직원의 수는 : "+rsTable2.getInt(1));
		      }
		      
		  		          		
	  		}catch(Exception e){
	  			System.out.println("error:"+e.toString());
	  		}finally{
	  		  if( pstmt != null ) pstmt.close();
	  		  if( conn != null ) conn.close();
	  		}
	    }catch(Exception exx){
	      System.out.println("error : " + exx.toString());
	    }
	  }
}
