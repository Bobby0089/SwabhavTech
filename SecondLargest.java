package Array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        // Taking input for array size
        System.out.print("Enter the size for array: ");
        int size = userInput.nextInt();
       

        int[] arr = new int[size];

        // Taking input for array elements
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = userInput.nextInt();
        }

        // Initializing largest and second largest
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE; // Minimum possible integer value

        
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > largest)
            { 
                // Update second largest before updating largest
                secondLargest = largest;
                largest = arr[i];            
            }
            else if (arr[i] > secondLargest && arr[i] != largest)
            {
                // Update second largest only if it's smaller than current element
                secondLargest = arr[i];
            }
        }
        
        System.out.println("Second maximum element in array is: " + secondLargest);
        
        userInput.close(); // Closing scanner to prevent resource leak
    }
}
