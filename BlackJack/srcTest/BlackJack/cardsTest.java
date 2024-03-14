package BlackJack;
import org.junit.Before;
import static org.junit.Assert.*;

import org.junit.Test;

public class cardsTest {
	cards card = new cards();
	@Test
	public void testAce() {
		int value = card.Ace();
		assertEquals(11, value);
		
	}
	@Test
	public void testAce2() {
		card.valueA = 22;
		int value = card.Ace();
		assertEquals(1, value);
	}
	@Test
	public void testTwo() {
		int value = card.Two();
		assertEquals(2, value);
	}
	@Test
	public void testThree() {
		int value = card.Three();
		assertEquals(3, value);
	}
	@Test
	public void testFour() {
		int value = card.Four();
		assertEquals(4, value);
	}
	@Test
	public void testFive() {
		int value = card.Five();
		assertEquals(5, value);
	}
	@Test
	public void testSix() {
		int value = card.Six();
		assertEquals(6, value);
	}
	@Test
	public void testSeven() {
		int value = card.Seven();
		assertEquals(7, value);
	}
	@Test
	public void testEight() {
		int value = card.Eight();
		assertEquals(8, value);
	}
	@Test
	public void testNine() {
		int value = card.Nine();
		assertEquals(9, value);
	}
	@Test
	public void testTen() {
		int value = card.Ten();
		assertEquals(10, value);
	}
	@Test
	public void testJack() {
		int value = card.Jack();
		assertEquals(10, value);
	}
	@Test
	public void testQueen() {
		int value = card.Queen();
		assertEquals(10, value);
	}
	@Test
	public void testKing() {
		int value = card.King();
		assertEquals(10, value);
	}

}
