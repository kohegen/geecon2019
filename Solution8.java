import java.math.BigInteger;

public class Solution8
{
    public static void main(String[] args)
    {
        for (String arg : args) {
            BigInteger N = new BigInteger(arg);
            int sum = 0;
            for (int i = 0; i < N.intValue(); i++) {
                if (N.testBit(i)) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
