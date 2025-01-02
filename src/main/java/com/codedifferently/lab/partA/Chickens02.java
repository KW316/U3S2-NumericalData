package com.codedifferently.lab.partA;

public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
double dailyAverage = 0;
double monthlyAverage = 0;
double monthlyProfit = 0;
dailyAverage = (double) (100 + 121 + 117) /3;
monthlyAverage = (double) (100 + 121 + 117) /12; // I chose 12 because generally in a 30 day time period there a at least 4 weeks so i assumes there would be 4 sets of MOn.Tues, Wednes
monthlyProfit = monthlyAverage * .18;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
}
