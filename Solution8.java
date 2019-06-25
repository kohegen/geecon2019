import java.math.BigInteger;

public class Solution8
{
    public static void main(String[] args)
    {
        BigInteger N = new BigInteger(args[0]);
        int sum = 0;
        for (int i=0;i<N.intValue();i++) {
            if (N.testBit(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
