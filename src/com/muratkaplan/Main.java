package com.muratkaplan;

import java.util.Scanner;

public class Main {

    public static String v="code";
    public static void main(String[] args) {
        String s1="Welcome";
        String s2="Welcome";
        String s3="Welcome";
        if(s1.equals(s2))
            System.out.println("aynı nesnedir");
        Scanner scanner = new Scanner(System.in);
        String arr[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ". parametreyi giriniz");
            arr[i] = scanner.nextLine();
        }

         String m=parameter(arr);
         System.out.println("Tanımlı value yu içeren String deger "+m);
    }

    public static String parameter(String[] stringVariable) {
      int i=0;
       while (!stringVariable[i].equals(v)){
           i++;
       }
      return stringVariable[i];
    }


}
