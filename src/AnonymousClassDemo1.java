
public class AnonymousClassDemo1 {
	public static void main(String[] args) {
		AnonymousClassDemo1 acd = new AnonymousClassDemo1();
//		acd.exec(acd.new MyPlus());
//		acd.exec(acd.new MyMultiple());
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {return a+b;}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {return a-b;}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {return a*b;}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {return a/b;}
		});
	}

	void exec(MyInterface mi) {							// member method
		int result = mi.calculate(5, 9);
		System.out.println("Result = "+result);
	}
//	class MyPlus implements MyInterface{			// member class
//		@Override
//		public int calculate(int front, int back) {
//			return front + back;
//		}
//	}
//	class MyMultiple implements MyInterface{			
//		@Override
//		public int calculate(int front, int back) {
//			return front * back;
//		}
//	}
}


@FunctionalInterface
interface MyInterface{
	int calculate(int front, int back);
}