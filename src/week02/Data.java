package week02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by awo on 06/02/17.
 */
public class Data implements IData {
    private List<Person> people;

    public Data() {
        this.people = new ArrayList<>();
        initTestData();
    }

    private void initTestData() {
        people.add(new Person("Hans", new CPR(10, 12, 92, 1111), 1.23, 87));
        people.add(new Person("Grethe", new CPR(21, 11, 90, 4444), 1.64, 65));
        people.add(new Person("Bjarne", new CPR(10, 12, 87, 1235), 2.13, 135));
    }

    public Person getPerson(CPR cpr) {
        return people.stream()
                .filter(x -> x.getCPR().equals(cpr))
                .findAny()
                .orElse(null);
    }

    public List<Person> people() {
        return this.people;
    }
}
