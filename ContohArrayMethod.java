public class ContohArrayMethod {
        public static int findMaxValue(int[] array) {
            int maxValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
            return maxValue;
        }

        public static void main(String[] args) {
            int[] scores = {90, 70, 80, 95, 85};
            int maxValue = findMaxValue(scores);
            System.out.println("Maximum value: " + maxValue);
        }


}
