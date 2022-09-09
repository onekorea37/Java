import java.util.Scanner;

public class Main {
		public static void main(String arg[]) {
			
				Scanner sc = new Scanner(System.in);
				double A = sc.nextDouble();
				double B = sc.nextDouble();
				
				System.out.println(A/B);
				sc.close();
		} 
	}

// 소수(분수)를 나타내려면 float or double로 변수를 지정해줘야 한다. 
// float는 오차가 있다. 오차를 없애려면 double을 사용한다. 
