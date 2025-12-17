
import java.util.Arrays;

public class twins {
                static int twins(int num, String values) {
                                String[] coinsStr = values.split("\\s");
                                int[] coins = new int[coinsStr.length];
                                int sum = 0;
                                for (int i = 0; i < coinsStr.length; i++) {
                                                coins[i] = Integer.parseInt(coinsStr[i]);
                                                sum += coins[i];
                                }

                                Arrays.sort(coins);
                                int strictSum = 0;
                                int count = 0;
                                for (int i = num - 1; i >= 0; i--) {
                                                strictSum += coins[i];
                                                count++;

                                                if (strictSum > sum / 2) {
                                                                return count;
                                                }
                                }
                                return count;
                }

                public static void main(String[] args) {
                                System.out.println(twins(5, "4 4 5 2 3"));
                }
}
