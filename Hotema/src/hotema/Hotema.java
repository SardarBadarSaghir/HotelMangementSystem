/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotema;

import hotema.controllers.FinanceController;

/**
 *
 * @author badar
 */
public class Hotema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       FinanceController finaceUI= new FinanceController();
       finaceUI.showFinanceUi();
    }
    
}
