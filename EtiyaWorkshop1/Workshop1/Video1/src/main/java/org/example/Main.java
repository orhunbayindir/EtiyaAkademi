package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        String ortaMetin = "İlginizi Çekebilir";
        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);

        int vade = 12;
        double dolarDun = 18.15;
        double dolarBugun = 18.30;
        boolean dolarDustuMu = false;


        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "down.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};

        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}