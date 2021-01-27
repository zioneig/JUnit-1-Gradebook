import static org.junit.Assert.*;

/* This class tests the GradeBook class
 * @author Zion Eig-Tassiello
 */

public class GradebookTester {

	private GradeBook g1;
	private GradeBook g2;
	
	public void setUp() {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(42);
		g1.addScore(53);
		g1.addScore(85);
		
		g2.addScore(21);
		g2.addScore(56);
		g2.addScore(85);
	}
	
	public void tearDown() {
		g1 = null;
		g2 = null;
	}
	
	public void testAddScore() {
		g1.addScore(10);
		g2.addScore(20);
		
		assertTrue(g1.toString().equals("42 53 85 10"));
		assertTrue(g2.toString().equals("21 56 85 20"));
		
		assertEquals(4, g1.getScoresSize(), 0.001);
		assertEquals(4, g2.getScoresSize(), 0.001);
	}
	
	public void testSum() {
		assertEquals(190, g1.sum(), 0.001);
		assertEquals(182, g2.sum(), 0.001);
	}
	
	public void testMinimum() {
		assertEquals(10, g1.minimum(), 0.001);
		assertEquals(20, g2.minimum(), 0.001);
	}
	
	public void testFinalScore() {
		assertEquals(180, g1.finalScore(), 0.001);
		assertEquals(172, g2.finalScore(), 0.001);
	}
}
