// Controller 

public class StudentController {

	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view){
		this.view = view;
		this.model = model;
	}

	public void setStudentName(String name){
		model.setName(name);
	}

	public void setStudentRoll(String roll){
		model.setRoll(roll);
	}

	public String getStudentName(){
		return model.getName();
	}

	public String getStudentRoll(){
		return model.getRoll();
	}

	public void updateView(){
		view.printStudentDetails(model.getName(), model.getRoll());
	}

}