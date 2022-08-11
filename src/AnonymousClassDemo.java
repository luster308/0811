
public class AnonymousClassDemo {
	public static void main(String[] args) {
		Demo d = new Demo() {		// 익명 객체
			@Override
			public void display() {
				System.out.println("나는 재정의된 메소드");
			}
			public void print() {
				System.out.println("나는 새로운 메소드");
			}
		};   // 세미콜론 주의할 것(빼먹으면 안됨)
		d.display();
//		d.print();   // 재정의하려는 클래스에 멤버가 아니기 때문에 쓸 수 없다.(정의되어 있지 않아서)
	}
}

class Demo{
	public void display() {
		System.out.println("나는 원형 메소드");
	}
}