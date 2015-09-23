package pie;

import java.util.Date;

public class Note {

	private int noteID;
	private Teacher teacher;
	private String noteTitle;
	private String noteDescription;
	private boolean noteIsTemplate;
	private boolean noteIsDraft;
	private boolean noteIsDeleted;
	private Date noteDateCreated;
	private Date noteDateDeleted;
	
	public int getNoteID() {
		return noteID;
	}
	
	public void setNoteID(int noteID) {
		this.noteID = noteID;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public String getNoteTitle() {
		return noteTitle;
	}
	
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	
	public String getNoteDescription() {
		return noteDescription;
	}
	
	public void setNoteDescription(String noteDescription) {
		this.noteDescription = noteDescription;
	}
	
	public boolean isNoteIsTemplate() {
		return noteIsTemplate;
	}
	
	public void setNoteIsTemplate(boolean noteIsTemplate) {
		this.noteIsTemplate = noteIsTemplate;
	}
	
	public boolean isNoteIsDraft() {
		return noteIsDraft;
	}
	
	public void setNoteIsDraft(boolean noteIsDraft) {
		this.noteIsDraft = noteIsDraft;
	}
	
	public boolean isNoteIsDeleted() {
		return noteIsDeleted;
	}
	
	public void setNoteIsDeleted(boolean noteIsDeleted) {
		this.noteIsDeleted = noteIsDeleted;
	}
	
	public Date getNoteDateCreated() {
		return noteDateCreated;
	}
	
	public void setNoteDateCreated(Date noteDateCreated) {
		this.noteDateCreated = noteDateCreated;
	}
	
	public Date getNoteDateDeleted() {
		return noteDateDeleted;
	}
	
	public void setNoteDateDeleted(Date noteDateDeleted) {
		this.noteDateDeleted = noteDateDeleted;
	}
	
}
