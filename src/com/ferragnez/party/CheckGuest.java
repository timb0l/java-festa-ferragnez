package com.ferragnez.party;
import java.util.Scanner;
public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String[] inviteeList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

            boolean inviteeName = false;
            String name;
            int a = 0;
            System.out.println("Guest Name: ");
            name = scan.nextLine();

            while (a < inviteeList.length-1){
                a++;
                if (inviteeList[a].equals(name)){
                    inviteeName = true;
                    System.out.println("Welcome " + name + "!");
                    break;}
                } if (!inviteeName) {
            System.out.println("Sorry " + name + " you are not on the list.");
        } scan.close();
    }
}
