public class Homework3 {
    public static void main(String[] args) {
        int shuttle = 0;
        for (int num = 1; shuttle < 100; num++) {
            boolean hasFourOrNine = false;
            int tempNum = num;
            for (; tempNum > 0; tempNum /= 10) {
                int digit = tempNum % 10;
                if (digit == 4 || digit == 9){
                    hasFourOrNine = true;
                    break;
                }

            }
            if (!hasFourOrNine){
                System.out.println(++shuttle + ": " + num);
            }

        }
    }
}
