import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsorted = new int[] { 2, 8, 1, 3, 6, 9, 7, 5, 0, 4 };
        int[] sorted = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] result = insertion_sort(unsorted);
        if (!Arrays.equals(sorted, result)) {
            System.out.println(Arrays.toString(result));
            throw new IllegalStateException("Not sorted");
        }
        System.out.println("Well done.");
    }

    public static int[] insertion_sort(int[] unsorted) {
        int[] result = Arrays.copyOf(unsorted, unsorted.length);

        for (int i = 1; i < result.length; i++) {
            int key = result[i];
            int j = i - 1;
            while (j >= 0 && result[j] > key) {
                result[j + 1] = result[j--];
            }
            result[j + 1] = key;
        }

        return result;
    }
}
