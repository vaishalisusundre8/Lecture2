package org.example.Lecture2;

import java.util.Scanner;

public class CheckArraySortedOrNot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Arrays :");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Is Sorted : "+isSortedOrNot(a));
    }
    static boolean isSortedOrNot(int a[]){

        boolean check=true;
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]){
                check=false;
            }
        }
        return check;
    }
}
