package array;

import java.util.Scanner;

public class TwoDWavePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        // Input values into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print array elements in wave pattern
        System.out.println("Wave pattern printing:");
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) { // For even rows, print left to right
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else { // For odd rows, print right to left
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close();
    }
}
