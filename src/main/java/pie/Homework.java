package pie;

import java.util.Date;

public class Homework {

	private int homeworkID;
	private Teacher teacher;
	private String homeworkTitle;
	private String homeworkSubject;
	private String homeworkDescription;
	private int homeworkMinutesRequired;
	private Date homeworkDueDate;
	private boolean homeworkOpen;
	private Date homeworkDateCreated;
	private boolean homeworkIsDraft;
	private boolean homeworkIsTemplate;
	private boolean homeworkIsDeleted;
	private Date homeworkDateDeleted;

	public int getHomeworkID() {
		return homeworkID;
	}
	
	public void setHomeworkID(int homeworkID) {
		this.homeworkID = homeworkID;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public String getHomeworkTitle() {
		return homeworkTitle;
	}
	
	public void setHomeworkTitle(String homeworkTitle) {
		this.homeworkTitle = homeworkTitle;
	}
	
	public String getHomeworkSubject() {
		return homeworkSubject;
	}
	
	public void setHomeworkSubject(String homeworkSubject) {
		this.homeworkSubject = homeworkSubject;
	}
	
	public String getHomeworkDescription() {
		return homeworkDescription;
	}
	
	public void setHomeworkDescription(String homeworkDescription) {
		this.homeworkDescription = homeworkDescription;
	}
	
	public int getHomeworkMinutesRequired() {
		return homeworkMinutesRequired;
	}
	
	public void setHomeworkMinutesRequired(int homeworkMinutesRequired) {
		this.homeworkMinutesRequired = homeworkMinutesRequired;
	}
	
	public Date getHomeworkDueDate() {
		return homeworkDueDate;
	}
	
	public void setHomeworkDueDate(Date homeworkDueDate) {
		this.homeworkDueDate = homeworkDueDate;
	}
	
	public boolean isHomeworkOpen() {
		return homeworkOpen;
	}
	
	public void setHomeworkOpen(boolean homeworkOpen) {
		this.homeworkOpen = homeworkOpen;
	}
	
	public Date getHomeworkDateCreated() {
		return homeworkDateCreated;
	}
	
	public void setHomeworkDateCreated(Date homeworkDateCreated) {
		this.homeworkDateCreated = homeworkDateCreated;
	}
	
	public boolean isHomeworkIsDraft() {
		return homeworkIsDraft;
	}
	
	public void setHomeworkIsDraft(boolean homeworkIsDraft) {
		this.homeworkIsDraft = homeworkIsDraft;
	}
	
	public boolean isHomeworkIsTemplate() {
		return homeworkIsTemplate;
	}
	
	public void setHomeworkIsTemplate(boolean homeworkIsTemplate) {
		this.homeworkIsTemplate = homeworkIsTemplate;
	}
	
	public boolean isHomeworkIsDeleted() {
		return homeworkIsDeleted;
	}
	
	public void setHomeworkIsDeleted(boolean homeworkIsDeleted) {
		this.homeworkIsDeleted = homeworkIsDeleted;
	}
	
	public Date getHomeworkDateDeleted() {
		return homeworkDateDeleted;
	}
	
	public void setHomeworkDateDeleted(Date homeworkDateDeleted) {
		this.homeworkDateDeleted = homeworkDateDeleted;
	}
	
}
