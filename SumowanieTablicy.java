public class SumowanieTablicy {
    public static void main(String[] args) {

        int[] numbers = {2147483647, 5, 11};

        System.out.println(sumArray(numbers));
    }


    public static double sumArray(int[] numbers) {

        double sum = 0;
        
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            return sum;
    }
}
