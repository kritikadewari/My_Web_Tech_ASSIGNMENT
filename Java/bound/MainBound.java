package bound;

public class MainBound {
    public static void main(String[] args) {

        BoundPerson p = new BoundPerson();

        p.addPropertyChangeListener(evt -> {
            System.out.println("Changed: " + evt.getPropertyName());
        });

        p.setName("Kritika");
    }
}
