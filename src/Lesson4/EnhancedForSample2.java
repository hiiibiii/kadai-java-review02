package Lesson4;

public class EnhancedForSample2 {

	public static void main(String[] args) {
		int[] scores = {47, 55, 88, 100, 74};
		int sum = 0;
		double average = 0.0;

		//拡張for文(データ型変数型宣言:配列名)
		for (int data : scores) {
			sum = sum + data;
		}

		average = (double)sum / scores.length;
		System.out.println("合計点は、"+ sum + "点、平均点は、"+ average+"点です。");
	}

}
