package patterns.factory.abstractfactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.reflections.Reflections;

class HotDrinkMachine {
    private List<Map.Entry<String, HotDrinkFactory>> nameFactories;

    public HotDrinkMachine() throws Exception {
        var types = new Reflections("patterns.factory.abstractfactory").getSubTypesOf(HotDrinkFactory.class);
        Map<String, HotDrinkFactory> namedFactoriesMap = new HashMap();

        for (var type : types) {
            namedFactoriesMap.put(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            );
        }

        nameFactories = namedFactoriesMap.entrySet().stream().collect(Collectors.toList());
    }

    public HotDrink makeDrink() throws Exception {
        for (int i = 0; i < nameFactories.size(); i++) {
            System.out.println(i + ": " + nameFactories.get(i).getKey());
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i, amount;

            if ((s = bufferedReader.readLine()) != null
                    && (i = Integer.parseInt(s)) >= 0
                    && i < nameFactories.size()) {
                System.out.println("Specify amount:");
                s = bufferedReader.readLine();
                if (s != null && (amount = Integer.parseInt(s)) > 0) {
                    return nameFactories.get(i).getValue().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again");
        }
    }
}
