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
import static hotema.models.Constants.SELECT_DAILY_FINANCE;
import java.sql.*;
import java.util.*;

public class FinanceModels extends DbmsConnection {

    public FinanceModels(String password) {
        super(password);
        super.getDatabaseConnection("hotma");
        //table creation if not exists
        super.cudQuery(Constants.CREATE_TABLES_QUERY);

    }

    public void insertData() {
//        INSERT DATA 

    }
//   todo:ASSIGN TO AWAIS

    public Dictionary<Integer, List> getMonthlyFinanceData() {
//      IMPLEMENT TEST TO GET DATA
        return null;
//      IMPLEMENT TEST TO GET DATA

    }

//   todo:ASSIGN TO BADAR
    public Dictionary<Integer, List> getDailyFinanceData() {
//      IMPLEMENT TEST TO GET DATA
        System.out.println("Inside finance");

        Dictionary<Integer, List> dic = new Hashtable<Integer, List>();
        List<String> roomList = new ArrayList<>();
        List<String> maxPriceList = new ArrayList<>();
        List<String> currentPriceList = new ArrayList<>();
        List<String> revenuList = new ArrayList<>();
        List<String> bookingList = new ArrayList<>();
        System.out.println("Inside finance");
        ResultSet rs = super.selectQuery(SELECT_DAILY_FINANCE);

        try {
            System.out.println("Inside finance");
            System.out.println("Inside finance" + rs);
            while (rs.next()) {
                System.out.println("Inside finance try");
                roomList.add(rs.getString("roomNO"));
                maxPriceList.add(rs.getString("highestPrice"));
                currentPriceList.add(rs.getString("currentPrice"));
                revenuList.add(rs.getString("revenu"));
                bookingList.add(rs.getString("booking"));
//              System.out.println(rs.getString("roomNo"));

//    DISTINCT a.roomId as roomNO , b.maxPrice as highestPrice, r.price_r as currentPrice, \n" +
//"b.revenu as revenu,\n" +
//"b.countr as booking\n"    
            }
        } catch (SQLException e) {
            System.out.println("Inside finance catch");
            System.out.println("get dialiy " + e.toString());
        }
        dic.put(0, roomList);
        dic.put(1, maxPriceList);
        dic.put(2, currentPriceList);
        dic.put(3, revenuList);
        dic.put(4, bookingList);
        System.out.println("SNO RoomNO MaxPrice CurrentPrice Revenu DailYBookings");

        for (int i = 0; i < dic.get(0).size(); i++) {
            System.out.println(i + "    " + dic.get(0).get(i) + "    " + dic.get(1).get(i) + "    " + dic.get(2).get(i) + "    " + dic.get(3).get(i) + "      " + dic.get(4).get(i) + " ");

        }

        System.out.println("Inside finance return");

        return dic;
    }
//   todo:ASSIGN TO HASSAN ALI JADOON

    public Dictionary<Integer, List> getAnnualFinanceData() {
//      IMPLEMENT TEST TO GET DATA
        String[] get = {"hi", "How"};
        return null;
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
