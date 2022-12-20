package ex5.capsule;

public class CapsuleTest {

	public static void main(String[] args) {
        //성적 객체를 준비한다.
       // Exam 뉴렉성적 = new Exam();
		Exam 뉴렉성적 = new Exam(1,2,3);
		Exam 뉴렉성적2 = new Exam();
		
//		성적 뉴렉성적 = new 성적();
		
		//성적을 입력 받는다.
//		뉴렉성적.입력();
//		inputExam(exam1);
//		뉴렉성적.input();
		
		
//	    뉴렉성적.input();
		
		
		
		//성적을 출력한다.
//		뉴렉성적.출력();
//		printExam(뉴렉성적);
		뉴렉성적.print();
		뉴렉성적.print('※');
		뉴렉성적.print('※',20/*length*/);
		뉴렉성적2.print();
	}

}
