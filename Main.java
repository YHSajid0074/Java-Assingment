package org.example;
import java.util.*;

import org.example.info;

import java.util.Comparator;
class CgpaComparator implements Comparator<info> {
    public int compare(info info1, info info2) {
        return Double.compare(info2.cgpa, info1.cgpa);
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<info>work=new ArrayList<>();
        System.out.println("Enter how many info do you want :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            sc.nextLine();
            System.out.println("enter your name :");
            String s=sc.nextLine();

                System.out.println("enter your city : ");
                String k = sc.nextLine();
            System.out.println("enter your university name:");
            String sa=sc.nextLine();
            System.out.println("enter your cgpa:  ");
            double f=sc.nextDouble();

            try {
                if(k==null || k==" "){
                    throw  new nullException();
                }
            }catch(nullException e){
                System.out.println(e.getMessage());

            }
            try {
                if (f < 2.50) {
                    throw new lowcgpa();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            work.add(new info(s, k,sa, f));
        }
        work.sort(new CgpaComparator());

        for (info fo : work) {
            System.out.println("Name: " + fo.name);
            System.out.println("City: " + fo.city);
            System.out.println("University: " + fo.university);
            System.out.println("CGPA: " + fo.cgpa);
            System.out.println();
        }
    }
}