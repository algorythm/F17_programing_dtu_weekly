package week02;

/**
 * Created by awo on 06/02/17.
 */
public class Func implements IFunc {
    @Override
    public double getBMI(Person person) {
        return person.getWeight() / Math.pow(person.getHeight(), 2);
    }

    @Override
    public String getTextualBMI(Person person) {
        double bmi = getBMI(person);

        if (bmi < 18.5)
            return "Du vejer for lidt.";
        else if (bmi >= 18.5 && bmi < 25)
            return "Din vægt er passende.";
        else if (bmi >= 25 && bmi <= 30)
            return "Du er overvægtig.";
        else if (bmi > 30)
            return "Du er svært overvægtig.";

        return "You broke it.";
    }

    @Override
    public String getName(Person person) {
        return person.getName();
    }
}
