import java.sql.*;

public class jdbc_ex3{

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
       	  System.out.println("실습10");
    	  System.out.println();
    	  
          pstmt = conn.prepareStatement("UPDATE goods SET goods_nm = ? WHERE goods_no = ? ");
          pstmt.setString(1, "빈츠");
          pstmt.setInt(2, 10);
    			result = pstmt.executeUpdate();
    			System.out.println("Update result : "+result);
    			
    	  System.out.println();
    	  System.out.println("실습11");
    	  System.out.println();
    	  //Select replace('원래컬럼내용','내용(from)','없음(to)');
    	  pstmt2 = conn.prepareStatement("UPDATE dept SET branch_nm = ? WHERE branch_nm = ?");
    	  pstmt2.setString(1, "대전점");
    	  pstmt2.setString(2, "대전지사");
    	  		result = pstmt2.executeUpdate();
    	  		System.out.println("Update : " + result2);
    	  		
    	  System.out.println();
          System.out.println("실습12");
          System.out.println();
          
          pstmt3 = conn.prepareStatement("INSERT INTO emp VALUES(?, ?, ?, ?, ?, ?)");
          
          pstmt3.setInt(1, 16);
          pstmt3.setString(2, "바이름");
          pstmt3.setInt(3, 40);
          pstmt3.setInt(4, 3);
          pstmt3.setString(5, "과장");
          pstmt3.setDouble(6, 5500000);
          	result2 = pstmt2.executeUpdate();
          	System.out.println("Update insert : " + result2);
          
          StringBuffer sql = new StringBuffer("");
          sql.append("UPDATE dept ");
          sql.append("SET emp_cnt = (SELECT COUNT(*) FROM emp WHERE dept_no = ?) where dept_no = ?");
          pstmt4 = conn.prepareStatement(sql.toString());
          pstmt4.setInt(1, 2);
          pstmt4.setInt(2, 2);
          	result3 = pstmt4.executeUpdate();
          	System.out.println("Update dept: " +result3);
          	
          	//지사별 직원수 출력
          	pstmt5 = conn.prepareStatement("SELECT dept_no, COUNT(*) FROM emp group by dept_no");
          	rsTable = pstmt5.executeQuery();
          	for(; rsTable != null && rsTable.next();) {
          		System.out.println(rsTable.getInt(1)+"\t"+rsTable.getInt(2));
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


