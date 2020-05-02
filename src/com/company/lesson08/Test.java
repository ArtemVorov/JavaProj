package com.company.lesson08;
// for while do/while

public class Test {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            int j = 0;
            while (j < 5) {
                System.out.println("inner " + j);
                j++;
            }
            System.out.println("text " + i);
        }

/*        int i = 0;
        while (i < 10){
            System.out.println("text " + i);
            i++;

            int j = 0;
            while (j < 10) {
                System.out.println("text " + j);
                j++;
            }
        }

        int j = 0;
        do{
            System.out.println("text " + j);
            j++;
        }while (j < 10);*/
    }
}
