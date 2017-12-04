// Demo class
import java.util.Scanner;

public class MVCDemo {
	
	public static void main(String[] args) {
		Student model = getDataFromDatabase();

		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.setStudentName(model.getName());
		controller.setStudentRoll(model.getRoll());
		controller.updateView(); 
	}

	public static Student getDataFromDatabase(){
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		student.setName(scanner.nextLine());
		student.setRoll(scanner.next());
		return student;
	}
}