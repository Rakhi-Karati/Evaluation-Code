
import java.util.Scanner;

public class SecondLargest{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int secondLargest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

            if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest unique element does not exist.");
        } else {
            System.out.println("Second largest unique element: " + secondLargest);
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest unique element does not exist.");
        } else {
            System.out.println("Second smallest unique element: " + secondSmallest);
        }

        sc.close();
    }
}
