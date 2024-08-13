package fun;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < T; i++) {
            String N = scanner.nextLine();
            System.out.println(minimumCyclesToNextPermutation(N));
        }
    }

    private static int minimumCyclesToNextPermutation(String N) {
        char[] digits = N.toCharArray();
        Arrays.sort(digits);
        String sortedDigits = new String(digits);

        int original = Integer.parseInt(N);
        int minPermutation = Integer.MAX_VALUE;

        do {
            int permutation = Integer.parseInt(new String(digits));
            if (permutation > original) {
                minPermutation = Math.min(minPermutation, permutation);
            }
        } while (nextPermutation(digits));

        if (minPermutation == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minPermutation - original;
        }
    }

    private static boolean nextPermutation(char[] array) {
        int i = array.length - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }
        if (i == -1) {
            return false;
        }
        int j = array.length - 1;
        while (array[j] <= array[i]) {
            j--;
        }
        swap(array, i, j);
        reverse(array, i + 1, array.length - 1);
        return true;
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            swap(array, start++, end--);
        }
    }
}


