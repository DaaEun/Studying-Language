import java.util.Scanner;
// ctrl + i: 코드 정렬

public class RSP {

	public static void main(String[] args) {
		
		/*
		// 문자열로 이루어진 정수를 실제 정수로 변환하는 메서드.
		// int 변수 = Integer.parsenInt(문자열  or 문자열이 들어있는 변수)

		String s1 = "10";
		String s2 = "34";
		System.out.println(s1 + s2);

		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		System.out.println(i1 + i2);
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 가위 바위 보 게임 ***");
		System.out.println("코인을 투입해 주세요<넣으실 코인의 숫자를 입력해 주세요>");
		System.out.print("> ");
		// 투입한 코인 수
		int coin = sc.nextInt();	

		// 이긴 횟수 
		int winCount = 0;
		// 비긴 횟수
		int halveCount = 0;
		// 진 횟수
		int loseCount = 0;

		System.out.println("해당하는 메뉴의 숫자를 입력해 주세요.");

		while(true) {
			System.out.println("현재 코인 수: " + coin);
			System.out.println("-------------------------");
			System.out.println("1. 가위바위보 게임 시작");
			System.out.println("2. 전적보기");
			System.out.println("3. 코인 투입하기");
			System.out.println("4. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.print("> ");
			// 메뉴의 숫자
			int menuNum = sc.nextInt();

			switch(menuNum) {
			// 1. 가위바위보 게임 시작
			case 1:{
				//코인추가후 다시 프로그램으로 들어가는 방법 구현하기
				if(coin == 0) {
					System.out.println("코인이 없습니다.");
					System.out.println("메뉴에서 코인을 투입해주세요.");
					break; //switch break -> while(true)로 감.
				}
				while(coin != 0) {
					System.out.println("-------------------------");
					System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
					System.out.println("게임을 끝내고 싶으시다면 '그만'이라고 입력하세요.");
					System.out.print("> ");
					//'나'가 낸 가위바위보 결과
					String result = sc.next();
					if(result.equals("그만")) {
						System.out.println("가위바위보 게임 종료!");
						System.out.println("-------------------------");
						break;
					}
					else if(result.equals("가위") || result.equals("바위") || result.equals("보")) {

						// 0 ~ 2 숫자 표현. 0 = 가위, 1 = 바위 , 2 = 보
						int comNum = (int) (Math.random()*3);

						// 컴퓨터가 낸 가위바위보 결과
						String comResult;
						if(comNum == 0)
							comResult = "가위";
						else if(comNum == 1)
							comResult = "바위";
						else 
							comResult = "보";
						System.out.println("컴퓨터가 낸 것은 " + comResult + "!");
						System.out.println("-------------------------");

						// '나'와 컴퓨터 가위바위보 결과
						switch(result){

						case "가위":
							if(comResult.equals("가위")) {
								System.out.println("비겼습니다.");
								halveCount++;
							}
							else if(comResult.equals("바위")) {
								System.out.println("졌습니다.");
								loseCount++;
							}
							else {
								System.out.println("이겼습니다.");
								winCount++;
							}
							break;

						case "바위":
							if(comResult.equals("가위")) {
								System.out.println("이겼습니다.");
								winCount++;
							}
							else if(comResult.equals("바위")) {
								System.out.println("비겼습니다.");
								halveCount++;
							}
							else {
								System.out.println("졌습니다.");
								loseCount++;
							}
							break;

						case "보":
							if(comResult.equals("가위")) {
								System.out.println("졌습니다.");
								loseCount++;
							}
							else if(comResult.equals("바위")) {
								System.out.println("이겼습니다.");
								winCount++;
							}
							else {
								System.out.println("비겼습니다.");
								halveCount++;
							}
							break;
						}
					}
					else {
						System.out.println("정확한 값을 입력해 주세요.");
						continue;
					}
					coin--;
					System.out.println("남은 코인: " + coin);
					if(coin == 0) {
						System.out.println("-------------------------");
						System.out.println("코인이 다 떨어졌습니다.");
						System.out.println("게임을 계속 하시려면 코인을 더 넣어주세요.");
						System.out.println("게임을 그만두고 메뉴로 돌아가시려면 '그만'이라고 입력해주세요.");
						System.out.print("> ");
						// 추가코인 또는 "그만"을 표현하는 변수
						String add = sc.next();
						if(add.equals("그만")) {
							System.out.println("메뉴로 돌아갑니다.");
							break;
						}
						else{
							int addCoin = Integer.parseInt(add);
							System.out.println("코인을"+ addCoin + "개 추가합니다.");
							coin += addCoin;
						}
					}
				}// while(coin != 0) 끝
				break;
			}

			// 2. 전적보기
			case 2:{
				System.out.println("-------------------------");
				System.out.println("*** 게임 결과 ***");
				System.out.println("이긴 횟수: " + winCount + "회");
				System.out.println("비긴 횟수: " + halveCount + "회");
				System.out.println("진 횟수: " + loseCount + "회");
				System.out.println("-------------------------");
				break;
			}
			// 3. 코인 투입하기
			case 3:{
				System.out.println("-------------------------");
				System.out.println("코인을 넣어주세요.");
				System.out.print("> ");
				int addCoin2 = sc.nextInt();
				System.out.println(addCoin2 + "개의 코인을 넣었습니다.");
				coin += addCoin2; 
				break;
			}
			// 4. 프로그램 종료
			case 4:{
				System.out.println("프로그램을 종료합니다. [Y / N]");
				// 종료선택을 표현하는 변수
				String quit = sc.next();
				if(quit.equals("Y") || quit.equals("y"))
					return;
				else {
					System.out.println("종료를 취소합니다.");
					break;
				}
			}
			default:{
				System.out.println("정확한 메뉴를 입력해주세요.");
			}
			}// menu switch문 끝
		}// while true문 끝
	}
}
