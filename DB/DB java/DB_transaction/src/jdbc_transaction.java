import java.sql.*;

public class jdbc_transaction{

  public static void main(String[] args) {
    try{
  		Connection conn = null;
  		String url= "jdbc:mariadb://127.0.0.1:3307/test_user";
  		PreparedStatement pstmt = null;
  		int result = 0;

  		try{
  		  Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("Connect.....");
        conn=DriverManager.getConnection(url,"root","0805");
        if( conn == null ) {
          System.out.println("Not connected!!!");
        }else{
          System.out.println("Connected!!!");
          try{
            conn.setAutoCommit(false);
      			pstmt = conn.prepareStatement("INSERT INTO customer(c_id, c_name, c_mobile, age) values(?, ?, ? ,?) ");
            pstmt.setString(1, "22");
            pstmt.setString(2, "multy");
            pstmt.setString(3, "010-1111-1111");
            pstmt.setString(4, "35");
      			result = pstmt.executeUpdate();

      			System.out.println("customer insert result : "+result);
      			pstmt = conn.prepareStatement("INSERT INTO voucher(c_id, voucher_amount,issue_date) values(?, ? ,now()) ");
            pstmt.setString(1, "22");
            pstmt.setString(2, "dadsda");
      			result = pstmt.executeUpdate();
      			System.out.println("voucher insert result : "+result);
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


