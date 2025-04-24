package com.plurasight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the inventory file name: ");
        String inputFileName = scanner.nextLine();

        String inputPath = "src/main/resources/inventory.csv";

        ArrayList<String> inventory = new ArrayList<>();


     try {
         BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
         String line;

         while ((line = bufferedReader.readLine()) != null) {
             String[] parts = line.split("\\|");
             String id = parts[0].trim();
             String name = parts[1].trim();
             String price = parts[2].trim();

             String products = "ID: " + id + " | Product: " + name + " | Price: $" + price;
             inventory.add(products);
         }
         System.out.println("\nInventory List:");
         for (String product : inventory) {
             System.out.println(product);
     }
         bufferedReader.close();
     }catch (IOException e) {
         System.err.println("Error reading file: " + e.getMessage());
     }


        }



}
