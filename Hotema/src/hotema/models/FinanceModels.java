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
public class FinanceModels {
    
        public void insertData(){
//        INSERT DATA
        
    }
//   todo:ASSIGN TO AWAIS
    public String[] getMonthlyFinanceData(){
//      IMPLEMENT TEST TO GET DATA
        String[] get = {"hi", "How"};
        return get;      
    }
    
//   todo:ASSIGN TO BADAR
        public String[] getDailyFinanceData(){
//      IMPLEMENT TEST TO GET DATA
        String[] get = {"hi", "How"};
        return get;      
    }
//   todo:ASSIGN TO HASSAN ALI JADOON

       public String[] getAnnualFinanceData(){
//      IMPLEMENT TEST TO GET DATA
        String[] get = {"hi", "How"};
        return get;      
    }
    
    
    public static void main(String[] args) {
      DbmsConnection hotema = new DbmsConnection("Alirohan11");
  String qurey = "USE DreamHome; Drop DATABASE Fun;";
        hotema.cudQuery(qurey);
    }
}
