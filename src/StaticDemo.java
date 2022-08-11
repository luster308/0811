/**
 * <font color='red' size='5'>Static 용법 4가지</font>
 * <ol>
 * 		<li><b>static variable</b>: 참조 없이 클래스의 이름으로 접근하기 위한 공유 변수</li>
 * 		<li><b>static method</b>: 참조 없이 클래스의 이름으로 메소드를 접근하기 위해서</li>
 * 		<li><b>static initialization block</b>: 스태틱 변수와 상수의 초기화</li>
 * 		<li><b>static class</b></li>
 * </ol>
 * @author Luster308
 * @version 1.0
 * @since 2022-08-11
 *
 */
public class StaticDemo {
	private String name;						// member variable
	private final double PI;					// member constant
	private static int age;						// static variable
	private static final boolean FLAG;	// static constant
	
	{		//초기화 블록(initialization block
		this.name = "한지민";			// 멤버변수 초기화
		System.out.println("나는 생성자보다 먼저 호출되는데, 다시는 재호출할 수 없다.");
	}
	
	public StaticDemo() {
		this.PI = 3.141592;			// 멤버상수 초기화
		System.out.println("나는 생성자다");
	}
	
	static {		// 스태틱 초기화 블록(static initialization block)
		age = 26;						// 스태틱변수 초기화
		FLAG = true;					// 스태틱상수 초기화
		System.out.println("나는 스태틱 초기화 블록이다. 항상 제일 먼저 메모리에 올라온다.");
	}
	
	/**
	 * Program의 시작점
	 * @param args : String Array
	 * @return Nothing
	 * @see https://www.naver.com
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("나이 = "+age);
		System.out.println("FLAG = "+FLAG);
		StaticDemo sd = new StaticDemo();
		System.out.println("이름 = "+sd.name);
		System.out.println("PI = "+sd.PI);
	}
}
