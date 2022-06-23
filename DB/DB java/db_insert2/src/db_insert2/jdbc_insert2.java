package db_insert2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc_insert2{

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
          pstmt = conn.prepareStatement("INSERT INTO dept(dept_no, branch_nm, dept_nm) values(?, ?, ?) ");
          pstmt.setInt(1, 5);
          pstmt.setString(2, "강원지사");
          pstmt.setString(3, "전산팀");
    			result = pstmt.executeUpdate();
    			System.out.println("insert result 1 : "+result);
          pstmt.setInt(1, 6);
          pstmt.setString(2, "제주지사");
          pstmt.setString(3, "전산팀");
    			result = pstmt.executeUpdate();
    			System.out.println("insert result 2 : "+result);
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





