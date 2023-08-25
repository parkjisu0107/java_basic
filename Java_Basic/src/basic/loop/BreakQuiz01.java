package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
		 * 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 지속적으로 문제를 출제한 후 정답을 입력받으세요. 사용자가 0을 입력하면 반복문을
		 * 탈출시키세요.
		 * 
		 * 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */

		/*
		 *** 덧셈 퀴즈 *** # 종료하시려면 0을 입력해 주세요
		 * 
		 * 9 + 42 = ??? > 정답입니다! or 틀렸습니다~
		 * 
		 * 종료합니다. 0-1 ------------------------------ 정답 횟수: 회 오답 횟수: 회
		 */

		Scanner sc = new Scanner(System.in);
		int correct = 0;
		int wrong = 0;
		
		System.out.println("*** 연산 퀴즈 ***\n종료하시려면 0을 입력해 주세요");
	
		while (true) {

			int x = (int) (Math.random() * 100 + 1);
			int y = (int) (Math.random() * 100 + 1);
			int num = (int) (Math.random() * 2);

			System.out.printf("%d %s %d = ???\n>", x,(num == 0?"+":"-") , y);

			int answer = sc.nextInt();

			if (answer == x + y || answer == x - y) {
				System.out.println("정답입니다!");
				correct += 1;
			} else if (answer == 0) {
				System.out.println("종료합니다.");
				System.out.println("---------------------");
				System.out.println("정답 횟수: " + correct + "회");
				System.out.println("오답 횟수: " + wrong + "회");
				break;
			} else {
				System.out.println("틀렸습니다~");
				wrong += 1;
			}

		}

	}

}
