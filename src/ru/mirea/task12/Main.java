package ru.mirea.task12;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
            SortingStudentsByGPA sort = new SortingStudentsByGPA();
            System.out.println("Введите колличество студентов");
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            System.out.println("Введите баллы студентов");
            Student [] students = new Student[k];
            for (int i = 0;i < students.length;i++){
                int m = scanner.nextInt();
                students[i]= new Student(m);
            }
            sort.quicksort(students,0,students.length-1);
            System.out.println("Отсортированный массив | Быстрая сортировка");
            for(int i = 0;i < students.length;i++){
                System.out.print(students[i].getSrBall()+" ");
            }
            System.out.println();
            System.out.println("Введите баллы студентов");
            for (int i = 0;i < students.length;i++){
                int m = scanner.nextInt();
                students[i]= new Student(m);
            }
            sort.mergeSort(students,0,students.length-1);
            System.out.println("Отсортированный массив | Сортировка слиянием");
            for(int i = 0;i < students.length;i++){
                System.out.print(students[i].getSrBall()+" ");
            }
        }
    }

