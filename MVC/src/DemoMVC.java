public class DemoMVC {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Shaheer Kamran");
        controller.setStudentRollNo("4125");
        controller.updateView();
        
    }

    public static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Shaheer");
        student.setRollNo("2315");
        return student;
    }
}
