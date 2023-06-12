public class Printsubarray {
    public static void subarray(int numbers[]) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    sum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println("The sum is " + sum);
            System.out.println();
            sum = 0; 
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12 };
        subarray(numbers);
    }
}
