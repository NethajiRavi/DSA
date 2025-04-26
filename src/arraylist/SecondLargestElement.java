package arraylist;

public class SecondLargestElement {


    public static int secondLargestElement(int[] num) {
        int largestElement = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int j : num) {
            if (j > largestElement) {
                secondLargest = largestElement;
                largestElement = j;
            } else if (j > secondLargest && j < largestElement) {
                secondLargest = j;
            }
        }

        if(secondLargest< 0){
            return -1;
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int[] a  = new int []{10, 10, 10, 10, 10};
        System.out.println(secondLargestElement(a));

    }
}
