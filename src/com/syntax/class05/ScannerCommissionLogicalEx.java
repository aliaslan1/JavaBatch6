package com.syntax.class05;

import java.util.Scanner;// for MAC users (command + shift + o )

public class ScannerCommissionLogicalEx {

	public static void main(String[] args) {

		/*
		 * ask user to enter daily sales base on the sales range we want to give
		 * commission to the person if sales is <100-->commission is 10% if sales if
		 * between 100-200--commission of 20% etc...
		 */

		Scanner scan;
        double sales;
        double commission;
        
        scan=new Scanner(System.in);
        System.out.println("Please enter your sales amount");
        sales=scan.nextDouble();
        
        //code below look cleaner
        if(sales>=1 && sales<=100) {
            //give user 10% commission
            commission=sales*0.10;
        }else if(sales>100 && sales<=200) {
            //give user 20% commission
            commission=sales*0.2;
        }else if(sales>200 && sales<=500) {
            //give user 30% commission
            commission=sales*0.3;
        }else {
            commission=sales*0.5;
        }
        
        System.out.println("Based on your sales you commission is ="+commission);
        if (commission>100) {
            System.out.println("You are an awesome seller");
        }
    }
}
