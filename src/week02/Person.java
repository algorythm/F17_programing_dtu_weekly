package week02;

/**
 * Created by awo on 06/02/17.
 */
public class Person implements IPerson {
    private String name;
    private CPR cpr;
    private double height;
    private double weight;

    public Person(String name, CPR cpr, double height, double weight) {
        this.name = name;
        this.cpr = cpr;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public CPR getCPR() {
        return this.cpr;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
