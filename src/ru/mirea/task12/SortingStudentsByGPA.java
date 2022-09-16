package ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSrBall() - o2.getSrBall();
    }

    public void quicksort(Student []students, int low, int high){
        if (students.length == 0){
            return;
        }
        if (low >= high){
            return;
        }
        int middle = low +(high - low)/2;
        Student student = students[middle];
        int i = low, j = high;
        while (i <= j){
            while (compare(students[i],student)>0){
                i++;
            }
            while (compare(students[j],student) <0){
                j--;
            }
            if (i <= j){
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
            if ( low < j ){
                quicksort(students,low,j);
            }
            if (high > i ){
                quicksort(students,i,high);
            }
        }

    }
    public void mergeSort(Student []student,int left,int right){
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(student,left,mid);
        mergeSort(student,mid+1,right);
        merge(student,left,mid,right);
    }

    private void merge(Student []student, int left, int mid, int right) {
        int lengthLeft = mid - left +1;
        int lengthRigiht = right - mid;
        Student []leftStudents = new Student[lengthLeft];
        Student []rightStudent = new Student[lengthRigiht];
        for (int i = 0 ; i< lengthLeft; i++){
            leftStudents[i] = student[left+i];
        }
        for (int i = 0 ; i< lengthRigiht; i++){
            rightStudent[i] = student[mid+i+1];
        }
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = left; i< right+ 1; i ++){
            if (leftIndex < lengthLeft && rightIndex < lengthRigiht){
                if (compare(leftStudents[leftIndex],rightStudent[rightIndex])>0){
                    student[i] = leftStudents[leftIndex];
                    leftIndex ++;
                }
                else{
                    student[i] = rightStudent[rightIndex];
                    rightIndex++;
                }
            }
            else if(leftIndex < lengthLeft){
                student[i] = leftStudents[leftIndex];
                leftIndex++;
            }
            else if (rightIndex <lengthRigiht){
                student[i] = rightStudent[rightIndex];
                rightIndex++;
            }
        }
    }
}
