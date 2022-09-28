package com.company;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static String path = "resources/input.txt";

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (Exception e) {
            System.out.println("File is not found!");
        }
        for (String elem : lines) {
            for (String el : elem.split("[^0-9]+")) {
                if (el.matches("[-+]?\\d+")) {
                    if (Integer.parseInt(el) >= 10) {
                        System.out.println(elem);
                    }
                }
            }
        }
    }
}
