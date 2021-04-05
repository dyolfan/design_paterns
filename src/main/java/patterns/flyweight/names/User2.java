package patterns.flyweight.names;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class User2 {
    static List<String> strings = new ArrayList<>();

    private int[] names;

    public User2(String fullName) {
        Function<String, Integer> getOrAdd = (String s) -> {
            int index = strings.indexOf(s);
            if (index != -1) {
                return index;
            }

            strings.add(s);
            return strings.size() - 1;
        };

        names = Arrays.stream(fullName.split(" "))
                .mapToInt(getOrAdd::apply)
                .toArray();
    }
}
