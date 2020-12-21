/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotema.models;
/**
 *
 * @author badar
 */
import java.sql.*;

public class FinanceModels extends DbmsConnection{

    public FinanceModels(String password) {
        super(password);
        super.getDatabaseConnection("hotma");        
        //table creation if not exists
        super.cudQuery(Constants.CREATE_TABLES_QUERY);
        
       
    }
    
        public void insertData(){
//        INSERT DATA 
        
    }
//   todo:ASSIGN TO AWAIS
    public String getMonthlyFinanceData(){
//      IMPLEMENT TEST TO GET DATA
        return null;
//      IMPLEMENT TEST TO GET DATA
   
    }
    
//   todo:ASSIGN TO BADAR
        public String getDailyFinanceData(){
//      IMPLEMENT TEST TO GET DATA
         String get ="";
        ResultSet rs =  super.selectQuery(Constants.SELECT_DAILY_FINANCE);
        try {
          while( rs.next()) {
         get =  rs.getString("roomNO").toString();
              System.out.println(get);
          
        }rs.close();  
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        
        return get ;      
    }
//   todo:ASSIGN TO HASSAN ALI JADOON

       public String[] getAnnualFinanceData(){
//      IMPLEMENT TEST TO GET DATA
        String[] get = {"hi", "How"};
        return get;      
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      FinanceModels hotema = new FinanceModels("Alirohan11");
      hotema.getDailyFinanceData();
//        System.out.println(Constants.CREATE_TABLES_QUERY);
//  String qurey = "USE DreamHome; Drop DATABASE Fun;";
//        hotema.cudQuery(qurey);
    }
    
 
}
