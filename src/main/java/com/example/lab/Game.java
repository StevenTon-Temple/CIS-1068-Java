package com.example.lab;
import java.util.Random;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        rules();
        int round = 0;
        int[] num = new int[]{0,0};
        while (round() == true) {
            String g = name();
            String input = input();
            play(g, input,num);
            round++;

        }

        System.out.println("round played = " +  round);
        System.out.println("User won = " + num[0]);
        System.out.println("Computer won= "+ num[1]);
    }

    public static boolean round() {
        System.out.println("Do you want to play a round? Yes or No");
        String x = input();
        while (!x.equalsIgnoreCase("n") || true) {
            if (x.equalsIgnoreCase("y")) {
                System.out.println("Chose one of these Dromsack, Tjena, Insvep, Nordli, Lillasjon");
                return true;
            } else if (x.equalsIgnoreCase("n")) {
                return false;
            }
        }
        return false;
    }

    public static void rules() {
        System.out.println("Lillasjon beats Insvep, Dromsack");
        System.out.println("Insvep beats Tjena, Nordli ");
        System.out.println("Tjena beats Lillasjon, Dromsack");
        System.out.println("Dromsack Beats Nordli, Insvep");
        System.out.println("Nordli beats Lillasjon, Tjena");
    }

    public static String input() {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        return x;
    }

    public static String name() {
        String[] names = new String[]{"Dromsack", "Tjena", "Insvep", "Nordli", "Lillasjon"};
        Random random = new Random();
        int r = random.nextInt(names.length);
        String g = names[r];
        return g;

    }
    public static String play(String g, String input, int[] num) {
        String x = "";
        System.out.println("Your move " + input);
        System.out.println("Computer chose "+ g);
        if (g.equalsIgnoreCase(input)) {
            x = "Computer wins";
        } else if (g.equalsIgnoreCase("Dromsack") && (input.equalsIgnoreCase("Nordli") || input.equalsIgnoreCase("Insvep"))) {
            x = "Computer wins";
        } else if (g.equalsIgnoreCase("Lillasjon") && (input().equalsIgnoreCase("Insvep") || input.equalsIgnoreCase("Dromsack"))) {
            x = "Computer wins";
        } else if (g.equalsIgnoreCase("Tjena") && (input.equalsIgnoreCase("Lillasjon") || input.equalsIgnoreCase("Dromsack"))) {
            x = "Computer wins";
        } else if (g.equalsIgnoreCase("Insvep") && (input.equalsIgnoreCase("Tjena") || input.equalsIgnoreCase("Nordli"))) {
            x = "Computer wins";
        } else if (g.equalsIgnoreCase("Nordli") && (input.equalsIgnoreCase("Lillasjon") || input.equalsIgnoreCase("Tjena"))) {
            x = "Computer wins";
        } else if (g.equalsIgnoreCase("Nordli") && (input.equalsIgnoreCase("Insvep") || input.equalsIgnoreCase("Dromsack"))) {
            x = "User wins";
        } else if (g.equalsIgnoreCase("Insvep") && input.equals("Lillasjon")|| input.equals("Dromsack ")){
            x = "User wins";

        } else if (g.equalsIgnoreCase("Lillasjon") && (input.equalsIgnoreCase("Nordli") || input.equalsIgnoreCase("Tjena"))) {
            x = "User wins";

        } else if (g.equalsIgnoreCase("Tjena") && (input.equalsIgnoreCase("Insvep") || input.equalsIgnoreCase("Nordli"))) {
            x = "User wins";
        } else if (g.equalsIgnoreCase("Dromsack") && (input.equalsIgnoreCase("Tjena") || input.equalsIgnoreCase("Lillasjon"))) {
            x = "User wins";
        }
        if (x.equals("User wins")) {
            num[0]++;
        } else {
            num[1]++;
        }
        System.out.println(x);
        return x;
    }

}
