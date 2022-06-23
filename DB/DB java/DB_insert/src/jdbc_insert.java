import java.sql.*;

public class jdbc_insert{

  public static void main(String[] args) {
    try{
  		Connection conn = null;
  		String url= "jdbc:mariadb://127.0.0.1:3307/test_user";
  		Statement stmt = null;
  		int result = 0;

  		try{
  		  Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("Connect.....");
        conn=DriverManager.getConnection(url,"root","0805");
        if( conn == null ) {
          System.out.println("Not connected!!!");
        }else{
          System.out.println("Connected!!!");
          stmt = conn.createStatement();
    			result = stmt.executeUpdate("INSERT INTO dept(dept_no, branch_nm, dept_nm) values(4, '서울지사', '전산팀') ");
    			System.out.println("insert result : "+result);
    		}
  		}catch(Exception e){
  			System.out.println("error:"+e.toString());
  		}finally{
  		  if( stmt != null ) stmt.close();
  		  if( conn != null ) conn.close();
  		}
    }catch(Exception exx){
      System.out.println("error : " + exx.toString());
    }
  }
}


