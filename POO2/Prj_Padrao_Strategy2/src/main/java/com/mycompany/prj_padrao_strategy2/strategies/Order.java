/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_padrao_strategy2.strategies;

/**
 *
 * @author Alexssander
 */
public class Order {
    private int totalCost=0;
    private boolean isClosed=false;
    
    public void processOrder(PayStrategy strategy){
        strategy.collectPaymentDetails();
    }
    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setIsClosed() {
        this.isClosed = true;
    }
    
    
    
}
