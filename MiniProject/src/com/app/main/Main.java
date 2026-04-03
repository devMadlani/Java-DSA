package com.app.main;

import com.app.service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();

        while (true) {
            System.out.println("\n1. Add User");
            System.out.println("2. View Users");
            System.out.println("3. Find User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Id:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    service.createUser(id, name, email);
                    break;

                case 2:
                    service.getAllUsers();
                    break;

                case 3:
                    System.out.print("Enter Id:");
                    service.findUser(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Id:");
                    service.deleteUser(sc.nextInt());
                    break;
                case 5:
                    return;
            }
        }
    }
}
