
package com.mycompany.student.grade.calcuator;

import java.util.*;
import java.util.Scanner;

public class StudentGradeCalcuator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("***Student Grade Calculator***");
        System.out.println("--------------------------------------------------------");
        System.out.println("Enter marks for six subject");
        
        System.out.print("English = ");
        int english=sc.nextInt();
        
        System.out.print("Marathi = ");
        int marathi=sc.nextInt();
        
        System.out.print("Hindi = ");
        int hindi=sc.nextInt();
        
        System.out.print("Physics = ");
        int physics=sc.nextInt();
        
        System.out.print("Chemistry = ");
        int chemistry=sc.nextInt();
        
        System.out.print("Biology = ");
        int biology=sc.nextInt();
        
        System.out.println("Result:");
        int total=english+marathi+hindi+physics+chemistry+biology;
        System.out.println("Total marks = "+total);
        
        double average=total/6;
        System.out.println("Average Percentage = "+average+"%");
        
        if(average>=90){
            System.out.println("Grade = A+");

        }else if(average>=80){
            System.out.println("Grade = A");
            
        }else if(average>=70){
            System.out.println("Grade = B+");
            
        }else if(average>=60){
            System.out.println("Grade = B");
        }else if(average>=50){
            System.out.println("Grade = C");
            
        }else if(average>=40){
            System.out.println("Grade = D");
            
        }else if(average<=40){
            System.out.println("You are Fail");
            
        }
    }
}
