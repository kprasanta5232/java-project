package Assignment01;

import java.util.Scanner;

public class Accdec {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {2,3,5,1,4,6,7,8,9,7,4};
	int a=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				a=arr[i];
				arr[i]=arr[j];
				arr[j]=a;
			}
		}
		System.out.println(arr[i]);
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				a=arr[i];
				arr[i]=arr[j];
				arr[j]=a;
			}
		}
		System.out.println(arr[i]);	
}
}
}
