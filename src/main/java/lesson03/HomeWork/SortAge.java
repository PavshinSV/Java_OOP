package lesson03.HomeWork;

import java.util.Comparator;

public class SortAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getBirthDate().compareTo(p2.getBirthDate());
    }
}
