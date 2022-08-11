import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int first = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int second = sc.nextInt();
		try {
		System.out.printf("%d / %d = %d\n", first, second, (first/second));
	}catch(NullPointerException ex) {
		System.out.println("NullPointerException");
	}catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("ArrayIndexOutOfBoundsException");
	}catch(NegativeArraySizeException ex) {
		System.out.println("NegativeArraySizeException");
	}catch(ArithmeticException ex) {
		System.out.println("ArithmeticException");
	}catch(RuntimeException ex) {
		System.out.println("RuntimeException");
	}
		/*
		 * Multiple Catch Block : 여러 개의 Exception Type을 열거하는 방법
		 * 		-주의할 점: 위아래 순서가 있다. 위 쪽은 자식 Exception, 아래 쪽은 부모 Exception
		 */
	}
}
