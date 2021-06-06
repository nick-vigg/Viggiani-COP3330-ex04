/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = input.nextLine();
        System.out.println("Enter a verb: ");
        String verb = input.nextLine();
        System.out.println("Enter an adjective ");
        String adjective = input.nextLine();
        System.out.println("Enter an adverb: ");
        String adverb = input.nextLine();
        String output = String.format("Do you %s your %s %s %s? That's hilarious!",
                verb, adjective, noun, adverb);
        System.out.println(output);


    }
}
