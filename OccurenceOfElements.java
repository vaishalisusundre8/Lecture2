package org.example.Lecture2;

import java.util.Scanner;

public class OccurenceOfElements {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size OF Array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Element : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter Occurence Element : ");
        int x=sc.nextInt();

        System.out.println("OCCURENCE OF "+x+" Is : "+chcekcOccurence(a,x));
    }
    static int chcekcOccurence(int a[],int x){

        int cnt=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                cnt++;
            }
        }

        return cnt;
    }
}
