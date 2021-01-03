/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotema.controllers;

import hotema.models.FinanceModels;
import hotema.views.FinanceUI;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author badar
 */
public class FinanceController {

    public Dictionary<Integer, List> fileDictionary;
    FinanceModels hotema;

    public FinanceController() {
        hotema = new FinanceModels("Alirohan11");
        fileDictionary = dictionary(hotema);
    }

    public void showFinanceUi() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                Dictionary<Integer, List> newDictionary = dictionary(hotema);

                new FinanceUI(newDictionary).setVisible(true);
            }

        });

    }

    public Dictionary<Integer, List> dictionary(FinanceModels hotema) {
        Dictionary<Integer, List> newDictionary = new Hashtable<>();

        newDictionary = hotema.getDailyFinanceData();

        return newDictionary;
    }

    public void createPDF(String fileL) {
        
        
        try {
            File myObj = new File(fileL+".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
           try {
        FileWriter myWriter = new FileWriter(fileL+".txt");
      
        myWriter.write("\t\t\t"+fileL+"\n");
        float revenu =0;
      
         for (int i = 0; i < this.fileDictionary.get(0).size(); i++) {
             
            String rm = (String)  this.fileDictionary.get(0).get(i);
            String mp = (String)  this.fileDictionary.get(1).get(i);
            String cp = (String)  this.fileDictionary.get(2).get(i);
            String rv = (String) this.fileDictionary.get(3).get(i);
            String bk = (String)  this.fileDictionary.get(4).get(i);
       
            revenu = revenu + Float.parseFloat(rv);
            myWriter.write("Room NO : "+rm +"\nMaximum Price : "+mp+", Current Price :" +cp +", Revenu : "+rv+", Booking : "+bk);
            myWriter.write("\n\n");
                     
        }
         myWriter.write("Total Revenu = "+revenu);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
         


    }

    public static void main(String[] args) {
        FinanceController finaceUI = new FinanceController();

//        finaceUI.showFinanceUi();
        //Creating PDF document object 
finaceUI.createPDF("Daily Report");
        //Saving the document
        //Creating PDF document object 
        //Closing the document  
//            Closing the documen
    }

}
