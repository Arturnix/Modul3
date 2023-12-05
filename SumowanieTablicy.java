public class SumowanieTablicy {
    public static void main(String[] args) {

        int[] numbers = {1, 5, 11};

        System.out.println(sumArray(numbers));
    }

    public static int sumArray(int[] numbers) {

        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}
