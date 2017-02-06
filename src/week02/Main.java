package week02;
import main.Week;

/**
 * Created by awo on 06/02/17.
 */
public class Main implements Week {
    public Main() {
        run();
    }

    @Override
    public void run() {
        Data data = new Data();
        Func func = new Func();
        CLI cli = new CLI(data, func);

        for(Person p : data.people())
            System.out.println(p.getCPR());

        cli.execute();
    }
}
