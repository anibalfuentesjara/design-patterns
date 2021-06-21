package template;

public class TemplatePattern {

	public static void main(String[] args) {
		Worker engineer = new Engineer();
		Worker teacher = new Teacher();

		System.out.println("Engineer daily routine");
		engineer.dailyRoutine();

		System.out.println("\nTeacher daily routine");
		teacher.dailyRoutine();

	}

}