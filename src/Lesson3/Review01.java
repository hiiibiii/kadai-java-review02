package Lesson3;

public class Review01 {
//mainメソッドとtaxメソッドを切り分けて作成してください
	public static void main(String[] args) {
		int price = 1500;

		//mainメソッドでtaxメソッドを呼び出して、戻り値の消費税額をmainメソッド内で受けてください
		int tax = tax(price); //taxResultに置き換わる→代入される

		//税込価格 = 商品価格 + 消費税額 となるように計算してください
		int sum = price + tax;

		//実行例：1500円の商品の税込価格は1650円（消費税は150円）です。
		System.out.println(price + "円の商品の税込価格は" + sum +"円（消費税は" + tax + "円)です。");
	}

//	taxメソッドは消費税額（商品価格の10％）が戻り値となるメソッドにしてください
	public static int tax(int price) {

		//消費税の計算を行なうにあたり、10で割るのではなく、税率が変更された場合、税率の数字を変更するだけでプログラムを書き直す必要がないように書いてみてください
		double rate = 0.1;
		double result = (double)price * rate;

		//	消費税額が小数値になる場合は、小数点以下を切り捨てるなどして、整数値となるようにしてください
		int taxResult = (int)result;
		return taxResult;
	}
}
