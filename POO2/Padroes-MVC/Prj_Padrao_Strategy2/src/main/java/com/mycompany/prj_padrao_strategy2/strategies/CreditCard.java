/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_padrao_strategy2.strategies;

/**
 *
 * @author Alexssander
 */
public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cvv;
    
    CreditCard(String number, String date, String cvv){
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    

   

  

    
    
    
}
