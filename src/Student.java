
public class Student {
	Course mat;
	Course fizik;
	Course kimya;
	String name;
	String stuNo;
	int classes;
	double avg;
	boolean isPass;

	Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		avg = 0.0;
		isPass = false;

	}

	public void addBulkExamNote(int mat, int matQuiz, int fizik, int fizikQuiz, int kimya, int kimyaQuiz) {
		if (mat >= 0 && mat <= 100) {
			this.mat.note = mat;
			this.mat.verbalNote = matQuiz;
		}
		if (fizik >= 0 && fizik <= 100) {
			this.fizik.note = fizik;
			this.fizik.verbalNote = fizikQuiz;
		}
		if (kimya >= 0 && kimya <= 100) {
			this.kimya.note = kimya;
			this.kimya.verbalNote = kimyaQuiz;
		}
	}

	public void isPass() {
		if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
			System.out.println("Notlar tam olarak girilmemiþ");
		} else {
			if (this.avg >= 55) {
				System.out.println("Sýnýfý geçti" + avg);
				isPass = true;
			} else {
				System.out.println("Sýnýfý geçemedi" + avg);
				isPass = false;
			}
		}
	}

	public void calcAvarage() {
		this.avg = (((this.fizik.verbalNote * 0.20) + (this.fizik.note * 0.80))
				+ ((this.kimya.verbalNote * 0.35) + (this.kimya.note * 0.65)) + (this.mat.note) + (this.mat.verbalNote))
				/ 3.0;

		System.out.println("Ortalama:" + avg);
	}

	public void printNote() {
		System.out.println("#######################");
		System.out.println("Öðrenci:" + this.name);
		System.out.println(mat.name + ":" + this.mat.note);
		System.out.println(fizik.name + ":" + this.fizik.note);
		System.out.println(kimya.name + ":" + this.kimya.note);
		System.out.println("Matematik sözlüsü:" + this.mat.verbalNote);
		System.out.println("Fizik sözlüsü:" + this.fizik.verbalNote);
		System.out.println("Kimya sözlüsü :" + this.kimya.verbalNote);
	}
}
