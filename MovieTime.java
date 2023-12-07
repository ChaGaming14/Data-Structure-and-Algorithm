/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.movietime;

/**
 *
 * @author COMLAB101
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MovieTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter movie " + i + " of 3: ");
            String movie = input.nextLine();
            movies.offer(movie);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter snack " + i + " of 3: ");
            String snack = input.nextLine();
            snacks.offer(snack);
        }

        System.out.println("Movies to watch are: " + movies); 
        System.out.println("Snacks available are: " + snacks);
        System.out.println("Press 'S' each time you finish a snack.");

        while (!snacks.isEmpty()) {
            String key = input.nextLine();
            if (key.equalsIgnoreCase("S")) {
                snacks.poll();
                System.out.println(snacks);
            }
        }

        if (snacks.isEmpty()) {
            System.out.println("No more snacks");
        }
    }
}