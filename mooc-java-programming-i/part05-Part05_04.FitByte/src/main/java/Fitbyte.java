/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int hR) {
        this.age = age;
        this.restingHeartRate = hR;
    }
    
    public double targetHeartRate(double percentageOfMax) {
        double maxHeartRate = 206.3 - (0.711 * this.age);
        return (maxHeartRate - this.restingHeartRate) * percentageOfMax + this.restingHeartRate; 
    }
}
