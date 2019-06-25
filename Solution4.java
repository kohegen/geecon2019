import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
    public static void main(String[] args)
    {
        for (String arg : args) {
            Integer N = Integer.valueOf(arg) - 1;

            List<Integer> current = Arrays.asList(1);
            for (int n = 0; n < N; n++) {
                List<Integer> next = new ArrayList<>();

                int previous = 0;
                List<Integer> group = new ArrayList<>();


                for (int i = 0; i < current.size(); i++) {

                    Integer actual = current.get(i);

                    if (isFirstElement(previous)) {
                        //no values before
                        group.add(actual);
                    }

                    if (previousElementWasEqual(previous, actual)) {
                        //if the same value before
                        group.add(actual);
                    }

                    if (!previousElementWasEqual(previous, actual) && !isFirstElement(previous)) {
                        addGroup(next, group);
                        group = new ArrayList<>();
                        group.add(actual);
                    }


                    if (isLastElement(i, current.size() - 1)) {
                        addGroup(next, group);
                    }

                    previous = actual;
                }
                current = next;
            }

            System.out.println(current.stream().reduce((integer, integer2) -> integer + integer2).get());
        }
    }

    private static void addGroup(List<Integer> next, List<Integer> group) {
        if (group.size() == 1) {
            //if group is one element then add 1 at start
            next.add(1);
            next.add(group.get(0));
        } else {
            //in other case we can assume that there are same elements in group
            //so we increment first one
            Integer first = group.get(0);
            next.add(group.size());
            next.add(first);
        }
    }

    private static boolean isLastElement(int i, int i2) {
        return i == i2;
    }

    private static boolean previousElementWasEqual(int previous, Integer value) {
        return previous == value;
    }

    private static boolean isFirstElement(int previous) {
        return previous == 0;
    }
}
