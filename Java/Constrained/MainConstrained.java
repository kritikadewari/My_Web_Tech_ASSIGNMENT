package constrained;

import java.beans.*;

public class MainConstrained {
    public static void main(String[] args) {

        ConstrainedPerson p = new ConstrainedPerson();

        try {
            p.setAge(20);
            System.out.println("Valid age set");
        } catch (PropertyVetoException e) {
            System.out.println("Invalid age");
        }
    }
}
