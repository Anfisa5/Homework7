package ru.netology.statistic;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        System.out.println(service.findMax(incomes));

    }
}

