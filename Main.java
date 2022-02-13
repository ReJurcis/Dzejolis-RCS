package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Izveidoju scanner inputu
        Scanner read = new Scanner(System.in);

        //Saruna ar lietotāju

        System.out.println("Sveiks lietotāj!");

        System.out.println("Tev ir iespēja zemāk ešam dzejolim nomainīt katrā rindiņā pa vienam vārdam kur tie trūkst.");

        System.out.println();
        System.out.println("Sudraba ..... vārtas pa gaisu,");
        System.out.println("Sētā nāk ..... ar atkritummaisu,");
        System.out.println("Atnāca priekšnamā, nolika .....,");
        System.out.println("Aizgāja tālāk uz ...... pusi.");
        System.out.println();
        System.out.println("Liec lietā iztēli un izmēģini");

        //izveidoju 4 mainīgo ievadi
        System.out.println("Lūdzu ievadi pirmo vārdu.");
        String var1 = read.nextLine();
        System.out.println("Tagad otro.");
        String var2 = read.nextLine();
        System.out.println("Tagad trešo.");
        String var3 = read.nextLine();
        System.out.println("Un visbeidzot ceturto.");
        String var4 = read.nextLine();
        System.out.println();

        System.out.println("Lūk kas tev sanācis");
        System.out.println();
        // izvadam dzejoli jau ar saglabatajiem mainīgajiem
        System.out.println("Sudraba " + var1 + " vārtas pa gaisu,");
        System.out.println("Sētā nāk " + var2 + " ar atkritummaisu,");
        System.out.println("Atnāca priekšnamā, nolika " + var3 + ",");
        System.out.println("Aizgāja tālāk uz " + var4 + " pusi.");


    }
}