package sorting.bubble;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        //start at the beggining and compare first two elemets
        // and switch in the case of bigger one. 
        
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i =0;i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }
        // antes da ordenacao / before sort 
        printArray(numbers);
        
        bubbleSort(numbers);

        printArray(numbers);
        
    }

    private static void bubbleSort(int[] numbers) {
        
        Boolean keepSwap = true;
        // switch numbers
        while (keepSwap) {
            keepSwap = false;
            for (int i=0; i < numbers.length - 1 ; i ++) {

                if (numbers[i]>numbers[i+1]) {
                    //set keepswap true; 
                    keepSwap = true;
                    // keep biggest number
                    int temp = numbers[i];
                    // change smallest number to first position
                    numbers[i] = numbers[i+1];
                    // keep biggest into next position
                    numbers[i+1] = temp;
                }
            }
        }


    }

    private static void printArray(int[] numbers) {

        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println("ARRAY ###");

    }
}
