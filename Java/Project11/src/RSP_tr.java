import java.util.Scanner;

public class RSP_tr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int coinCount = 0;
		int wCount = 0;
		int dCount = 0;
		int lCount = 0;
		
		System.out.println("*** 가위 바위 보 게임 ***");
		System.out.println("# 코인을 투입해 주세요 (넣으실 코인의 숫자를 입력해 주세요)");
		System.out.print("> ");
		coinCount = sc.nextInt();
		
		System.out.println("\n# 해당하는 메뉴의 숫자를 입력해 주세요.");
		
		outer: while(true) {
			
			System.out.println("# 현재 코인 수: " + coinCount);
			System.out.println("-------------------------");
			System.out.println("# 1. 가위바위보 게임 시작");
			System.out.println("# 2. 전적 보기");
			System.out.println("# 3. 코인 투입하기");
			System.out.println("# 4. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1:
				
				if(coinCount == 0) {
					System.out.println("# 코인이 없습니다.");
					System.out.println("# 메뉴에서 코인을 투입해 주세요.");
					break; //switch break -> while(true)로 간다.
				}
				
				while(true) {
					
					int comNum = (int) (Math.random()*3);
					int convertNum;
					
					if(coinCount == 0) {
						System.out.println("\n-------------------------");
						System.out.println("# 코인이 다 떨어졌습니다.");
						System.out.println("# 게임을 계속 하시려면 코인을 더 넣어주세요.");
						System.out.println("# 게임을 그만 두고 메인 메뉴로 돌아가시려면 '그만'이라고 입력해 주세요.");
						System.out.print("> ");
						String select = sc.next();
						
						if(select.equals("그만")) {
							System.out.println("# 메뉴로 돌아갑니다.");
							break;
						} else {
							int addCoin = Integer.parseInt(select);
							System.out.println("# 코인을 " + addCoin + "개 추가합니다.");
							coinCount = addCoin;
						}
						
					}
					
					
					System.out.println("\n-------------------------");
					System.out.println("# 가위, 바위, 보 중에 하나를 입력하세요.");
					System.out.println("# 게임을 끝내고 싶으시다면 '그만' 이라고 입력하세요.");
					System.out.print("> ");
					String myRSP = sc.next();
					
					if(myRSP.equals("가위")) {
						convertNum = 0;
					} else if(myRSP.equals("바위")) {
						convertNum = 1;
					} else if(myRSP.equals("보")) {
						convertNum = 2;
					} else if(myRSP.equals("그만")) {
						System.out.println("가위바위보 게임 종료!");
						System.out.println("-------------------------");
						break;
					} else {
						System.out.println("정확한 값을 입력해 주세요!");
						continue;
					}
					
					switch(comNum) {
					
					case 0:
						System.out.println("# 컴퓨터가 낸 것은 가위!");
						System.out.println("-------------------------");
						if(convertNum == 0) {
							System.out.println("비겼습니다.");
							dCount++;
						} else if(convertNum == 1) {
							System.out.println("이겼습니다.");
							wCount++;
						} else if(convertNum == 2) {
							System.out.println("졌습니다.");
							lCount++;
						}
						break;
						
					case 1:
						System.out.println("# 컴퓨터가 낸 것은 바위!");
						System.out.println("-------------------------");
						if(convertNum == 0) {
							System.out.println("졌습니다.");
							lCount++;
						} else if(convertNum == 1) {
							System.out.println("비겼습니다.");
							dCount++;
						} else if(convertNum == 2) {
							System.out.println("이겼습니다.");
							wCount++;
						}
						break;
						
					case 2:
						System.out.println("# 컴퓨터가 낸 것은 보!");
						System.out.println("-------------------------");
						if(convertNum == 0) {
							System.out.println("이겼습니다.");
							wCount++;
						} else if(convertNum == 1) {
							System.out.println("졌습니다.");
							lCount++;
						} else if(convertNum == 2) {
							System.out.println("비겼습니다.");
							dCount++;
						}
						break;
					} // switch(comNum)
					
					coinCount--;
					System.out.println("# 남은 코인: " + coinCount + "개");
					
					
					
				} // case 1의 while(true)
				
				
				
				
				break;
				
			case 2:
				System.out.println("\n-------------------------");
				System.out.println("*** 게임 결과 ***");
				System.out.printf("이긴 횟수: %d회\n비긴 횟수: %d회\n진 횟수: %d회\n"
						, wCount, dCount, lCount);
				System.out.println("-------------------------");
				break;
				
			case 3:
				System.out.println("\n-------------------------");
				System.out.println("코인을 넣어주세요.");
				System.out.print("> ");
				int menuAddCoin = sc.nextInt();
				System.out.println(menuAddCoin + "개의 코인을 넣었습니다.");
				coinCount += menuAddCoin;
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다. [Y / N]");
				System.out.print("> ");
				String quit = sc.next();
				if(quit.equals("y") || quit.equals("Y")) {
					break outer;
				} else {
					System.out.println("종료를 취소합니다.");
					break;
				}
				
			default:
				System.out.println("# 정확한 메뉴를 입력해 주세요.");
			
			} //end switch
			
			
			
			
			
			
			
			
			
			
		} // outer while true



	} // end main

} // end class















