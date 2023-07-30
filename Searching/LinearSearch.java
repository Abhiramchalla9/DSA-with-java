package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int x=sc.nextInt();
        boolean found=false;
        for (int i=0;i<n;i++){
            if (arr[i]==x){
                found=true;
                System.out.println("Target value found at "+i+" index of the array");
            }
        }
        if (!found){
            System.out.println("target value not found in the given array");        }

    }
    
}
