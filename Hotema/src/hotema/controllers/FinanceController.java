/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotema.controllers;

import hotema.models.FinanceModels;
import hotema.views.FinanceUI;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author badar
 */
public class FinanceController {

    public void showFinanceUi() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FinanceModels hotema = new FinanceModels("Alirohan11");

                Dictionary<Integer, List> newDictionary = new Hashtable<>();
                newDictionary = hotema.getDailyFinanceData();
                new FinanceUI(newDictionary).setVisible(true);
            }
        });

    }

    public static void main(String[] args) {
       FinanceController finaceUI= new FinanceController();
       finaceUI.showFinanceUi();
    }

}
