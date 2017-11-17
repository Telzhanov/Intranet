import java.util.HashMap;
import java.util.Vector;

public class Student extends User {
	int yearOfStudy;
	Degree degree;
	Mark mark;
	Transcript transcript;
	Attendance attendance;
	Schedule schedule;
	Faculty faculty;
	HashMap<Course,Teacher> ownCourses;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((attendance == null) ? 0 : attendance.hashCode());
		result = prime * result + ((courses == null) ? 0 : courses.hashCode());
		result = prime * result + ((degree == null) ? 0 : degree.hashCode());
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
		result = prime * result + ((transcript == null) ? 0 : transcript.hashCode());
		result = prime * result + yearOfStudy;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (attendance == null) {
			if (other.attendance != null)
				return false;
		} else if (!attendance.equals(other.attendance))
			return false;
		if (courses == null) {
			if (other.courses != null)
				return false;
		} else if (!courses.equals(other.courses))
			return false;
		if (degree != other.degree)
			return false;
		if (mark == null) {
			if (other.mark != null)
				return false;
		} else if (!mark.equals(other.mark))
			return false;
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		if (transcript == null) {
			if (other.transcript != null)
				return false;
		} else if (!transcript.equals(other.transcript))
			return false;
		if (yearOfStudy != other.yearOfStudy)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return   "Student [" + super.toString()+ "yearOfStudy=" + yearOfStudy + ", degree=" + degree + ", mark=" + mark + ", transcript="
				+ transcript + ", attendance=" + attendance + ", schedule=" + schedule + ", courses=" + courses + "]";
	}
	void addCourse(Course course) {
		
	}
	void deleteCourse(Course course) {
	
	}
	Vector<Course> viewListCourse() {
		return this.courses;
	}
	Schedule viewTeacherSchedule(Teacher teacher) {
		Schedule schedule = null;
		return schedule;
	}
	Vector<Teacher> viewListTeacher() {
		Vector<Teacher> listTeacher=null;
		return listTeacher;
	}
	Vector<File> viewListTeacherFile(Teacher teacher) {
		Vector<File> files = null;
		return files;
	}
	void rateTeacher(Teacher teacher, Rate rate) {
		
	}
	Attendance viewAttendance() {
		Attendance attendance=null;
		return attendance;
	}
	Attendance viewAttendance(Course course) {
		Attendance attendance=null;
		return attendance;
	}
	Schedule viewSchedule() {
		Schedule schedule=null;
		return schedule;
	}
	
	
}
