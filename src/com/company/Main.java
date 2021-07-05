package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhap can nang vao day");
        weight = sc.nextDouble();
        System.out.println("Nhap chieu cao vao day");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.println(" You are Underweight");
        else if (bmi < 25.0)
            System.out.println("You are Normal");
        else if (bmi < 30.0)
            System.out.println(" You are Overweight");
        else
            System.out.println("You are Obese");
    }
}

