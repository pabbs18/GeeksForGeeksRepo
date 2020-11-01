/**
 * 
 */
package strings;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 * Using only 2,3,5,7 we can make 2 digit prime numbers as
 * 
 * SingleDigit:			   2                  3                    5                  7
 		            	/ |  | \           / | |  \             /  | | \          /  | |  \ 
	Two digit: 	       22 23 25 27        32 33 35 37         52 53 55 57        72 73 75 77
		              /||\   
 * 	Three Digit: 222 2253 225 227.............	
 * 
 *   1 |2 |3 |4 |5  |6  |7  |8  |9  |10 |11 |12......
 *   ---------------------------------------------
 *   2 |3 |5 |7 |22 |23 |25 |27 |32 |33 |35 |37
 * 
 * Since at each level(Single, 2 digit, 3 digit ) there are 4 positions, 
 * to get the position of the required number, we take mod of 4.
 */
public class NthNumberMadeOfPrimeDigits {

	public static int findNthPrime(int requiredPosition) {
		int remainder = 0;
		String num = "";

		while (requiredPosition > 0) {
			remainder = requiredPosition % 4;// this will tell us below each number(2,3,5,7) what is the position of our required number eg: 33 is at pos 2 under 3
			switch (remainder) {
			case 1:
				num += '2';
				break;

			case 2:
				num += '3';
				break;

			case 3:
				num += '5';
				break;

			case 0:// 0 instead of 4 as 4 divides 4
				num += '7';
				break;
			}

			//if the requiredPositionNumber is divisible by 4, then reduce the requiredPositionNumber by 1, otherwise it shifts by 1 extra position, eg: for requiredPosition=8, instead of 27, it gives 37
			if (remainder == 0) {
				requiredPosition--;
			}

			requiredPosition = requiredPosition / 4; // get the next number to the left
		}

		String s = new StringBuilder(num).reverse().toString();

		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		System.out.println(findNthPrime(8));

	}

}
