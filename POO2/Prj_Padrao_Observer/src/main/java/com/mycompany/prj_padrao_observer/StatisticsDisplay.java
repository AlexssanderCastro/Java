/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_padrao_observer;

/**
 *
 * @author Alexssander
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;
    
    public StatisticsDisplay(WeatherData weatherData){
        
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        
    }

    
    public void update(float temp, float humidity, float pressure) {
        tempSum+=temp;
        numReadings++;
        if(temp>maxTemp){
            maxTemp=temp;
        }
        if(temp<minTemp){
            minTemp=temp;
        }
        display();
    }

    
    public void display() {
        System.out.println("Avg/Max/Min temperature = "+(tempSum/numReadings)+"/"+maxTemp+"/"+minTemp);
    }
}
