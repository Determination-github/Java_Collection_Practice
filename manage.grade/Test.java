package managegrade;

public class Test {

	
	public static void main(String[] args) {
		MManageGrade model = new MManageGrade();
		VManageGrade view = new VManageGrade();
		CManageGrade controller = new CManageGrade(model, view);
	}

}
