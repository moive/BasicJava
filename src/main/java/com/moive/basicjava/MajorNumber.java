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
public class MajorNumber {

    public static void Main(String[] args) throws IOException {

        System.out.println("Enter first number:");
        Integer number1 = loadNumber();

        System.out.println("Enter second number:");
        Integer number2 = loadNumber();

        System.out.println("Enter third number:");
        Integer number3 = loadNumber();

        calculateLargestNumber(number1, number2, number3);
        calculateSmallestNumber(number1, number2, number3);
    }

    private static Integer loadNumber() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        String strNumber = reader.readLine();
        Integer num = Integer.parseInt(strNumber);
        return num;
    }

    private static void calculateLargestNumber(Integer number1, Integer number2, Integer number3) {
        Integer majorNumber = number1;

        if (number2 > majorNumber) {
            majorNumber = number2;
        }
        if (number3 > majorNumber) {
            majorNumber = number3;
        }

        System.out.println("The major number is: " + majorNumber);
    }

    private static void calculateSmallestNumber(Integer number1, Integer number2, Integer number3) {
        Integer minorNumber = number1;

        if (number2 < minorNumber) {
            minorNumber = number2;
        }
        if (number3 < minorNumber) {
            minorNumber = number3;
        }

        System.out.println("The minor number is: " + minorNumber);
    }
}
