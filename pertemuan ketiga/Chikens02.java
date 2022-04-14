/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chikens02;

/**
 *
 * @author Lenovo
 */
public class Chikens02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dailyAverage;
        double monthlyAverage;
        double monthlyProfit;

        dailyAverage = (100 + 121 + 117) / 3.0;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:    " + dailyAverage);
        System.out.println("Monthly Average:  " + monthlyAverage);
        System.out.println("Monthly Profit:   $" + monthlyProfit);
    }
    
}
