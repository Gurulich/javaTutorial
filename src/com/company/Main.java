package com.company;

public class Main {

    public static void main(String[] args) {
        Main object= new Main();
	int[] numbers= new int[]{12,1,8,9,1};
	float[] floatNums=new float[]{1.5f,2.5f,3.5f};
    int intArray=object.arraySum(numbers);
    float floArray= object.arraySum(floatNums);
    int intArrayDo=object.arraySumDo(numbers);
    int intArrayWhile=object.arraySumWhile(numbers);
    System.out.println(String.format("Sum is:%d",intArray));
    System.out.println(String.format("Sum is:%f",floArray));
    System.out.println(String.format("Sum is:%d",intArrayDo));
    System.out.println(String.format("Sum is:%d",object.arraySumWhile(numbers)));

    }
    public int  arraySum(int[] array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
            System.out.printf("arrayElement:%d Value:%d \n",i+1,array[i]);
        }
        return sum;
    }
    public float  arraySum(float[] array){
        float sum=0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
            System.out.printf("arrayElement:%d Value:%f \n",i+1,array[i]);
        }
        return sum;
    }
    public int  arraySumDo(int[] array){
        int i=0;
        int sum=0;
        do{
            sum += array[i];
            i++;
        }
        while (i<array.length);
        return sum;
    }
    public int  arraySumWhile(int[] array){
        int i=0;
        int sum=0;
        while (i<array.length){
            sum += array[i];
            i++;
        }
        return sum;
    }
}
