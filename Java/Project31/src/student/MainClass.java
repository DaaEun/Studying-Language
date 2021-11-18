package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	
		List<Student> sList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		Point p = new Point();
		
		while(true) {
			p.menuInfo();
			System.out.println("메뉴를 입력하세요.");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1:
				p.inputPoints(sList);
				break;
			case 2:
				if(sList.isEmpty()) {
					System.out.println("학생 정보부터 먼저 등록하세요.");
				}
				else {
					p.showAllPoints(sList);
				}
				break;
			case 3:
				p.searchPoint(sList);
				break;
			case 4:
				p.modifyPoints(sList);
				break;
			case 5:
				p.deletePoints(sList);
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}
	}

}
