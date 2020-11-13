package helloWorld;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "30"; //"Hong kildong";
		name = "홍길동";
		System.out.println("My name is" + name);
		int age = 20;
		System.out.println("My age is" + " "+ age);
		double height = 170.8;
		//int는 정수기때문에 소수점을 담을 수 없음 double은 소수점까지 담기 가능
		System.out.println(name + " 키는 " +  height +  "입니다.");
		name = "김유진";
		height = 163;
		System.out.println(name + "의 키는 " +  height +  "입니다.");
		
		String name1 = "송예솔";
		int age1 = 29;
		double height1 = 172.3;
		System.out.println(name1 + "의 키는 " + height1 + "이고 나이는 " + age1 + "입니다.");
		age1 = 29 + 29;
		System.out.println("두 사람 나이의 합은 " + age1 + "입니다.");
	}
}
//변수는 중복이 안되기때문에 다르게 설정(두번선언하면 에러)
//class외에는 소문자로 시작 