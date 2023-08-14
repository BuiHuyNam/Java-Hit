package Buoi3;

import java.util.Scanner;

public class Bai2 {
    static void Nhap_mang(int a[], int n){
        Scanner sc = new Scanner(System.in);
        for( int i=0; i<n; i++){
            System.out.print("Nhap a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }

    static void Xuat_mang(int a[], int n){
        for(int i=0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
    }

    static void Insert(int a[], int n, int k, int h){

        if(k<1 || k>n){
            System.out.println("Vị trí không hợp lệ");
        }
        else {

            int []new_array = new int[n+1];
            for(int i=0; i<n; i++){
                new_array[i]=a[i];
            }

            for(int i=n; i>=k; i--){
                new_array[i]=new_array[i-1];
            }
            new_array[k-1]=h;
            n++;


            System.out.print("Mang vua chen la: ");
            Xuat_mang(new_array,n);
        }

    }

    static void Delete(int a[], int n, int k){
        if(k<1 || k>n){
            System.out.println("Vị trí không hợp lệ");
        }
        else {
            for(int i=k-1; i<n-1; i++){
                a[i]=a[i+1];
            }
            n--;
            System.out.print("Mang vua xoa la: ");
            Xuat_mang(a,n);
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

        System.out.print("\nNhap gia tri can chen la: ");
        int value_insert = sc.nextInt();
        System.out.print("Nhap vi tri chen la: ");
        int index_insert = sc.nextInt();

        Insert(a,n,index_insert,value_insert);

        System.out.print("\nNhap vi tri can xoa la: ");
        int index_delete = sc.nextInt();
        Delete(a,n,index_delete);

    }
}
