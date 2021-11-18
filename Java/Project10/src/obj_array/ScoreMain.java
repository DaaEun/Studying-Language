package obj_array;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		/*
		 - 학생점수를 토대로 객처를 생성해서 보관할 배열을 선언하시오.
		 배열의 크기는 100으로 한다.
		 
		 - 스캐너를 사용하여 이름, 국어, 영어, 수학점수를 입력받으시오.
		 
		 - 총점과 평균까지 계산한 후, 한 학생의 객체를 생성하고 배열을 넣어주시오.
		 
		 - 이름을 입력받는 란에 '그만'이라고 입력하면 입력을 종료하고 반복문을 탈출하시오.
		 
		 - 입력반복문이 종료되면 학생의 이름과 모든 성적 정보가 반복문을 통해 출력될 수 있도록
		 Scores 클래스에 점수 정보에 대한 메서드를 선언한 후 반복 호출하여 모든 학생의 
		 성적정보를 출력하시오.(scoreInfo())
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		Scores[] stu = new Scores[100];
		
		System.out.println("*** 학생 성적 정보 입력 프로그램 ***");
		System.out.println("# 그만 입력하시려면 이름 입력창에 '그만'이라고 입력해주세요.");
		
		for(int i=0; i<stu.length; i++) {
			System.out.println("-----------------------------");
			System.out.print("이름> ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			System.out.print("국어> ");
			int kor = sc.nextInt();
			
			System.out.print("영어> ");
			int eng = sc.nextInt();
			
			System.out.print("수학> ");
			int math = sc.nextInt();
		
			//		int total = kor + eng + math;
			//		double avg = total / 3.0;
			//		
			//		Scores score = new Scores(name, kor, eng, math, total, avg);
		
			Scores score = new Scores(name, kor, eng, math);
			score.setTotal();
			score.setAvg();
		
			stu[i] = score;
		
			System.out.println("*** 성적 정보 입력 성공!!! ***\n");
		
		}
		
		System.out.println("\n========학생 성적 정보========");
		
		for(Scores s : stu) {
			if(s == null) break;
			s.scoreInfo();
		}
		
		System.out.println("\n==========================");
		
		sc.close();
	}

}











