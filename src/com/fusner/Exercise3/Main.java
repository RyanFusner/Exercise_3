package com.fusner.Exercise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    double temp = 0;
	    while (temp > -460)
        {
            temp = getTemp();
            if (temp > -460)
            {
                displayTemp(temp);
            }
        }
        System.out.print("Done");
    }

    static double getTemp()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double temp = input.nextDouble();
        return temp;
    }

    static double toCelsius(double temp)
    {
        temp = (temp - 32) * 0.5555555556;
        return Math.round(temp);
    }

    static void displayTemp(double temp)
    {
        System.out.println("Celsius: " + toCelsius(temp));
    }
}
