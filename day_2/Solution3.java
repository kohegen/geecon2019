package day_2;

public class Solution3
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);

        if (N < 2) {
            System.out.println(N);
        }

        if (N >= 2) {
            int n2 = 0;
            int n1 = 1;
            int current = 0;

            for (int i=1;i<N;i++) {
                current = n2 + n1;
                n2 = n1;
                n1 = current;
            }
            System.out.println(current);
        }
    }
}
