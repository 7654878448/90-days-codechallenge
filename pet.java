package array;

public class pet {
	
	    public static void main(String[] args) {
	        int n = 4;  // Number of rows

	        for (int i = 1; i <= n; i++) {
	            // Print spaces for indentation
	            for (int j = 1; j < i; j++) {
	                System.out.print("   ");
	            }

	            // Print products in the pattern
	            int currentProduct = i;
	            for (int k = i; k <= 2 * n - i; k++) {
	                System.out.print(currentProduct);
	                if (k != 2 * n - i) {
	                    System.out.print("   ");
	                }
	                currentProduct *= (k + 1);
	            }

	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	}



