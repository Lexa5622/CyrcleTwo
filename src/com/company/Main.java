package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");

        int accumulate = 0;
        int totalAccumulate = 2_459_000;
        int moneyMonth = 15_000 ;
        while (accumulate < totalAccumulate) {
                accumulate += moneyMonth;
                System.out.println("Месяц " + accumulate / moneyMonth + " сумма накоплений равна " + accumulate + " рублей");
            }


        System.out.println("Задание 2");

        int i = 0;
        while (i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
         for (;i >= 1; i-- ){
             System.out.print(i + " ");
         }
        System.out.println();
        System.out.println("Задание 3");

        int populationY = 12_000_000;
        int birthRate = populationY / 1000 * 17;
        int mortality = populationY / 1000 * 8;

        for (int j = 1; j <= 10; j++){
            populationY = populationY + birthRate - mortality;
            System.out.println("Год " + j +"," +  " численность населения составляет " +  populationY);
        }

        System.out.println("Задание 4");

        int firstSum = 15000;
        int lastSum = 12_000_000;
        int countMonth = 0;

        while (firstSum <= lastSum) {
            firstSum = (int)(firstSum + firstSum * 0.07);
            countMonth++;
            System.out.println("За " + countMonth + " месяц сумма накоплений состаляет " + (int)(firstSum * 0.07) + " на счету  " + firstSum);
        }

        System.out.println("Задание 5");

        int firstSum1 = 15000;
        int lastSum1 = 12_000_000;
        int countMonth1 = 0;
        while (firstSum1 <= lastSum1) {
            firstSum1 = (int)(firstSum1 + firstSum1 * 0.07);
            countMonth1++;
            if (countMonth1 % 6 == 0) {
                System.out.println("За " + countMonth1 + " месяц сумма накоплений состаляет " + (int) (firstSum1 * 0.07) + " на счету  " + firstSum1);
            }
        }

        System.out.println("Задание 6");
        int vasyaFirstSum = 15000;
        int vasyaCouuntMonth = 9 * 12;
        double proc = 0.07;

        for (int j = 1; j <= vasyaCouuntMonth; j++) {
            vasyaFirstSum = (int) (vasyaFirstSum + vasyaFirstSum * proc);
            if (j % 6 == 0){
                System.out.println("Сумма накоплений за пол года " + "сотавляет " + (int)(vasyaFirstSum * proc) + "," + " на счету " + vasyaFirstSum);
            }
        }

        System.out.println("Задание 7");

        int fr = 7;
        while (fr <= 31){
            System.out.println("Сегодня пятница, " + fr + "-е" +  " число. Необходимо подготовить отчет");
            fr += 7;
        }

        System.out.println("Задание 8.");

        int start = 0;
        int firstYear = 1824;
        int lastYear = 2124;

        while (start < lastYear){
            if (start >= firstYear ) {
                System.out.println(start);
            }
            start += 79;
        }
    }
}

