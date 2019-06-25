import java.math.BigInteger;

public class Solution6 {
    public static void main(String[] args) {

        for (String arg : args) {
            BigInteger N = new BigInteger(arg);
            BigInteger iterator = new BigInteger("8");
            BigInteger value = new BigInteger("7");
            while (iterator.compareTo(N) != 1) {

                value = value.xor(iterator);

                iterator = iterator.add(BigInteger.ONE);
            }

            System.out.println(value);
        }
    }
}
