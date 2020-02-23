/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Anirudh
 */
public class DBUtil {
   private static Connection con = null;
    
   static {
      
      try {
         //Registering the HSQLDB JDBC driver
         Class.forName("org.hsqldb.jdbc.JDBCDriver");
         //Creating the connection with HSQLDB
         con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/papdb", "SA", "");
         
      }  catch (Exception e) {
         e.printStackTrace(System.out);
      }
   }
   
   public static ResultSet executeSelect(String sql) throws Exception {
       Statement stmt = con.createStatement();
       return stmt.executeQuery(sql);
   }
   
   public static int executeInsert(String sql) throws Exception {
       Statement stmt = con.createStatement();
       return stmt.executeUpdate(sql);
   }
}