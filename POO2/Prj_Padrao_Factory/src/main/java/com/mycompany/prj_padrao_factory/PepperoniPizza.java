/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_padrao_factory;

/**
 *
 * @author Alexssander
 */
public class PepperoniPizza extends Pizza{
    
    public PepperoniPizza() {
        name="Pepperoni Pizza";
        dough="Crust";
        sauce="Marinata sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
    
}
