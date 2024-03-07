package org.example.Lecture2;

import java.util.Scanner;

public class FirstOccurenceOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Arrays : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter "+n+" Element : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter OCCURENCE ELEMENT : ");
        int x=sc.nextInt();

        System.out.println("FIRST OCCURENCE OF "+x+" IS : "+checkFirstOccurence(a,x));

    }
    static int checkFirstOccurence(int a[],int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                return i+1;
            }
        }
        return -1;
    }
}
