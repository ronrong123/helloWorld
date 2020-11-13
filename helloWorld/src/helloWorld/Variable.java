package helloWorld;

public class Variable {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 20;
		
		int sum = 40;
		// "="는 오른쪽 값을 왼쪽 변수에 대입하겠다.(같다는 뜻이 아님 같다는 뜻은 "==")
//		System.out.println("sum:" + sum);	
//		sum = num1 / num2;	 //답은 0.5지만 담을수있는 변수타입이 정수만 담을 수 있기 때문에(int) 0으로 출력됨.
//		System.out.println("sum:" + sum);
		//sum = num1 % num2;	
		System.out.println("sum:" + sum);	
		
		boolean trueofFalse = sum <= 10; //boolean : 참, 거짓에 대한 변수타입
		System.out.println(trueofFalse);
		
		if(trueofFalse) {                      //if다음은 ()
			System.out.println("결과 참입니다.");
		}else {
			System.out.println("결과 거짓입니다.");
		}
		
		int num3 = 5;
		int num4 = 10;
		
		int sum1 = num3 + num4;
		int diff = num4 - num3;
		boolean trueofFalse2 = sum1 > diff;
		
		if (trueofFalse2) {
			System.out.println("결과 참입니다.");
		}else {
			System.out.println("결과 거짓입니다.");
		}
		
		
	}
}
