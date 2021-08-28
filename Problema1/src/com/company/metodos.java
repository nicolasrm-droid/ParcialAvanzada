package com.company;

import java.util.ArrayList;

public class metodos {
    public String hexaAdd(String num) {
        ArrayList<Integer> numero = new ArrayList<>();
        for (int i = 0; i < num.length(); i++) {
            if (esNumero(num.charAt(i) + "")) {
                numero.add(Integer.parseInt(num.charAt(i) + ""));
            } else {
                numero.add(hex(num.charAt(i) + ""));
            }
        }
        int dec = 0;
        for (int j = 0; j < numero.size(); j++) {
            dec += numero.get(numero.size() - j - 1) * (int) (Math.pow(16, j));
        }
        return Integer.toHexString(dec + 1).toUpperCase();
    }

    private int hex(String car) {
        if (car.equals("A")) {
            return 10;
        }
        if (car.equals("B")) {
            return 11;
        }
        if (car.equals("C")) {
            return 12;
        }
        if (car.equals("D")) {
            return 13;
        }
        if (car.equals("E")) {
            return 14;
        }
        if (car.equals("F")) {
            return 15;
        }
        return 0;
    }

    private boolean esNumero(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


