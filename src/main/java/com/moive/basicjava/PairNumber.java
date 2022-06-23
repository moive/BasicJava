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
public class PairNumber {

    public static void Main(String[] args) throws IOException {
        System.out.println("Enter number:");
        Integer number = loadNumber();

        Boolean isPair = number % 2 == 0;

        if (isPair) {
            System.err.println("The number " + number + " is even");
        }else{
            System.err.println("The number "+ number + " is odd");
        }

    }

    private static Integer loadNumber() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String strNumber = reader.readLine();
        Integer num = Integer.parseInt(strNumber);
        return num;
    }
}
