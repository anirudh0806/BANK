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

import org.hsqldb.server.Server;


/**
 *
 * @author Anirudh
 */
public class DBUtil {
	
   private static Connection con = null;
    
   static {
      
	   System.out.println("Calling static block");
      try {
    	  Server server = new Server();
    	  server.setDatabaseName(0, "papdb");
    	  server.setDatabasePath(0, "file:hsqldb/papdb");//"mem:papdb");
    	  server.setPort(9001); // this is the default port
    	  server.start();
    	  
         //Registering the HSQLDB JDBC driver
         Class.forName("org.hsqldb.jdbc.JDBCDriver");
         //Creating the connection with HSQLDB
         //con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/papdb", "SA", "");
         
         String url="jdbc:hsqldb:hsql://localhost:9001/papdb";
         Class.forName("org.hsqldb.jdbc.JDBCDriver");
         con = DriverManager.getConnection(url, "SA", "");
         
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