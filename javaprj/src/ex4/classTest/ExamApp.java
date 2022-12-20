package ex4.classTest;

import java.nio.file.spi.FileSystemProvider;

public class ExamApp {
//                                    매개변수 없이도 객체 생성가능한 클래스가 있다  기능을 사용하고싶으면 객체이름.을사용        	   
//객체생성문법 -> 클래스명 객체이름 (아무거나 다가능)= new 클래스명 ();                             //속성이나 함수에 접근할때 .을 사용한다  //new heap 선언하는건 스택  값이없다,생성되지않았다 = null
	// 선언+ new = 객체생성
	public static void main(String[] args) {
		Exam exam1 = new Exam();// [kor][eng][math]
		exam1.kor = 10;
		exam1.eng = 20;
		exam1.math = 30;
		exam1.name = "honggildong";
		printExam(exam1);

		Exam[] exams = new Exam[3];
		exams[0] = new Exam();
		exams[0].kor = 10;
		exams[0].eng = 10;
		exams[0].math = 10;

		exams[1] = new Exam();
		exams[1].kor = 20;
		exams[1].eng = 20;
		exams[1].math = 20;

		exams[2] = new Exam();
		exams[2].kor = 30;
		exams[2].eng = 30;
		exams[2].math = 30;
		printExams(exams);
	}

	static void printExams(Exam[] exams) {
		for (int i = 0; i < 3; i++) {
			Exam exam = exams[i];
//			System.out.printf("kor:%d\n", exams[i].kor);
//			System.out.printf("eng:%d\n", exams[i].eng);
//			System.out.printf("math:%d\n", exams[i].math);
			printExam(exam);
			//코드의 중복을 막아준다
		}

	}

	static void printExam(Exam exam1) {
		int kor = exam1.kor;
		int eng = exam1.eng;
		int math = exam1.math;
		String name = exam1.name;
		System.out.printf("name:%s\n",name);
		System.out.printf("kor:%d\n",kor);
		System.out.printf("eng:%d\n",eng);
		System.out.printf("math:%d\n",math);
		System.out.println("---------------------");

	}

}
