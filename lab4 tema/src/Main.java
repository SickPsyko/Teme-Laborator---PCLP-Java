// Ex1

import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        }
        else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
    }
}

// Ex2

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows = 3;
        int cols = 4;

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The sum of the two matrices is:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//ex 3

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int length = removeDuplicates(arr, n);

        System.out.println("The new length of the array is: " + length);
        System.out.print("The array with duplicates removed is: ");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr, int n) {

        int[] temp = new int[n];
        int j = 0;

        for(int i = 0; i < n - 1; i++) {
            if(arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];

        for(int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }
}

//Ex 4

import java.util.Random;
        import java.util.Scanner;

public class MatrixTrace {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dimension of the square matrix: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        Random rand = new Random();

        // Generate random elements for the matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(10); // Generating random integers between 0 and 9
            }
        }

        // Calculate the trace of the matrix (sum of elements on the principal diagonal)
        int trace = 0;
        for(int i = 0; i < n; i++) {
            trace += matrix[i][i];
        }

        System.out.println("The matrix is:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The trace of the matrix is: " + trace);
    }
}

//Ex5

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read in array A (String values)
        System.out.print("Enter the number of elements in array A: ");
        int n = input.nextInt();
        String[] A = new String[n];
        System.out.println("Enter the elements of array A:");
        for(int i = 0; i < n; i++) {
            A[i] = input.next();
        }

        // Read in array B (Integer values)
        System.out.print("Enter the number of elements in array B: ");
        int m = input.nextInt();
        Integer[] B = new Integer[m];
        System.out.println("Enter the elements of array B:");
        for(int i = 0; i < m; i++) {
            B[i] = input.nextInt();
        }

        // Find common elements and store them in another array
        List<String> commonElements = new ArrayList<String>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(A[i].equals(B[j])) {
                    commonElements.add(A[i]);
                    break;
                }
            }
        }

        // Print out the common elements
        System.out.print("The common elements between array A and array B are: ");
        for(String element : commonElements) {
            System.out.print(element + " ");
        }
    }
}
