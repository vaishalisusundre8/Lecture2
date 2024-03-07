package org.example.Lecture2;

import java.util.Scanner;

public class ReturenSmallestAndLargestElement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size OF Array : ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int ans[]=returnsmallAndlarge(a);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
    static int[] returnsmallAndlarge(int a[]){

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int ans[]=new int[2];
        ans[0]=a[0];
        ans[1]=a[a.length-1];
        return ans;
    }
}
