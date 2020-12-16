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
public class DbmsConnection {

    private String conDB = "jdbc:sqlserver://localhost:1433;user=sa;password=";
    private Connection con;
    final String DEFAULT_DATABASE = "Hotema";

    public DbmsConnection(String password) {
        this.conDB = this.conDB + password + ";" + "databaseName=master;";
//        EXCEPTION HANDLING
        try {
//            Setting Sql-server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        Getting Connection
            this.con = (Connection) DriverManager.getConnection(this.conDB);
            System.out.println(this.con + " Success");
        } catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: " + cE.toString());
        }

    }

//    IMPLEMENTED BY SARDAR BADAR
//FIRST :ALWAYS USE THIS FUNCTION TO CONNECT DATA THAN USE QUERY FUNCTION TO EXCUTE SQL QUERY
    public void getDatabaseConnection() {
        Statement stmt = null;
//            ResultSet rs=null;
//          SQL query command
        String SQL = "CREATE DATABASE " + DEFAULT_DATABASE + ";" + "USE " + DEFAULT_DATABASE + ";";
        try {

            stmt = this.con.createStatement();
            stmt.executeUpdate(SQL);
//             con.commit();
            System.out.println(this.con + " Successfully Create ");

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
            try {
                stmt.executeUpdate("USE " + DEFAULT_DATABASE);
                System.out.println("USING " + DEFAULT_DATABASE);
            } catch (SQLException ee) {
                System.out.println("SQ EXCEPTION " + ee.toString());
            }

        }
//            System.out.println(rs);
//            while (rs.next()) {
//                System.out.println(rs.getString("ProductName") + " : " + rs.getString("UnitPrice"));
//            }

    }

//    IMPLEMENTED BY SARDAR BADAR
    public void getDatabaseConnection(String database) {

        Statement stmt = null;
//            ResultSet rs=null;
//          SQL query command
        String SQL = "CREATE DATABASE " + database + ";";
        try {

            stmt = this.con.createStatement();

            stmt.executeUpdate(SQL);
            stmt.executeUpdate("USE " + database + ";");
//             con.commit();
            System.out.println(this.con + " Successfully Create ");

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
            try {
                stmt.executeUpdate("USE " + database);
                System.out.println("USING " + database);
            } catch (SQLException ee) {
                System.out.println("SQL EXCEPTION " + ee.toString());;
            }
        }


    }

//CREATE, UPDATE AND DELETE QUERY SUPPORT. SELECT STATEMENT IS NOT SUPPORT IN THIS FUNCTION
    public void cudQuery(String statements) {

//        System.out.println(statements);
       
       
            try {
                 Statement stmt = this.con.createStatement();
                stmt.executeUpdate(statements);

                con.commit();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

    public static void main(String[] args) {
                DbmsConnection hotema = new DbmsConnection("Alirohan11");
        String qurey = "USE DreamHome;Drop DATABASE hotema;";
        hotema.cudQuery(qurey);
        hotema.getDatabaseConnection();
    } 
}
