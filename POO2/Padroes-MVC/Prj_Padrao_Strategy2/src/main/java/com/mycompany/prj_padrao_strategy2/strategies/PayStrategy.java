/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prj_padrao_strategy2.strategies;

/**
 *
 * @author Alexssander
 */
public interface PayStrategy {
    boolean Pay(int paymentAmount);
    void collectPaymentDetails();
}
