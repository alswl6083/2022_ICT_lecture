import java.sql.*;

public class jdbc_ex4{

  public static void main(String[] args) {
    try{
  		Connection conn = null;
  		String url= "jdbc:mariadb://127.0.0.1:3307/test_user";
  		PreparedStatement pstmt = null;
  		PreparedStatement pstmt2 = null;
  		PreparedStatement pstmt3 = null;
  		PreparedStatement pstmt4 = null;
  		PreparedStatement pstmt5 = null;
  		PreparedStatement pstmt6 = null;
  		PreparedStatement pstmt7 = null;
  		int result = 0;
  		int result2 = 0;
  		int result3 = 0;
  		int result4 = 0;
  		int result5 = 0;
  		ResultSet rsTable = null;
  		

  		try{
  		  Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("Connect.....");
        conn=DriverManager.getConnection(url,"root","0805");
        if( conn == null ) {
          System.out.println("Not connected!!!");
        }else{
          System.out.println("Connected!!!");
          System.out.println();
       	  System.out.println("실습13");
    	  System.out.println();
          pstmt = conn.prepareStatement("DELETE FROM emp WHERE emp_no = ? ");
          pstmt.setInt(1, 12);
    			result = pstmt.executeUpdate();
    			System.out.println("Delete result : "+result);
    			
    	  System.out.println();
    	  System.out.println("실습14");
    	  System.out.println();
    	  //voucher테이블꺼도 삭제
    	  pstmt2 = conn.prepareStatement("DELETE FROM customer WHERE c_id = ?");
    	  pstmt2.setInt(1, 1);
    	  		result2 = pstmt2.executeUpdate();
    	  		System.out.println("delete result : " + result2);
    	  pstmt3 = conn.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?,?)");
    	  pstmt3.setInt(1,1);
    	  pstmt3.setString(2,"김고객");
    	  pstmt3.setString(3, "010-8841-1234");
    	  pstmt3.setString(4, "VIP");
    	  pstmt3.setString(5,"12345");
    	  pstmt3.setInt(6, 21);
    	  		result3 = pstmt3.executeUpdate();
    	  		System.out.println("Insert : " + result3);
    	 		
    	  System.out.println();
    	  System.out.println("실습15");
    	  System.out.println();
    	  
    	  
    	  pstmt6 = conn.prepareStatement("SELECT * FROM emp WHERE emp_no = ?");
    	  pstmt6.setInt(1, 15);
    	  rsTable = pstmt6.executeQuery();
    	  if(rsTable != null && rsTable.next() && rsTable.getInt(1) == 15) {
    		  pstmt4 = conn.prepareStatement("DELETE FROM emp WHERE emp_no = ?");
    		  pstmt4.setInt(1, 15);
    		  result4 = pstmt4.executeUpdate();
    		  System.out.println("delete : " + result4);
    	  }
		  pstmt5 = conn.prepareStatement("INSERT INTO emp VALUES(?,?,?,?,?,?)");
		  pstmt5.setInt(1,15);
		  pstmt5.setString(2, "바이름");
		  pstmt5.setInt(3, 42);
		  pstmt5.setInt(4, 5);
		  pstmt5.setString(5, "대리");
		  pstmt5.setDouble(6,4500000);
		  result5 = pstmt5.executeUpdate();
		  System.out.println("insert : " + result5);
    	  
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


