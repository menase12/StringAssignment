package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name=input.nextLine();
        System.out.print("Your name is "+name+".");
    }
}
