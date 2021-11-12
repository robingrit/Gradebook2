package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int on = 0;

        Catalogue catalogue = new Catalogue();

        Scanner input = new Scanner(System.in);
        // Bygger listan
        catalogue.setStudentList();
        // skriver ut studenterna
        catalogue.printstudents();


        //StudentList.Sebetyg();
        System.out.println("Vem vill du ta en närmare titt på?");

        String name = input.nextLine();
        Student currentStudent = catalogue.findStudent(name);


        if (currentStudent == null) {


            System.out.println("Sorry, cant find a student with that name. ");
            System.out.println("Please try again ");

        } else {

            /*
            Print chosen student and students grades.
            Gives the options
            */

            while (on == 0) {
                System.out.println(currentStudent.getlName());

                System.out.println("Options: ");
                System.out.println("************************ ");
                System.out.println("1. Highest Grade ");
                System.out.println("2. Lowest Grade ");
                System.out.println("3. Average Grade ");
                System.out.println("4. Exit ");
                Scanner sc = new Scanner(System.in);
                String val = sc.nextLine();

                switch (val) {
                    case "1" -> {
                        System.out.println("************************ ");
                        System.out.println("Highest Grade: " + currentStudent.getRecordbook().highestGrade());
                        System.out.println("============================== ");
                    }
                    case "2" -> {
                        System.out.println("************************");
                        System.out.println("Lowest Grade: " + currentStudent.getRecordbook().lowestGrade());
                        System.out.println("============================== ");
                    }
                    case "3" -> {
                        System.out.println("************************");
                        System.out.println("Average Grade: " + currentStudent.getRecordbook().avarageGrade());
                        System.out.println("************************");
                    }
                    case "4" -> {
                        System.out.println("************************");
                        System.out.println("Program is off");
                        System.out.println("************************");
                        on++;

                    }


                    default -> System.out.println("Please choose a correct option. ");
                }
            }

        }
        }
    }





















	// write your code here


