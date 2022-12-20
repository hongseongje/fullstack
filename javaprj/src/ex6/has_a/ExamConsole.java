package ex6.has_a;

import java.util.Scanner;

public class ExamConsole {
	Exam exam;

	public ExamConsole() {
		exam = new Exam();
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.printf("┌───────────────┐\n");
		System.out.printf("│ 국 어 성 적 입 력 │\n");
		System.out.printf("└───────────────┘\n");
		int kor = 0;
		do {

			kor = scan.nextInt(); // 원하는 숫자 값이 아닌 아스키코드의 해당하는 값이 나옴!
			// 0부터 100까지만 입력하셔야 합니다!

			if (0 > kor || kor > 100)
				System.out.println("0부터 100까지만 입력하셔야 합니다!");
		} while (0 > kor || kor > 100);
		exam.setKor(kor);

		System.out.printf("┌───────────────┐\n");
		System.out.printf("│ 영 어 성 적 입 력 │\n");
		System.out.printf("└───────────────┘\n");
		int eng = 0;
		do {

			eng = scan.nextInt(); // 원하는 숫자 값이 아닌 아스키코드의 해당하는 값이 나옴!
			// 0부터 100까지만 입력하셔야 합니다!

			if (0 > eng || eng > 100)
				System.out.println("0부터 100까지만 입력하셔야 합니다!");
		} while (0 > eng || eng > 100);
		exam.setEng(eng);

		System.out.printf("┌───────────────┐\n");
		System.out.printf("│ 수 학 성 적 입 력 │\n");
		System.out.printf("└───────────────┘\n");
		int math = 0;
		do {

			math = scan.nextInt(); // 원하는 숫자 값이 아닌 아스키코드의 해당하는 값이 나옴!
			// 0부터 100까지만 입력하셔야 합니다!

			if (0 > math || math > 100)
				System.out.println("0부터 100까지만 입력하셔야 합니다!");
		} while (0 > math || math > 100);
		exam.setMath(math);

	}

	public void print() {
		print('-'); // 기본값을 가지는 메소드
	}

	public void print(char ch) {

		print(ch, 30);

	}

	// 정의하는 곳엔 형태와 인자만
	public void print(char ch, int length) {
		int total = exam.total();
		double avg = exam.avg();
		System.out.printf("kor:%d\n", exam.getKor());
		System.out.printf("eng:%d\n", exam.getEng());
		System.out.printf("math:%d\n", exam.getMath());
		System.out.printf("total:%d\n", total);
		System.out.printf("avg:%.2f\n", avg);

		for (int i = 0; i < length; i++)
			System.out.printf("%c", ch);
		System.out.println();
	}

}
