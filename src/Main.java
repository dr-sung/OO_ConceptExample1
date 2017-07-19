import java.util.ArrayList;

/**
 * @author Hong Sung
 * Bad example of OO Program. This is not a real OO program.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Student> classRoll = new ArrayList<>();
        classRoll.add(new Student("John", "OOP", Student.UNDERGRAD_STUDENT));
        classRoll.add(new Student("Mary", "P2", Student.GRAD_STUDENT));
        classRoll.add(new Student("Suzan", "P1", Student.UNDERGRAD_STUDENT));
        classRoll.add(new Student("Tom", "P1", Student.UNDERGRAD_STUDENT));
        classRoll.add(new Student("Sue", "P2", Student.GRAD_STUDENT));
        classRoll.add(new Student("Smith", "OOP", Student.UNDERGRAD_STUDENT));

        for (Student s : classRoll) {
            String name = s.getName();
            String nextClass = s.getNextClass();
            String location = InfoSystem.getLocation(nextClass);
            String direction = InfoSystem.getDirection(location);

            System.out.print("\nHey, " + name + "!");
            if (s.isGradStudent()) {
                System.out.println(" Collect course evaluation first!");
            }
            System.out.println("\tYour next class is " + nextClass);
            System.out.println("\tLocation is " + location);
            System.out.println("\tDirection is " + direction);
        }

    }

}
