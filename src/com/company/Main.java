package com.company;

import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);

    private double enterBYN;

    private void enterBYN() {
        enterBYN = scanner.nextDouble();
    }

    private void enterOperation(){


        switch (scanner.nextInt()){
            case 1:
                convert("USD", 3.14);
                break;
            case 2:
                convert("EUR", 4.1);
                break;
        }
    }


   private void convert(String currency, double rate)
   {
       double result = enterBYN * rate;
       System.out.printf("%.2f BYN = %.2f %s\n", enterBYN,result,currency);
   }

    private void screen()
    {
        System.out.println("Введите сумму в BYN:");
        enterBYN();
        System.out.println("В какую валюту перевести? 1 - USD или 2 - EUR:");
        enterOperation();
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.screen();
    }

}
