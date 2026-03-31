package constrained;

import java.beans.*;

public class ConstrainedPerson {

    private int age;
    private VetoableChangeSupport vcs = new VetoableChangeSupport(this);

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }

    public void setAge(int age) throws PropertyVetoException {

        if (age < 18) {
            throw new PropertyVetoException("Invalid age", null);
        }

        this.age = age;
    }
}
