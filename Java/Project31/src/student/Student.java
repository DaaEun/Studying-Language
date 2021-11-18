package student;

import java.util.Scanner;

public class Student {
	
	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;
	
	Scanner sc = new Scanner(System.in);
	
	public Student() {
		this.inputStuInfo();
		this.calcTotAvgGrade();
	}
	
	//학생 정보를 받아서 객체화 시킬 메서드.
	public void inputStuInfo() {
		System.out.println("# 성적 정보 입력을 시작합니다.");
		System.out.println("- 학번: ");
		this.stuId = sc.next();
		System.out.println("- 이름: ");
		this.name = sc.next();
		
		while(true) {
			try {
				System.out.println("- 국어: ");
				this.kor = sc.nextInt();
				System.out.println("- 영어: ");
				this.eng = sc.nextInt();
				System.out.println("- 수학: ");
				this.math = sc.nextInt();
				break;
			}
			catch(Exception e) {
				System.out.println("점수는 숫자로만 입력하세요.");
				sc.nextLine();
			}
		}
	}
	
	//총점, 평균, 학점을 계산하는 메서드.
	public void calcTotAvgGrade() {
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total / 3.0;
		if(avg >= 90) this.grade = "A";
		else if(avg >= 80) this.grade = "B";
		else if(avg >= 70) this.grade = "C";
		else if(avg >= 60) this.grade = "D";
		else this.grade = "F";
	}
	
	//학생의 성적 정보를 출력하는 메서드.
	public void outputStuInfo() {
		System.out.printf("%4s %6s %10d점 %10d점 %10d점 %10d점 %10.2f점 %10s\n"
				, this.stuId, this.name, this.kor, this.eng, this.math
				, this.total, this.avg, this.grade);
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
