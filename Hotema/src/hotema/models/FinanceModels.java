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
import java.util.*;

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
       
        List<String> roomList=new ArrayList<String>(); 
        List<String> maxPriceList=new ArrayList<String>(); 
        List<String> currentPriceList = new ArrayList<String>();
                List<String> revenuList = new ArrayList<String>(); 

                        List<String> bookingList = new ArrayList<String>(); 


        ResultSet rs =  super.selectQuery(Constants.SELECT_DAILY_FINANCE);
        try {
          while( rs.next()) {
         
         roomList.add(rs.getString("roomNO").toString());
         maxPriceList.add(rs.getString("highestPrice").toString());
         currentPriceList.add(rs.getString("currentPrice").toString());
         revenuList.add(rs.getString("revenu").toString());
         bookingList.add(rs.getString("booking").toString());
       

//    DISTINCT a.roomId as roomNO , b.maxPrice as highestPrice, r.price_r as currentPrice, \n" +
//"b.revenu as revenu,\n" +
//"b.countr as booking\n"     
          
        }rs.close();  
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
            for (int i = 0; i < roomList.size(); i++) {
                System.out.println(roomList.get(i)+" "+maxPriceList.get(i)+currentPriceList.get(i)+revenuList.get(i)+bookingList.get(i));
                
            }
        
        return "dd" ;      
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
