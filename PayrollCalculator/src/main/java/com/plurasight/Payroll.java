package com.plurasight;

import java.io.*;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the employee file to process: ");
        String inputFileName = scanner.nextLine();

        System.out.print("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();

        String inputPath = "src/main/resources/" + inputFileName;
        String outputPath = "src/main/resources/output/" + outputFileName;

        try {
        BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

            writer.write("id|name|gross pay\n"); // header

            reader.readLine(); // skip header in input

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hours = Double.parseDouble(tokens[2]);
                double rate = Double.parseDouble(tokens[3]);

                Employees emp = new Employees(id, name, hours, rate);
                double grossPay = emp.getGrossPay();

                writer.write(id + "|" + name + "|" + String.format("%.2f", grossPay) + "\n");
            }

            System.out.println("Payroll file created successfully at: " + outputPath);
            reader.close();
            writer.close();

        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        }
    }
}