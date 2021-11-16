package com.example.lab;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Webifyupdated {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Please enter name of text file you want to test.");
        Scanner txtlocation = new Scanner(System.in);
        String c = txtlocation.nextLine();
        File a = new File("C:\\Users\\steve\\Downloads\\" + c);
        Scanner input = new Scanner(a);
        PrintStream output = new PrintStream(new File("C:\\Users\\steve\\Downloads\\Test.html"));
        output.append(htmlbody(input, a));
        input.close();
    }

    public static String htmlbody(Scanner input, File a) throws FileNotFoundException {
        return "<html>\n" + "<body>\n" + data(input, a) + "</html>\n" + "</body>";
    }
    public static String data(Scanner input, File a) throws FileNotFoundException {
        input = new Scanner(a);
        String s = "<ul>\n";
        String finalhtlm = "";
        String hyperlink ="";
        while (input.hasNextLine()) {
            String b = input.nextLine();
            if (b.startsWith("_")) {
                String t = b.replace("_", "");
                finalhtlm += "<h1>" + t + "</h1>\n";
            }
            if (b.startsWith("-")) {
                String r = b.replace("-", "");
                s += "<li>" + r + "</li>\n";
                if (r.contains("porous")) {
                    String rg = "</ul>\n";
                    s += rg;
                    finalhtlm += s;
                }
            }
            if ((b.equals(""))) {
                finalhtlm += ("<p>");
            }
            if (b.matches(".*[a-z].*") && !b.contains("_") && !b.contains("-")&&!b.contains("[")) {
                finalhtlm += b + "<br />\n";
            }
            if (b.startsWith("[")){
                String x,y;
                x = b.substring(b.indexOf("[")+2,b.indexOf("]"));
                y = b.substring(b.lastIndexOf("[")+1,b.length()-2);
                hyperlink += "<a href=" +x+">"+y+"</a>";

            }
            finalhtlm+=hyperlink;

        }
        System.out.println(finalhtlm);
        return finalhtlm;
    }

}