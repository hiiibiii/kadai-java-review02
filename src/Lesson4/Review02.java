package Lesson4;

public class Review02 {

	public static void main(String[] args) {
		//1から100までの連続した整数を画面に表示する。ただし、下記の条件にしたがうこと：
		for(int num = 1; num <=100; num++) {

			//上記2つの条件は同時に満たせる。つまり、もし、その整数が3で割り切れ、なおかつ5で割り切れる数なら "FizzBuzz" と表示する
			if (num % 3 == 0 && num % 5 ==0) {
				System.out.println("FizzBuzz");

			//もし、その整数が3で割り切れる数なら "Fizz" と表示する
			}else if(num % 3 == 0) {
				System.out.println("Fizz");

			//もし、その整数が5で割り切れる数なら "Buzz" と表示する
			}else if(num % 5 == 0) {
				System.out.println("Buzz");

			//それ以外の数は、その数をそのまま表示する
			}else {
				System.out.println(num);
			}
		}
	}
}
