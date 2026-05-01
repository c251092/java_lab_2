package set1.set2;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 3;

        boolean found = false;
        for (int x : arr) {
            if (x == key) found = true;
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}