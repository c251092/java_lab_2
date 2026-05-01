package set1.set2;

public class ArrayStats {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        int max = arr[0], min = arr[0], sum = 0;

        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
            sum += x;
        }

        double avg = (double) sum / arr.length;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
    }
}