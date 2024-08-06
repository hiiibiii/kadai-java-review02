package Lesson4;

public class EnhancedForSample1 {

	public static void main(String[] args) {
		int[] scores = {47, 55, 88, 100, 74};
		int sum = 0;
		double average = 0.0;

		//length：配列の要素数を参照する
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		//平均点の算出
		average = (double)sum / scores.length;//double型に変換

		System.out.println("合計点は、" + sum + "点、平均点は、" + average + "です。");
	}

}