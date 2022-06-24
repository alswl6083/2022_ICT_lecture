import java.sql.*;

public class jdbc_ex5{

  public static void main(String[] args) {
    try{
  		Connection conn = null;
  		String url= "jdbc:mariadb://127.0.0.1:3307/test_user";
  		PreparedStatement pstmt = null;
  		PreparedStatement pstmt2 = null;
  		PreparedStatement pstmt3 = null;
  		PreparedStatement pstmt4 = null;
  		PreparedStatement pstmt5 = null;
  		int result = 0;
  		int result2 = 0;
  		int result3 = 0;
  		int result4 = 0;
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
       	  System.out.println("실습16");
    	  System.out.println();
          try{
            conn.setAutoCommit(false);
      			pstmt = conn.prepareStatement("INSERT INTO dept values(?, ?, ? ,?) ");
            pstmt.setInt(1, 7);
            pstmt.setString(2, "부산지사");
            pstmt.setString(3, "전산팀");
            pstmt.setInt(4, 5);
      			result = pstmt.executeUpdate();

      			System.out.println("dept insert result : "+result);
      			pstmt2 = conn.prepareStatement("INSERT INTO emp values(?, ?, ?, ?, ?, ? ) ");
            pstmt2.setInt(1, 22);
            pstmt2.setString(2, "바이름");
            pstmt2.setInt(3, 45);
            pstmt2.setInt(4, 5);
            pstmt2.setString(5, "사원");
            pstmt2.setDouble(6, 3000000);
      			result3 = pstmt2.executeUpdate();
      			System.out.println("emp insert result : "+result2);
      	
            System.out.println();
            System.out.println("실습17");
          	System.out.println();
          	
    		pstmt3 = conn.prepareStatement("INSERT INTO customer(c_id, c_name, c_mobile, age) values(?, ?, ? ,?) ");
            pstmt3.setString(1, "24");
            pstmt3.setString(2, "멀티");
            pstmt3.setString(3, "010-1111-1111");
            pstmt3.setString(4, "35");
      			result3 = pstmt3.executeUpdate();

      			System.out.println("customer insert result : "+result3);
      			pstmt4 = conn.prepareStatement("INSERT INTO voucher(c_id, voucher_amount,issue_date) values(?, ? ,now()) ");
            pstmt4.setString(1, "24");
            pstmt4.setString(2, "50000");
      			result4 = pstmt4.executeUpdate();
      			System.out.println("voucher insert result : "+result4);
      			
      			pstmt5 = conn.prepareStatement("SELECT COUNT(*) FROM voucher WHERE c_id");
      			rsTable = pstmt5.executeQuery();
      			rsTable.next();
      			
      			if(rsTable.getInt(1) >= 30 ) {
      				conn.rollback();
      			};
      			
      			conn.commit();
      		}catch(Exception ex){
      		  conn.rollback();
      		  System.out.println("error: "+ex.toString());
      		}finally{
      		  conn.setAutoCommit(true);
      		}
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


