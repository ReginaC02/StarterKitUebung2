package org.campus02.arrays;

public class ArrayHelper {


    public static void main(String[] args) {



    }

    public static void arrangeOrder (int[] numbers){

        int [] array = {8,5,1,9,0,4};



        for (int count = 0; count < array.length; count++) {
            for (int next = count + 1; next < array.length; next++) {
                if(array[count] > array[next]){
                    int temp = array[count];
                    array[count] = array[next];
                    array[next] = temp;
                }
             }
        }

        System.out.println("sortierte Liste " + array.toString());
    }
}
