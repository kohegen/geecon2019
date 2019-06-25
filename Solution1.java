import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) throws IOException {

        for (String arg : args) {

            long counter = 0;
            List<String> lines = Files.readAllLines(Paths.get(arg));
            for (String line : lines) {
                if (isPalindrome(line)) counter++;
            }
            System.out.println(counter);
        }
    }

    private static boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        return word.equals(sb.reverse().toString());
    }
}
