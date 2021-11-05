
package RoomType;

import java.sql.*;



public class MySQLConnection {
    public static Connection  getConnection(){
        
    Connection con = null;
    try{  
        
    Class.forName("com.mysql.cj.jdbc.Driver"); 
    String DBURL ="jdbc:mysql://localhost:3306/";
    con = DriverManager.getConnection(DBURL,"root","Ss12345*");
    
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    return con;
    }
}
