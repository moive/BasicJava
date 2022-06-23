/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moive.basicjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class AverageNumbers {

    public static void Main(String[] args) throws IOException {
        System.out.println("Enter first number:");
        Integer number1 = loadNumber();

        System.out.println("Enter second number:");
        Integer number2 = loadNumber();

        System.out.println("Enter third number:");
        Integer number3 = loadNumber();

        Integer summation = number1 + number2 + number3;
        
        Double averageNumber = Double.valueOf(summation)/3;
        
        System.out.println("The average numbers is: " + averageNumber);
    }

    private static Integer loadNumber() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String strNumber = reader.readLine();
        Integer num = Integer.parseInt(strNumber);
        return num;
    }
}
