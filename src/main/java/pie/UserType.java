package pie;

public enum UserType {

	TEACHER, PARENT, STUDENT, ADMIN;

	public static UserType getUserType(int userTypeID) {
		UserType userType = null;

		switch (userTypeID) {
		case 1:
			userType = TEACHER;
			break;
		case 2:
			userType = PARENT;
			break;
		case 3:
			userType = STUDENT;
			break;
		case 4:
			userType = ADMIN;
			break;
		}

		return userType;
	}
}
