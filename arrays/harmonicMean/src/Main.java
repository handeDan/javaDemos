public class Main {
    public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            double harmonicSum  = 0.0;

            for (int number : numbers) {
                harmonicSum  += 1.0 / number;
            }
            double harmonicMean =  (double) numbers.length / harmonicSum;
        System.out.println("Harmonik Ortalama: " + harmonicMean );
        }
}