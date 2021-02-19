package main;

import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Student> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int studentsA = sc.nextInt();
        int sCode;

        for(int i = 0; i < studentsA; i++) {
            sCode = sc.nextInt();
            set.add(new Student(sCode));
        }

        System.out.print("How many students for course B? ");
        int studentsB = sc.nextInt();

        for(int i = 0; i < studentsB; i++) {
            sCode = sc.nextInt();
            set.add(new Student(sCode));
        }

        System.out.print("How many students for course C? ");
        int studentsC = sc.nextInt();

        for(int i = 0; i < studentsC; i++) {
            sCode = sc.nextInt();
            set.add(new Student(sCode));
        }

        System.out.println("Total students: " + set.size());
    }
}
