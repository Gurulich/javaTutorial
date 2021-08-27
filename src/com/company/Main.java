package com.company;

public class Main {

    public static void main(String[] args) {
	int arraySum=0;
	int[] numbers= new int[]{12,1,8,9,1};
	for (int i=0; i<numbers.length; i++){
        arraySum += numbers[i];
        System.out.printf("arrayElement:%d Value:%d \n",i+1,numbers[i]);
    }
	System.out.print("Sum:"+arraySum);
    }
}
