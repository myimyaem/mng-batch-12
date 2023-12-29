package JavaB12.Chapter3;

import java.util.Arrays;

public class ArraysL {
    public static void main(String[] args) {
        // int[] numbers1 = new int[]{74,44,23};
        int[] numbers1 = {74,44,23};
        for(int number1: numbers1)
            System.out.println(number1);

        int ids[], types;
        ids=new int[]{1,5,7,5};
        types = 32;
        int[] ids2, types2;
        ids2=new int[]{1,5,7,5};
       
        types2 =new int[]{32};
        // int sum[] = ids+ids2;
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs); // [Ljava.lang.String;@
        System.out.println(alias);
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        // againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        // objects[0] = new StringBuilder(); // careful!

        int[] numbers = { 6, 9, 1,154,5,8,6,7,2,3,1,6,9,45,23,1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.println (numbers[i] + " ");

        String[] strings2 = { "10", "9", "100","1","21","54","31","101","220" };
            Arrays.sort(strings2);
            for (String string2 : strings2)
             System.out.print(string2 + " ");
        numbers =new int[] { 2,4,6,8,10,12,14,16,19,20};     
        System.out.println("\n the binary search result is "+Arrays.binarySearch(numbers, 18));    
        System.out.println(getaverage(95,92,97,80,87,75,84));
        //System.out.println(getaverage(95,92,97,80,87,75,84)); 
         
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};  
        System.out.println(differentSize[2][1]);    //8
        System.out.println(differentSize[1][0]);   //3 
    }
    // static float getaverage(float[] grades){
    static float getaverage(float... grades){
        float subtotal=0;
        for(float grade:grades)
            subtotal+=grade;
        return subtotal/(grades.length);
    
    
    }
    
   
}

