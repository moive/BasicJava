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
public class Person {
    public static void main(String[] args) throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        System.out.println("Enter age:");
        String strAge = reader.readLine();

        Integer age = Integer.parseInt(strAge);
        Boolean isAdult = age >= 18;

        if (isAdult) {
            System.out.println("Is adult");
        } else {
            System.out.println("Is younger");
        }
    }
}
