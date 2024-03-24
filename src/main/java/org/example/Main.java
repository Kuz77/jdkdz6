package org.example;

import lombok.Getter;
import lombok.Setter;

public class Main {
    @Getter @Setter private String name;

    public static void main(String[] args) {
        Main obj = new Main();
        obj.setName("John");
        System.out.println("Name: " + obj.getName());
    }
}