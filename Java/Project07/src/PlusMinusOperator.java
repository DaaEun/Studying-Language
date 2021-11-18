
public class PlusMinusOperator {

	public static void main(String[] args) {
		
		int i = 1;
		int j = i++; //후위 연산
		int k = i--;
		i++;
		++i;
		
		System.out.println("i의 값: " + i);	//3
		System.out.println("j의 값: " + j);	//1
		System.out.println("k의 값: " + k);	//2
		
		System.out.println("--------------------------------");
		
		int x = 1;
		int y = ++x; //전위 연산.
		int z = --x;
		
		System.out.println("x의 값: " + x);	//1
		System.out.println("y의 값: " + y);	//2
		System.out.println("z의 값: " + z);	//1
		
	}

}
