package com.codedifferently.lab.partA;
import java.util.Scanner;
public class Chickens01 {
    //Put your code here
    public static void main(String[]args) {
        int totaleggs = 0;
         int chickens = 0;
        int day = 0;
        int x = 0;
        System.out.println("How many Chickens do you start with?");
        Scanner keyboard = new Scanner(System.in);
        chickens = keyboard.nextInt();
        while(day < 3) {
            if( chickens < 4){
                x = 5;
            if(day == 0){
                totaleggs= totaleggs + (chickens * x);
            }else if( day == 1){
                chickens++;
                totaleggs= totaleggs + (chickens * x);
            }else{
                chickens = chickens/2;
                totaleggs= totaleggs + (chickens * x);
            }
            day++;
            }else{
              x = 4;
                if(day == 0){
                    totaleggs= totaleggs + (chickens * x);
                }else if( day == 1){
                    chickens++;
                    totaleggs= totaleggs + (chickens * x);
                }else{
                    chickens = chickens/2;
                    totaleggs= totaleggs + (chickens * x);
                }
                day++;
            }
        }
        System.out.println(totaleggs);
    }


}


