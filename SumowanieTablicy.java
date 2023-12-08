public class SumowanieTablicy {
    public static void main(String[] args) {

        int[] numbers = {2147483647, 5, 11};

        System.out.println(sumArray(numbers));
    }


    public static int sumArray(int[] numbers) {
        boolean isNegative = false;
        int sum = 0;


            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
                if(numbers[i] < 0) {
                    isNegative = true;
                }
            }

            if((sum < 0) && isNegative == false) {
                System.out.println("Suma podanych liczb przekracza zakres typu danych.\n" +
                        "Podaj mniejsze wartości.");
                return 0;
            }
            return sum;
    }
}
