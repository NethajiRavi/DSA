package arraylist;

public class LargestElementInArray {

    public static int largestElement(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] a =  new int[] {3};
        System.out.println(largestElement(a));

    }
}
