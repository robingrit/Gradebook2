package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogue {




    private List<Student> Studentsname;

    public Catalogue(String betyg ) {

        Studentsname = new ArrayList<>();
    }






    public List<Student> getStudentsname() {


        return Studentsname;
    }
    public void LoadStudent(){
        File f1 = new File("C:\\Users\\Rezz\\IdeaProjects\\Gradebook\\src\\com\\company\\Student.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Student> StudentList= new ArrayList<>();
        while(scanner.hasNextLine()){
            String data[]=scanner.nextLine().split(",");

            StudentList.add(new Student(Integer.parseInt(data[0]),data[1],data[2],data[3]));
        }
        scanner.close();
        System.out.println(StudentList);
        for (Student S : StudentList){
            System.out.println(S);
        }
    }

    public void AddStudent(Student student){
        Studentsname.add(student);
    }
}
