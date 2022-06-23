import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_ex{

  public static void main(String[] args) {
    try{
  		Connection conn = null;
  		String url= "jdbc:mariadb://127.0.0.1:3307/test_user";
  		PreparedStatement stmt = null;
  		PreparedStatement stmt2 = null;
  		PreparedStatement stmt3 = null;
  		PreparedStatement stmt4 = null;
  		ResultSet rsTable = null;
  		ResultSet rsTable2 = null;
  		ResultSet rsTable3 = null;
  		ResultSet rsTable4 = null;

  		try{
  		  Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("Connect.....");
        conn=DriverManager.getConnection(url,"root","0805");
        if( conn == null ) {
          System.out.println("Not connected!!!");
        }else{
          System.out.println("Connected!!!");
          //stringbuffer 이용 - 성능 더 좋음
          StringBuffer sql = new StringBuffer("");
          sql.append("SELECT a.C_ID, a.C_NAME, a.AGE, COUNT(*) as cnt ");
          sql.append("FROM CUSTOMER as a ");
          sql.append("inner join voucher as b ");
          sql.append("ON a.c_id =b.c_id ");
          sql.append("GROUP BY b.c_id");
          stmt = conn.prepareStatement(sql.toString());
          //stringbuffer 끝
          System.out.println();
          System.out.println("실습3");
          System.out.println();
    			rsTable = stmt.executeQuery();
    			for(int i = 0; rsTable != null && rsTable.next(); i++){
    			  System.out.println(rsTable.getString("C_id")+"\t"+rsTable.getString("C_name")+"\t"+rsTable.getString("age")+"\t"+rsTable.getString("cnt"));
    			}
    			System.out.println();
    			System.out.println("실습4");
    			System.out.println();
    	 stmt2 = conn.prepareStatement("select * from voucher");
    	 		rsTable2 = stmt2.executeQuery();
    	 		for(int i = 0; rsTable2 != null && rsTable2.next(); i++){
      			  System.out.println(rsTable2.getString(1)+"\t"+rsTable2.getString(2)+"\t"+rsTable2.getString(3));
      			}
    	 		System.out.println();
    	 		System.out.println("실습5");
    	 		System.out.println();
    	 stmt3 = conn.prepareStatement("select * from dept");
    	 		rsTable3 = stmt3.executeQuery();
    	 		for(; rsTable3 != null && rsTable3.next();) {
    	 			System.out.println(rsTable3.getString(1)+"\t"+rsTable3.getString(2)+"\t"+rsTable3.getString(3));
    	 		}
    	 		System.out.println();
    	 		System.out.println("실습6");
    	 		System.out.println();
    	 StringBuffer sql2 = new StringBuffer("");
    	 	sql2.append("SELECT sale_store, SUM(quantity) AS 'quantity' ");
    	 	sql2.append("FROM sales ");
    	 	sql2.append("GROUP BY sale_store");
    	 stmt4 = conn.prepareStatement(sql2.toString());
    	 		rsTable4 = stmt4.executeQuery();
    	 		for(; rsTable4 != null && rsTable4.next();) {
    	 			System.out.println(rsTable4.getString(1)+"\t"+rsTable4.getString("quantity"));
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



