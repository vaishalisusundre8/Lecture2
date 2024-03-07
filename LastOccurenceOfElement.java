package org.example.Lecture2;

import java.util.Scanner;

public class LastOccurenceOfElement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size OF Arrays : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter Occurence Element : ");
        int x=sc.nextInt();
        int ans=lastOccerence(a,x);
        System.out.println("LAST OCCURENCE OF ELEMENT : "+ans);

    }
    static int lastOccerence(int a[],int x){
        int ans=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                ans=i+1;
            }
        }
        return ans;
    }
}
