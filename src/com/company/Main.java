package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float weight;
        float height;
        float bmi;

        System.out.println("Body Mass Index - Rechner");
        System.out.println("Bitte geben Sie Ihr Koerpergewicht in Kilogramm ein:");
        weight = sc.nextFloat();
        System.out.println("Bitte geben Sie jetzt Ihre Koerpergroesse in Metern ein:");
        height = sc.nextFloat();
        bmi = weight / (height * height);
        bmi = Math.round(bmi);
        System.out.println("Ihr Body Mass Index ist: " + bmi + " // " + category(bmi));

    }

    public static String category(float bmi) {

        if(bmi <= 18) {
            return "Sie haben Untergewicht, gehen Sie bitte zum Arzt!";
        }
        else if(bmi >= 19 && bmi <= 24) {
            return "Sie haben Normalgewicht!";
        }
        else if(bmi >= 25 && bmi <= 29) {
            return "Sie haben Uebergewicht, achten Sie mehr auf Ihre ernaehrung und bewegung!";
        }
        else if(bmi >= 30 && bmi <= 34) {
            return "Sie haben Adipositas Grad 1! Gehen Sie bitte zum Arzt!";
        }
        else if(bmi >= 35 && bmi <= 39) {
            return "Sie haben Adipositas Grad 2! GEHEN SIE BITTE ZUM ARZT!!!";
        }
        else if(bmi >= 40) {
            return "Sie haben Adipositas Grad3! GEHEN SIE UNBEDINGT ZUM ARZT!!!";
        }
        else {
            return "FEHLER";
        }

    }

}
