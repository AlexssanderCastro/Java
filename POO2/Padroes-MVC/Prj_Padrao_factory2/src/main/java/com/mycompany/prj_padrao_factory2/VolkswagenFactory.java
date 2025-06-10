/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_padrao_factory2;

/**
 *
 * @author Alexssander
 */
public class VolkswagenFactory implements CarFactory{
    @Override
    public Car createCar(){
        return new Polo();
    }
}
