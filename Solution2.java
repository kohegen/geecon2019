public class Solution2
{
    public static void main(String[] args)
    {
        for (String arg : args) {
            String word = arg;
            System.out.println(word.chars().sum());
        }
    }
}
