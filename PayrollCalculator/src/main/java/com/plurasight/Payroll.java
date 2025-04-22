package com.plurasight;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Payroll {
    public static void main(String[] args) {

        String path = "src/main/resources/employees.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            System.out.printf("%-5s %-20s %10s%n", "ID", "Name", "Gross Pay");
            System.out.println("------------------------------------------------");

            while ((line = reader.readLine()) != null) {
                // 1. split into tokens
                String[] tokens = line.split("\\|");

                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hours = Double.parseDouble(tokens[2]);
                double rate = Double.parseDouble(tokens[3]);

                // 3. create Employee
                Employees emp = new Employees(id, name, hours, rate);

                // 4. print results
                System.out.printf(
                        "%-5d %-20s $%,10.2f%n",
                        emp.getId(),
                        emp.getEmployeeName(),
                        emp.getGrossPay()
                );
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }


        }
