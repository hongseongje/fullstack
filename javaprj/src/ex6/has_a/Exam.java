package ex6.has_a;

import java.util.Scanner;

public class Exam {
//	private은 외부에서접근을 못하게 막는 역할
	private int kor;
	private int eng;
	private int math;

	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 생성자는 이름이 없다
	public Exam() {
//		 한정사 ?의형식만 소환가능
		this(10, 0, 0);

	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.printf("┌───────────────┐\n");
		System.out.printf("│ 국 어 성 적 입 력 │\n");
		System.out.printf("└───────────────┘\n");

		do {

			kor = scan.nextInt(); // 원하는 숫자 값이 아닌 아스키코드의 해당하는 값이 나옴!
			// 0부터 100까지만 입력하셔야 합니다!

			if (0 > kor || kor > 100)
				System.out.println("0부터 100까지만 입력하셔야 합니다!");
		} while (0 > kor || kor > 100);

	}

	public void print() {
		print('-'); // 기본값을 가지는 메소드
	}

	public void print(char ch) {

		print(ch, 30);

	}

	// 정의하는 곳엔 형태와 인자만
	public void print(char ch, int length) {
		int total = total();
		double avg = avg();
		System.out.printf("kor:%d\n", kor);
		System.out.printf("eng:%d\n", eng);
		System.out.printf("math:%d\n", math);
		System.out.printf("math:%d\n", total);
		System.out.printf("math:%d\n", avg);

		for (int i = 0; i < length; i++)
			System.out.printf("%c", ch);
		System.out.println();
	}

	public int total() {

		return kor + eng + math;
	}

	public double avg() {
		return total() / 3.0;
	}

	public void setKor(int kor) {
		this.kor = kor;
		
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

}
