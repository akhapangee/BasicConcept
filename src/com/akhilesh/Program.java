/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Akhilesh
 */
public class Program {

    public static void main(String[] args) throws IOException {
        char c = 'A';
        char[] abcd = new char[36];
        byte k = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            abcd[k++] = (char) i;
        }

//        System.out.print(abcd);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(alphabet + alphabet.toUpperCase());

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name :");

//        System.out.println("Your name is: " + reader.readLine());
        System.out.println("==========================================================");

        int x = 5, y = 100, z = 15;

        if (x < y && y < z) {
            System.out.println(z + " is greatest");
        }else if(y < z && z < x){
            System.out.println(y);
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Akhilesh Khapangee");
            System.out.println("hey");
        }
    }
}
