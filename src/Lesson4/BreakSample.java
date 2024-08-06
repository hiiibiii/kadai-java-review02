package Lesson4;

public class BreakSample {

	public static void main(String[] args) {
		//検索対象データ準備
		int[] targetArray = {37, 85, 64, 57, 98, 100, 47, 23, 71, 69 };
		//検索値指定
		int search = 100;
		//カウンタ変数の宣言
		int i;

		for(i = 0; i < targetArray.length; i++) {
			if(search == targetArray[i]) {
				//見つかったら繰り返しを抜ける
				break;
			}
		}
		if(i >= targetArray.length) {
			System.out.println("対象のデータが見つかりませんでした。");
		}else {
			System.out.println("添え字"+i+"に対象のデータが見つかりました！");
		}
	}

}
