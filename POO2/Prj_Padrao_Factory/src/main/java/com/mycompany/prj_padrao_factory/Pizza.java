/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prj_padrao_factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexssander
 */

public abstract class Pizza {
   String name;
   String dough;
   String sauce;
   List<String> toppings = new ArrayList<String>();
   
    public void prepare(){
        System.out.println("Preparing "+name);
    }
    
    public void bake(){
        System.out.println("Baking "+name);
    }
    
    public void cut(){
        System.out.println("Cutting "+name);
    }
    
    public void box(){
        System.out.println("Boxing "+name);
    }
    
    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("--- "+ name + " ---\n");
        display.append(dough +"\n" );
        display.append(sauce +"\n" );
        for(String topping : toppings){
            display.append(topping +"\n" );
        }
        return display.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
   
}
