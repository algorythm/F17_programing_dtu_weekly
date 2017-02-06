package week02;

import java.util.Scanner;

/**
 * Created by awo on 06/02/17.
 */
public class CLI {
    private Data data;
    private Func func;

    public CLI(Data data, Func func) {
            this.data = data;
            this.func = func;
    }

    public void execute() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Indtast CPR: ");
        CPR cpr = CPR.stringToCPR(scn.nextLine());
        printTextualBMI(cpr);
    }

    public void printTextualBMI(CPR cpr) {
        Person person = data.getPerson(cpr);
        System.out.println("BMI = " + func.getBMI(person));
        System.out.println(func.getTextualBMI(person));
    }
}
