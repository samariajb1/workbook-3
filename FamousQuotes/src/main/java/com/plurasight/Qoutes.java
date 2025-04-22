package com.plurasight;

import java.util.Scanner;

public class Qoutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] qoutes = {"“Where there is love, there is life.” — Mahatma Gandhi","“You can’t see the wind, but you can feel it. Just like you can’t see faith, but you can feel it when it’s there.” — Unknown","“I can do all things through Christ who strengthens me.” — Philippians 4:13","“Life is not measured by the number of breaths we take, but by the moments that take our breath away.” — Maya Angelou","“The truth will set you free, but first it will make you miserable.” — James A. Garfield","Love is not about how much you say ‘I love you,’ but how much you prove that it’s true.” — Unknown","“The Holy Spirit is like the wind—you can’t see it, but you know it’s there by the way it moves things.” — Based on John 3:8","“Life is really simple, but we insist on making it complicated.” — Confucius","“God is spirit, and his worshipers must worship in the Spirit and in truth.” — John 4:24","“Love does not delight in evil but rejoices with the truth.” — 1 Corinthians 13:6"};
            System.out.print("Pick A Qoute from 1-10: ");
            int index = scanner.nextInt();
            System.out.println(qoutes[index]);
        }
        catch (Exception e) {
            System.out.println("Your number is out of range!");
            e.printStackTrace();
        }
        scanner.close();



    }
}
