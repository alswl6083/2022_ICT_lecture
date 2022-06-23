import java.sql.*;

public class jdbc_resultSet{

  public static void main(String[] args) {
    try{
  		Connection conn = null;
  		String url= "jdbc:mariadb://127.0.0.1:3307/test_user";
  		Statement stmt = null;
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
    			rsTable = stmt.executeQuery("SELECT C_ID, C_NAME, C_MOBILE, AGE FROM CUSTOMER WHERE AGE > 30 ");
    			for(int i = 0; rsTable != null && rsTable.next()== true; i++){
    			  System.out.println(i+":"+rsTable.getString(1)+"\t"+rsTable.getString(2));
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


