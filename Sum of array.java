public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // initialized array
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // add each element to sum
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

