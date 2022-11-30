
public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	
	int verbalNote;
	Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.verbalNote=0;

	}

	public void addTeacher(Teacher teacher) {
		if (this.prefix.equals(teacher.branch)) {
			this.teacher = teacher;
		} else {
			System.out.println("Öðretmen ile ders uyuþmuyor");
		}
	}

	public void printTeacher() {
		if(this.teacher!=null) {
			System.out.println(this.name+" dersinin akademisyeni:"+teacher.name);
		}else {
			System.out.println(this.name+" dersine akademisyen atanmamýþtýr");
		}
	}
}
