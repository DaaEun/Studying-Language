package api.util.random;

import java.util.Arrays;
import java.util.Random;

//7, 19, 23, 24, 36, 39  보너스 30
//7, 19, 23, 24, 36, 39 -> 1등
//7, 19, 23, 30, 36, 39 -> 2등
//7, 19, 23, 25, 36, 39 -> 3등
public class LottoSimulator {

	static Random r = new Random();
	
	static int prize1 = 0;	//1등 당첨횟수를 저장할 변수.
	static int prize2 = 0;	//2등 당첨횟수를 저장할 변수.
	static int prize3 = 0;	//3등 당첨횟수를 저장할 변수.
	static int prize4 = 0;	//4등 당첨횟수를 저장할 변수.
	static int prize5 = 0;	//5등 당첨횟수를 저장할 변수.
	static int failCnt = 0;	//꽝 당첨횟수를 저장할 변수.

	//로또 번호를 생성하는 메서드.
	public static int[] createLotto() {
		int[] lotto = new int[6];
		int i = 0;
		while(i<6) {
			boolean flag = false;
			int rn = r.nextInt(45) + 1;
			for(int j=0; j<=i; j++) {
				if(rn == lotto[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				lotto[i] = rn;
				i++;
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}
	
	//보너스 번호를 생성하는 메서드
	public static int createBonusNum(int[] win) {
		int bonus;
		
		while(true) {
			int rn = r.nextInt(45) + 1;
			boolean flag = false;
			for(int num : win) {
				if(rn == num) {
					flag = true;
					break;	//inner for break;
				}
			}
			if(!flag) {
				bonus = rn;
				break;	//while true break;
			}
		}
		return bonus;
	}
	
	//번호 일치 여부를 알려주는 메서드(등수 포함)
	public static void checkLottoNumber(int[] myLotto, int[] win, int bonus) {
		int count = 0;
		
		for(int i : myLotto) {
			for(int j : win) {
				if(i == j) {
					count++;
					break;
				}
			}
		}
		
		if(count == 6) prize1++;
		else if(count == 5) {
			boolean flag = false;
			for(int n : myLotto) {
				if(n == bonus) {
					prize2++;
					flag = true;
					break;
				}	
			}
			if(!flag) prize3++;
		}
		else if(count == 4) prize4++;
		else if(count == 3) prize5++;
		else failCnt++;
	}
	
	public static void main(String[] args) {
		
		//당첨 번호 배열을 생성.
		int[] win = createLotto();
//		System.out.println(Arrays.toString(win));
		//보너스번호 생성.
		int bonus = createBonusNum(win);
		int paper = 0;	//로또 구매 횟수
		long money = 0;
		
		while(true) {
			
			//내 로또번호 생성.
			int[] myLotto = createLotto();
			paper++;
			checkLottoNumber(myLotto, win, bonus);
			
			if(prize1 == 1) {
				
				System.out.println("\n1등에 당첨되었습니다!!!");
				System.out.println("*** 1등에 1번 당첨될 때까지의 누적 당첨 현황 ***");
				
				System.out.printf("# 1등 당첨 횟수: %d\n", prize1);
				System.out.printf("# 2등 당첨 횟수: %d\n", prize2);
				System.out.printf("# 3등 당첨 횟수: %d\n", prize3);
				System.out.printf("# 4등 당첨 횟수: %d\n", prize4);
				System.out.printf("# 5등 당첨 횟수: %d\n", prize5);
				System.out.printf("# 꽝 당첨 횟수: %d\n", failCnt);
				
				money = paper*1000;
				System.out.println("로또 1등 한번 되려고 당신이 쓴 액수: " + money + "원");
				
				break;
			}
			else {
				System.out.printf("로또 %d장 째 구매중...\n", paper);
			}
		}
	}
}











