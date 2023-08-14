package Buoi3;

import java.util.Scanner;

public class Bai3 {
    static void Nhap_mang(int a[], int n){
        Scanner sc = new Scanner(System.in);
        for( int i=0; i<n; i++){
            System.out.print("Nhap a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }

    static  void Xuat_mang(int a[], int n){
        for(int i=0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
    }
    static void Bubble_sort(int a[], int n){
        int tg;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                if(a[j]<a[j-1]){
                    tg=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tg;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        int []a = new int[n];
        Nhap_mang(a,n);
        System.out.print("Mang vua nhap la: ");
        Xuat_mang(a,n);

        Bubble_sort(a,n);
        System.out.print("\nMang vua sap xep tang dan la: ");
        Xuat_mang(a,n);
    }
}
