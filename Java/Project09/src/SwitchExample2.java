import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 여행지 추천 프로그램 ***");
		System.out.println("- 여행가고 싶은 계절이나 월을 입력하세요.");
		System.out.print("> ");
		String season = sc.next();
		
		switch(season) { 
		
		case "3":	case "4":	case "5":	case "봄":
			System.out.println("추천 여행지는 벚꽃축제입니다.");
			break;
		case "6":	case "7":	case "8":	case "여름":
			System.out.println("추천 여행지는 해수욕장입니다.");
			break;
		case "9":	case "10":	case "11":	case "가을":
			System.out.println("추천 여행지는 단풍놀이입니다.");
			break;
		case "12":	case "1":	case "2":	case "겨울":
			System.out.println("추천 여행지는 스키장입니다.");
			break;
		default:
			System.out.println("계절이나 월을 잘못 입력하셨습니다.");
		}
		sc.close();
		
	}

}
