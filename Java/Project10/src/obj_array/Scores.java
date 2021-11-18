package obj_array;

public class Scores {

	/*
	 - 이름, 국어, 수학, 영어, 총점, 평균을 속성(멤버변수)으로 가지는 클래스를 은닉 기술을 사용하여 구현하시오.
	 
	 -생성자는 본인이 편한대로 선언하셔서 사용하세요.
	 기본생성자는 하나 만들어 두는 것을 추천한다.
	 */
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public Scores() {}

	
	public Scores(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	public Scores(String name, int kor, int eng, int math, int total, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
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


	public void setTotal() {
		this.total = this.kor + this.eng + this.math;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg() {
		this.avg = total/3.0;
	}
	
	public void scoreInfo() {
		System.out.println("#학생 이름: " + this.name);
		System.out.println("---------------------------------");
		System.out.printf("국어: %d점 영어: %d점 수학: %d점\n총점: %d점 평균: %.2f점\n",
				this.kor, this.eng, this.math, this.total, this.avg);
		System.out.println("---------------------------------");
	}
	
}












