/**
 *
 * @author Hong Sung
 */
public class Student {

	public static final boolean GRAD_STUDENT = true;
	public static final boolean UNDERGRAD_STUDENT = false;

	private String name;
	private String nextClass;
	private boolean gradStudent;

	public Student(String name, String nextClass, boolean gradStudent) {
		this.name = name;
		this.nextClass = nextClass;
		this.gradStudent = gradStudent;
	}

	public String getName() {
		return name;
	}

	public String getNextClass() {
		return nextClass;
	}

	public boolean isGradStudent() {
		return gradStudent;
	}

        @Override
	public String toString() {
		return "name["+name+"] next_class["+nextClass+"]";
	}

}
