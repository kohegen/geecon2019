public class Solution7
{
    public static void main(String[] args)
    {
        String word = args[0];
        System.out.println(word.split("(?<!/),").length);
    }
}
