
public class Main {

	public static void main(String[] args) {

		Teacher t1 = new Teacher("Buse Karakaþ", "0000", "MAT");
		Teacher t2 = new Teacher("Semih Apdik", "0001", "KÝM");
		Teacher t3 = new Teacher("Hazal Özkan", "0002", "FÝZ");

		Course mat = new Course("Matematik", "101", "MAT");
		Course fizik = new Course("Fizik", "101", "FÝZ");
		Course kimya = new Course("Kimya", "101", "KÝM");

		mat.addTeacher(t1);
		fizik.addTeacher(t3);
		kimya.addTeacher(t2);

		Student s1 = new Student("Fatoþ", "111", 4, mat, fizik, kimya);
		Student s2 = new Student("Yýldýray", "112", 4, mat, fizik, kimya);
		Student s3 = new Student("Seda", "113", 4, mat, fizik, kimya);

		s1.addBulkExamNote(50, 30, 50,20,30,40);
		s1.printNote();
		s1.calcAvarage();
		s1.isPass();
		s2.addBulkExamNote(70, 90, 60,100,100,100);
		s2.printNote();
		s2.calcAvarage();
		s2.isPass();

		s3.addBulkExamNote(150, 0, 0,40,50,60);
		s3.printNote();
		s3.calcAvarage();
		s3.isPass();

	}

}
