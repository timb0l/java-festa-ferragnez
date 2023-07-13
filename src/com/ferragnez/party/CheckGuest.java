package com.ferragnez.party;
import java.util.Scanner;
public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String[] inviteeList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
            boolean invitee = false;
            int a = 0;
            String name;
            System.out.println("Guest Name: ");
            name = scan.nextLine();
            for (a=0; inviteeList.length; a++){
                if (name.equalsIgnoreCase(invitee)) {
                    invitee = true;
                    System.out.println("Welcome!");
                } else {
                    System.out.println("Sorry" + name + "You are not on the list.");
                } scan.close();
            }
}
