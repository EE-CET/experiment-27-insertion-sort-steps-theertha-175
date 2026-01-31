import java.util.Scanner;

public class InsertionSortSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int e = arr[n - 1];
        int i = n - 2;

        while (i >= 0 && arr[i] > e) {
            arr[i + 1] = arr[i];
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
            i--;
        }

        arr[i + 1] = e;
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);
            if (j < n - 1) System.out.print(" ");
        }

        sc.close();
    }
}

