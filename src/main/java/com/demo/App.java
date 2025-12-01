package com.demo;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from branch: " + System.getenv("BRANCH_NAME"));
    }
}

