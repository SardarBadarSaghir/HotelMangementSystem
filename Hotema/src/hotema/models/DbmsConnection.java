/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotema.models;

import java.sql.*;


/**
 *
 * @author badar
 */
//Implemented By sardar Badar

public class DbmsConnection{
    
    private String conDB ="jdbc:sqlserver://localhost:1433;user=sa;password=";
    private Connection con;
    
    public DbmsConnection(String password) {
        this.conDB=this.conDB+password+";"+"databaseName=master;";
//        EXCEPTION HANDLING
        try {
//            Setting Sql-server
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        Getting Connection
        this.con = (Connection) DriverManager.getConnection(this.conDB);
            System.out.println(this.con);
        } catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }
        
    }
    
    public Connection getConnection(){
        return this.con;
    }
    
    
    public static void main(String[] args) {
      DbmsConnection hotema = new DbmsConnection("Alirohan11");

    }
      
}
