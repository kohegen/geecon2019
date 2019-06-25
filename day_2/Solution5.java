package day_2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution5
{
    public static void main(String[] args)
    {
        //  is a composite natural number with an even number of digits,
        // that can be factored into two natural numbers each with half as many digits as the original number
        // and not both with trailing zeroes, where the two factors contain precisely all the digits of the original number,
        // in any order, counting multiplicity. The first vampire number is 1260 = 21 × 60.

        int N = Integer.parseInt(args[0]);
        int numbersFound = 0;
        int lastFoundNumber = 0;
        int number = 1259;
        while (true) {
            number++;

            String numberStr = String.valueOf(number);

            if (numberStr.length() % 2 != 0) {
                //need to be even
                continue;
            }

            int factorial = factorial(numberStr.length());
            List<Character> numberAsList = numberStr.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            for (int i=0;i<factorial*4;i++) {
                //this is really nasty but I don't have time to implement permutations
                Collections.shuffle(numberAsList);

                String factor1 = toString(numberAsList.subList(0, numberAsList.size() / 2));
                String factor2 = toString(numberAsList.subList(numberAsList.size() / 2, numberAsList.size()));
                if (factor1.endsWith("0") & factor2.endsWith("0")) {
                    //both cannot have trailing zeroes
                    continue;
                }


                if (Integer.valueOf(factor1) * Integer.valueOf(factor2) == number) {
                    //found vampire!!
                    numbersFound++;
                    lastFoundNumber = number;
                    break;
                }
            }


            if (numbersFound == N) {
                System.out.println(lastFoundNumber);
                break;
            }
        }
    }

    private static int factorial(int n) {
        int factorial = 1;
        for (int i=1;i<=n;i++) {
            factorial*=i;
        }
        return factorial;
    }

    private static String toString(List<Character> chars) {
                return chars.toString()
                .substring(1, 3 * chars.size() - 1)
                .replaceAll(", ", "");
    }

}
