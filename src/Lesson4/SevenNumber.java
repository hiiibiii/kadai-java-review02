package Lesson4;

public class SevenNumber {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if( i%7 == 0 || i % 10 == 7 || i / 10 == 7) {
				//%ではなく/にしていたので×、7が入っている数字の表し方が分からなかったので×
				System.out.println("clap!");
			}else {
				System.out.println(i);
			}
		}
	}
}
