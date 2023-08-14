package Buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
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

    static int Dem(int a[],int n, int x){
        int count = 0;
        for(int i=0; i<n; i++){
            if(x == a[i]){
                count++;
            }
        }
        return count;
    }

    static void Dem_pt(int a[], int n){
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<i; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==0) {
                System.out.print("\nSố " + a[i] + " xuat hien " + Dem(a, n, a[i]) + " lan. ");
            }else {
                continue;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        int []a = new int[n];
        Nhap_mang(a,n);
        System.out.print("Mang vua nhap la: ");
        Xuat_mang(a,n);

        Dem_pt(a,n);

    }
}
