package beaninfo;

import java.beans.*;

public class PersonBeanInfo extends SimpleBeanInfo {

    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor name = new PropertyDescriptor("name", Class.forName("beans.Person"));
            PropertyDescriptor age = new PropertyDescriptor("age", Class.forName("beans.Person"));

            return new PropertyDescriptor[]{name, age};
        } catch (Exception e) {
            return null;
        }
    }
}
