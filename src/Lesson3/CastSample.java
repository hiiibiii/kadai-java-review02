package Lesson3;

public class CastSample {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;



		System.out.println(a / b);

		//int型変数aを一時的にdouble型に変換して除算
		System.out.println((double) a / b);

		//(ダメな例)int型同士の除算をした結果をdouble型に変換
		System.out.println((double)(a / b));

	}

}
