import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		String [] array = {"박지민", "홍지민", "박지민", "한지민", "한지민", "이지민"};
		for(String str:array) {
			hashSet.add(str);
			treeSet.add(str);
		}		
		System.out.println(hashSet.size());
		System.out.println(hashSet);				//[한지민, 홍지민, 이지민, 박지민] -> hashset은 중복x
		System.out.println(treeSet);					//[박지민, 이지민, 한지민, 홍지민] -> 중복x + 소팅해서 출력
	}
}
