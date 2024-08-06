package Lesson4;

public class IfElseIfSample {

	public static void main(String[] args) {
		int score = 50; //ミニ課題80→50

		if(score == 100) {
			System.out.println("満点です！ご褒美を上げます！");
		}else if(score >= 90){ //ミニ課題80→90
			System.out.println("よくできました！");
		}		else if(score >= 60) {
			System.out.println("合格です！");
		}else {
			System.out.println("赤点です・・・補講を行ないます");
		}
	}
}
