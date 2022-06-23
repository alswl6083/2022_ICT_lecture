import java.sql.*;

public class jdbc_statement {

  public static void main(String[] args) {
    try{
  		Connection conn = null;
  		String url= "jdbc:mariadb://127.0.0.1:3307/test_user";
  		Statement stmt = null;
  		PreparedStatement pstmt = null;
  		ResultSet rsTable = null;

  		try{
  		  Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("Connect.....");
        conn=DriverManager.getConnection(url,"root","0805");
        if( conn == null ) {
          System.out.println("Not connected!!!");
        }else{
          System.out.println("Connected!!!");
          stmt = conn.createStatement();
    			rsTable = stmt.executeQuery("SELECT COUNT(*) FROM CUSTOMER WHERE AGE > 30 ");
    			if( rsTable != null && rsTable.next()){
    			  System.out.println("Statement :"+rsTable.getInt(1));
    			}
    			
    			pstmt = conn.prepareStatement("SELECT COUNT(*) FROM CUSTOMER WHERE AGE > ? ");
    			pstmt.setInt(1, 20);
    			rsTable = pstmt.executeQuery();
    			if( rsTable != null && rsTable.next()){
    			  System.out.println("PreparedStatement :"+rsTable.getInt(1));
    			}
    			pstmt.setInt(1, 30);
    			rsTable = pstmt.executeQuery();
    			if( rsTable != null && rsTable.next()){
    			  System.out.println("PreparedStatement :"+rsTable.getInt(1));
    			}
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


