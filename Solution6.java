import java.math.BigInteger;

public class Solution6 {
    public static void main(String[] args) {
        BigInteger N = new BigInteger(args[0]);
        BigInteger iterator = new BigInteger("8");
        BigInteger value = new BigInteger("7");
        while (iterator.compareTo(N) != 1) {

            value = value.xor(iterator);

            iterator = iterator.add(BigInteger.ONE);
        }

        System.out.println(value);
    }
}
