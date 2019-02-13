package com.javarush.task.task13.task1327;

import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i);
            second = items.get(i-1);
            first.pull(second);
        }
    }
}
//        plot.add(new Person("Репка", "Репку"));
//        plot.add(new Person("Дедка", "Дедку"));
//        plot.add(new Person("Бабка", "Бабку"));first
//        plot.add(new Person("Внучка", "Внучку"));second