package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    static void uzdevums0(){
        System.out.println("Izvēlēts uzdevums '0' - Maksimālā skaitļa saskaitīšana");

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while(true) {
            System.out.print("Ievadiet skaitli: ");
            Scanner scan = new Scanner(System.in);

            while (!scan.hasNextInt()) {
                System.out.println("Nav ievadīts skaitlis.");
                System.out.print("Ievadiet skaitli: ");
                scan.nextLine();
            }
            int number = scan.nextInt();

            if (number == 0) {
                System.out.println("0 - Programma tika apstādināta.");

                if (numbers.isEmpty()) {
                    System.out.println("Netika ievadīts neviens cits skaitlis");
                } else {
                    int highestNumber = Collections.max(numbers);
                    System.out.println("Lielākais ievadītais skaitlis: " + highestNumber);
                    System.out.println();
                }

                break;
            } else {
                numbers.add(number);
            }
        }
    }

    static void uzdevums1(){
        System.out.println("Izvēlēts uzdevums '1' - Pāra un nepāra skaitļu saskaitīšana.");

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

        while(true) {
            System.out.print("Ievadiet skaitli: ");
            Scanner scan = new Scanner(System.in);

            while (!scan.hasNextInt()) {
                System.out.println("Nav ievadīts skaitlis. Meģini vēlreiz:");
                System.out.print("Ievadiet skaitli: ");
                scan.nextLine();
            }
            int number = scan.nextInt();

            if (number == 0) {
                System.out.println("0 - Programma tika apstādināta.");
                System.out.println("Ievadīto pāra skaitļu daudzums: " + evenNumbers.size());
                System.out.println("Ievadīto nepāra skaitļu daudzums: " + oddNumbers.size());
                System.out.println();

                break;
            } else if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
    }

    static void uzdevums2(){
        System.out.println("Izvēlēts uzdevums '2' - Uzminiet skaitli.");

        int minimums = 1;
        int maksimums = 100;

        Random rand = new Random();
        int randomNum = minimums + rand.nextInt((maksimums - minimums) + 1);

        System.out.print("Tika uzģenerēts gadijuma skaitlis intervālā no 1 - 100, uzminiet to: ");

        while(true) {
            Scanner scan = new Scanner(System.in);

            while (!scan.hasNextInt()) {
                System.out.print("Nav ievadīts skaitlis. Meģiniet vēlreiz: ");
                scan.nextLine();
            }
            int number = scan.nextInt();

            if (number == randomNum) {
                System.out.println("Gadījuma skaitlis ir uzminēts: " + randomNum);
                System.out.println();

                break;
            } else if(number > randomNum && number <= 100) {
                System.out.print("Ievadītais skaitlis ir lielāks par gadījuma skaitli. Meģiniet vēlreiz: ");
            } else if(number < randomNum && number >= 0) {
                System.out.print("Ievadītais skaitlis ir mazaks par gadījuma skaitli. Meģiniet vēlreiz: ");
            } else {
                System.out.print("Ievadītais skaitlis nav robežā no 1 - 100. Meģiniet vēlreiz: ");
            }
        }
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("Nepieciešams izvēlēties kādu no opcijām:");
            System.out.println("'0' - Maksimālā skaitļa saskaitīšana.");
            System.out.println("'1' - Pāra un nepāra skaitļu saskaitīšana.");
            System.out.println("'2' - Uzminiet skaitli.");
            System.out.println("'3' - Pabeigt programmas izpildi.");
            System.out.print("Ir pieejami šādi uzdevumi: - '0', '1', '2': ");
            Scanner scan = new Scanner(System.in);

            while (!scan.hasNextInt()) {
                System.out.print("Nav ievadīts skaitlis. Meģiniet vēlreiz:");
                scan.nextLine();
            }
            int number = scan.nextInt();

            switch (number) {
                case 0:
                    uzdevums0();
                    break;
                case 1:
                    uzdevums1();
                    break;
                case 2:
                    uzdevums2();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Nav ticis izvēlēts neviens no pieejamajiem uzdevumiem. ");
                    System.out.println("");
            }
        }
    }
}
