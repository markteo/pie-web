package pie;

public class Teacher extends User{

	private String teacherTitle;
	private School school;
	private boolean teacherIsSchoolAdmin;
	
	public String getTeacherTitle() {
		return teacherTitle;
	}
	
	public void setTeacherTitle(String teacherTitle) {
		this.teacherTitle = teacherTitle;
	}
	
	public School getSchool() {
		return school;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	
	public boolean isTeacherIsSchoolAdmin() {
		return teacherIsSchoolAdmin;
	}
	
	public void setTeacherIsSchoolAdmin(boolean teacherIsSchoolAdmin) {
		this.teacherIsSchoolAdmin = teacherIsSchoolAdmin;
	}
	
	
}
