/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int n;
        String text;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите н = ");
        n = sc.nextInt();

        text = switch (n) {
            case 0 ->
                "Null";
            case 1 ->
                "odin";
            case 2 ->
                "dva";
            case 3 ->
                "tri";
            case 4 ->
                "Null";
            case 5 ->
                "pyat'";
            case 6 ->
                "";
            case 7 ->
                "sem";
            case 8 ->
                "vosem";
            case 9 ->
                "devyat";
            default ->
                "Введите цифру от 0 до 9";
        };
        System.out.println(text);
    }
}
