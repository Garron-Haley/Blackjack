package BlackJack;
import java.util.Scanner;
public class BlackJack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double balance = 100;
		cards card = new cards();
		while(balance != 0) {
			System.out.println("your balance is: " + balance);
			double amount;
			System.out.println("Enter amount to gamble");
			amount = input.nextDouble();
			while (amount > balance) {
				System.out.println("amount can not be more than your balance");
				System.out.println("enter valid amount");
				amount = input.nextDouble();
			}
			balance = balance - amount;
			int handvalue = 0;
			int dealvalue = 0;
			int[] deal = new int[11];
			int[] hand = new int[11];
			deal[0] = (int)((Math.random() * 1000) % 13); 
			deal[1] = (int)((Math.random() * 1000) % 13);
			hand[0] = (int)((Math.random() * 1000) % 13);
			hand[1] = (int)((Math.random() * 1000) % 13);
			
			for (int i = 0; i < 2; i++) {
				for(;;) {
				if (hand[i] == 0) {
					card.valueA = card.valueA + 11;
					hand[i] = card.Ace();
					if (card.Ace() == 1) {
						card.valueA = card.valueA - 10;
					}
					card.value[0]--;
					break;
				}
				if (hand[i] == 1) {
					hand[i] = card.Two();
					card.value[1]--;
					card.valueA = card.valueA + 2;
					break;
				}
				if (hand[i] == 2) {
					hand[i] = card.Three();
					card.value[2]--;
					card.valueA = card.valueA + 3;
					break;
				}
				if (hand[i] == 3) {
					hand[i] = card.Four();
					card.value[3]--;
					card.valueA = card.valueA + 4;
					break;
				}
				if (hand[i] == 4) {
					hand[i] = card.Five();
					card.value[4]--;
					card.valueA = card.valueA + 5;
					break;
				}
				if (hand[i] == 5) {
					hand[i] = card.Six();
					card.value[5]--;
					card.valueA = card.valueA + 6;
					break;
				}
				if (hand[i] == 6) {
					hand[i] = card.Seven();
					card.value[6]--;
					card.valueA = card.valueA + 7;
					break;
				}
				if (hand[i] == 7) {
					hand[i] = card.Eight();
					card.value[7]--;
					card.valueA = card.valueA + 8;
					break;
				}
				if (hand[i] == 8) {
					hand[i] = card.Nine();
					card.value[8]--;
					card.valueA = card.valueA + 9;
					break;
				}
				if (hand[i] == 9) {
					hand[i] = card.Ten();
					card.value[9]--;
					card.valueA = card.valueA + 10;
					break;
				}
				if (hand[i] == 10) {
					hand[i] = card.Jack();
					card.value[10]--;
					card.valueA = card.valueA + 10;
					break;
				}
				if (hand[i] == 11) {
					hand[i] = card.Queen();
					card.value[11]--;
					card.valueA = card.valueA + 10;
					break;
				}
				if (hand[i] == 12) {
					hand[i] = card.King();
					card.value[12]--;
					card.valueA = card.valueA + 10;
					break;
				}
				}
				
			}
			handvalue = card.valueA;
			card.valueA = 0;
			for (int i = 0; i < 2; i++) {
				for (;;) {
				if (deal[i] == 0) {
					card.valueA = card.valueA + 11;
					deal[i] = card.Ace();
					if (card.Ace() == 1) {
						card.valueA = card.valueA - 10;
					}
					card.value[0]--;
					break;
				}
				if (deal[i] == 1) {
					deal[i] = card.Two();
					card.value[1]--;
					card.valueA = card.valueA + 2;
					break;
				}
				if (deal[i] == 2) {
					deal[i] = card.Three();
					card.value[2]--;
					card.valueA = card.valueA + 3;
					break;
				}
				if (deal[i] == 3) {
					deal[i] = card.Four();
					card.value[3]--;
					card.valueA = card.valueA + 4;
					break;
				}
				if (deal[i] == 4) {
					deal[i] = card.Five();
					card.value[4]--;
					card.valueA = card.valueA + 5;
					break;
				}
				if (deal[i] == 5) {
					deal[i] = card.Six();
					card.value[5]--;
					card.valueA = card.valueA + 6;
					break;
				}
				if (deal[i] == 6) {
					deal[i] = card.Seven();
					card.value[6]--;
					card.valueA = card.valueA + 7;
					break;
				}
				if (deal[i] == 7) {
					deal[i] = card.Eight();
					card.value[7]--;
					card.valueA = card.valueA + 8;
					break;
				}
				if (deal[i] == 8) {
					deal[i] = card.Nine();
					card.value[8]--;
					card.valueA = card.valueA + 9;
					break;
				}
				if (deal[i] == 9) {
					deal[i] = card.Ten();
					card.value[9]--;
					card.valueA = card.valueA + 10;
					break;
				}
				if (deal[i] == 10) {
					deal[i] = card.Jack();
					card.value[10]--;
					card.valueA = card.valueA + 10;
					break;
				}
				if (deal[i] == 11) {
					deal[i] = card.Queen();
					card.value[11]--;
					card.valueA = card.valueA + 10;
					break;
				}
				if (deal[i] == 12) {
					deal[i] = card.King();
					card.value[12]--;
					card.valueA = card.valueA + 10;
					break;
				}
				}
			}
			dealvalue = card.valueA;
			card.valueA = handvalue;
			System.out.println("Your cards are " + hand[0]+" and "+ hand[1]);
			System.out.println(" their visible card is "+ deal[0]);
			int b = 0;
			while (b < 1) {
				System.out.println("Enter hit stand or stand, or shuffle to shuffle deck");
				
				if (input.next().equalsIgnoreCase("hit")) {
					for (int i = 2; i < hand.length; i++) {
						for (;;) {
						hand[i] = (int)((Math.random() * 1000) % 13);
						if (hand[i] == 0) {
							card.valueA = card.valueA + 11;
							hand[i] = card.Ace();
							if (card.Ace() == 1) {
								card.valueA = card.valueA - 10;
							}
							card.value[0]--;
							break;
						}
						if (hand[i] == 1) {
							hand[i] = card.Two();
							card.value[1]--;
							card.valueA = card.valueA + 2;
							break;
						}
						if (hand[i] == 2) {
							hand[i] = card.Three();
							card.value[2]--;
							card.valueA = card.valueA + 3;
							break;
						}
						if (hand[i] == 3) {
							hand[i] = card.Four();
							card.value[3]--;
							card.valueA = card.valueA + 4;
							break;
						}
						if (hand[i] == 4) {
							hand[i] = card.Five();
							card.value[4]--;
							card.valueA = card.valueA + 5;
							break;
						}
						if (hand[i] == 5) {
							hand[i] = card.Six();
							card.value[5]--;
							card.valueA = card.valueA + 6;
							break;
						}
						if (hand[i] == 6) {
							hand[i] = card.Seven();
							card.value[6]--;
							card.valueA = card.valueA + 7;
							break;
						}
						if (hand[i] == 7) {
							hand[i] = card.Eight();
							card.value[7]--;
							card.valueA = card.valueA + 8;
							break;
						}
						if (hand[i] == 8) {
							hand[i] = card.Nine();
							card.value[8]--;
							card.valueA = card.valueA + 9;
							break;
						}
						if (hand[i] == 9) {
							hand[i] = card.Ten();
							card.value[9]--;
							card.valueA = card.valueA + 10;
							break;
						}
						if (hand[i] == 10) {
							hand[i] = card.Jack();
							card.value[10]--;
							card.valueA = card.valueA + 10;
							break;
						}
						if (hand[i] == 11) {
							hand[i] = card.Queen();
							card.value[11]--;
							card.valueA = card.valueA + 10;
							break;
						}
						if (hand[i] == 12) {
							hand[i] = card.King();
							card.value[12]--;
							card.valueA = card.valueA + 10;
							break;
						}
						}
					System.out.println("your new card is "+ hand[i]);
					if (card.valueA > 21) {
						System.out.println("you busted");
						b = 1;
						card.valueA = 0;
						break;
					}
					else {
						break;
					}
					
					}
					
				}
				if (input.next().equalsIgnoreCase("stand")); break; 
					
				
			}
		}
		System.out.println("you lost all your money" );		
			
			
			
		
		
		
	}

}
class cards {
	int valueA = 0;
	int[] value = new int[13]; 
	{for (int i = 0; i < value.length; i++) { 
		value[i] = 4;
	}
	}
	int Ace() {
		if (value[0] > 0) {
		if (valueA > 21) {
			return 1;
		}
		else {
			return 11;
		}
		}
		else {
			return King();
		}
	}
	int Two() {
		if (value[1] > 0) {
			return 2;
		}
		else {
		return Ace();
		}
	}
	int Three() {
		if (value[2] > 0) {
			return 3;
		}
		else {
		return Two();
		}
	}
	int Four() {
		if (value[3] > 0) {
			return 4;
		}
		else {
		return Three();
		}
	}
	int Five() {
		if (value[4] > 0) {
			return 5;
		}
		else {
		return Four();
		}
	}
	int Six() {
		if (value[5] > 0) {
			return 6;
		}
		else {
		return Five();
		}
	}
	int Seven() {
		if (value[6] > 0) {
			return 7;
		}
		else {
		return Six();
		}
	}
	int Eight() {
		if (value[7] > 0) {
			return 8;
		}
		else {
		return Seven();
		}
	}
	int Nine() {
		if (value[8] > 0) {
			return 9;
		}
		else {
		return Eight();
		}
	}
	int Ten() {
		if (value[9] > 0) {
			return 10;
		}
		else {
		return Nine();
		}
	}
	int Jack() {
		if (value[10] > 0) {
			return 10;
		}
		else {
		return Ten();
		}
	}
	int Queen() {
		if (value[11] > 0) {
			return 10;
		}
		else {
		return Jack();
		}
	}
	int King() {
		if (value[12] > 0) {
			return 10;
		}
		else {
		return Queen();
		}
	}
	
	
}