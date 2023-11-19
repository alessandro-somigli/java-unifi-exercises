import org.junit.Assert;
import org.junit.Test;

public class Tests {
	
	/**		lab13_1		*/
	@Test
	public void lab13_1_test1() {
		
		int a = 999999;
		int b = 919191;
		int c = 111111;
		int r = 919191; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}
	
	@Test
	public void lab13_1_test2() {
		
		int a = 1234;
		int b = 1234;
		int c = 1234;
		int r = 1234; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}
	
	@Test
	public void lab13_1_test3() {
		
		int a = 1234;
		int b = 4321;
		int c = 5555;
		int r = 0; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}
	
	@Test
	public void lab13_1_test4() {
		
		int a = 1;
		int b = 1;
		int c = 1;
		int r = 1; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}
	
	@Test
	public void lab13_1_test5() {
		
		int a = 1;
		int b = 2;
		int c = 1;
		int r = 1; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}
	
	@Test
	public void lab13_1_test6() {
		
		int a = 1;
		int b = 0;
		int c = 2;
		int r = 0; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}
	
	@Test
	public void lab13_1_test7() {
		
		int a = 0;
		int b = 0;
		int c = 0;
		int r = 0; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}
	
	@Test
	public void lab13_1_test8() {
		
		int a = 120000;
		int b = 230000;
		int c = 450000;
		int r = 0; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}
	
	@Test
	public void lab13_1_test9() {
		
		int a = 120000;
		int b = 230000;
		int c = 150000;
		int r = 10000; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}
	
	@Test
	public void lab13_1_test10() {
		
		int a = 121130;
		int b = 230141;
		int c = 451051;
		int r = 111; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}
					
	@Test
	public void lab13_1_test11() {
		
		int a = 937829; 
		int b = 913803;
		int c = 212801;
		int r = 9180; 
		Assert.assertEquals(Exercises.lab13_1(a,b,c), r);
	}

	/**		lab13_2		*/
	@Test
	public void lab13_2_test1() {
		
		int[][] T = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] S = {{1,0,2}};
		int[][] N = {{5,4,6},{2,1,3},{8,7,9}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}
	
	@Test
	public void lab13_2_test2() {
		
		int[][] T = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] S = {{0,1,2}};
		int[][] N = {{1,2,3},{4,5,6},{7,8,9}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}
	
	@Test
	public void lab13_2_test3() {
		
		int[][] T = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] S = {{1,2,0}};
		int[][] N = {{9,7,8},{3,1,2},{6,4,5}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}
	
	@Test
	public void lab13_2_test4() {
		
		int[][] T = {{1,2},{3,4}};
		int[][] S = {{0,1}};
		int[][] N = {{1,2},{3,4}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}
	
	@Test
	public void lab13_2_test5() {
		
		int[][] T = {{1,2},{3,4}};
		int[][] S = {{1,0}};
		int[][] N = {{4,3},{2,1}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}
	
	@Test
	public void lab13_2_test6() {
		
		int[][] T = {{3}};
		int[][] S = {{0}};
		int[][] N = {{3}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}
	
	@Test
	public void lab13_2_test7() {
		
		int[][] T = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] S = {{0,2,1,3}};
		int[][] N = {{1,3,2,4},{9,11,10,12},{5,7,6,8},{13,15,14,16}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}

	@Test
	public void lab13_2_test8() {
		
		int[][] T = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] S = {{1,0,2},{0,1,2}};
		int[][] N = {{5,4,6},{2,1,3},{8,7,9}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}
	
	@Test
	public void lab13_2_test9() {
		
		int[][] T = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] S = {{1,0,2},{0,1,2},{0,2,1}};
		int[][] N = {{5,6,4},{8,9,7},{2,3,1}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}
		
	@Test
	public void lab13_2_test10() {
		
		int[][] T = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] S = {{1,0,2},{0,1,2},{0,2,1},{2,0,1}};
		int[][] N = {{9,7,8},{3,1,2},{6,4,5}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}

	@Test
	public void lab13_2_test11() {
		
		int[][] T = {{3}};
		int[][] S = {{0},{0},{0}};
		int[][] N = {{3}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}
	
	@Test
	public void lab13_2_test12() {
		
		int[][] T = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] S = {{1,0,2},{0,2,1}};
		int[][] N = {{5,6,4},{8,9,7},{2,3,1}};
		Assert.assertArrayEquals(Exercises.lab13_2(T,S),N);
	}
}