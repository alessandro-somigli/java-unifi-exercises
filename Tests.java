import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

public class Tests {
	
	@Nested
	class Lab12_Tests {
		/**		lab12_1		*/
		
		@Test
		public void lab12_1_test1() {
			int y=1;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{ {9,10,11,12},
										  {1,2,3,4},
										  {5,6,7,8}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test2() {
			int y=4;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{ {9,10,11,12},
										  {1,2,3,4},
										  {5,6,7,8}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
	
		@Test
		public void lab12_1_test3() {
			int y=7;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{ {9,10,11,12},
										  {1,2,3,4},
										  {5,6,7,8}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test4() {
			int y=-2;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{ {9,10,11,12},
										  {1,2,3,4},
										  {5,6,7,8}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test5() {
			int y=-5;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{ {9,10,11,12},
										  {1,2,3,4},
										  {5,6,7,8}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test6() {
			int y=-8;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{ {9,10,11,12},
										  {1,2,3,4},
										  {5,6,7,8}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test7() {
			int y=10;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{ {9,10,11,12},
										  {1,2,3,4},
										  {5,6,7,8}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test8() {
			int y=0;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{{1,2,3,4},
			     						 {5,6,7,8},
			     						 {9,10,11,12}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test21() {
			int y=3;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{{1,2,3,4},
			     						 {5,6,7,8},
			     						 {9,10,11,12}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test9() {
			int y=-3;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{{1,2,3,4},
			     						 {5,6,7,8},
			     						 {9,10,11,12}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test10() {
			int y=-1;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{{5,6,7,8},
			     						 {9,10,11,12},
			     						 {1,2,3,4}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test11() {
			int y=-4;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{{5,6,7,8},
			     						 {9,10,11,12},
			     						 {1,2,3,4}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test12() {
			int y=2;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{{5,6,7,8},
			     						 {9,10,11,12},
			     						 {1,2,3,4}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test13() {
			int y=5;
			int[][] input = new int[][]{ {1,2,3,4},
									     {5,6,7,8},
									     {9,10,11,12}};
			int[][] output = new int[][]{{5,6,7,8},
			     						 {9,10,11,12},
			     						 {1,2,3,4}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test14() {
			int y=0;
			int[][] input = new int[][]{ {1},
									     {5},
									     {9}};
			int[][] output = new int[][]{{1},
			     						 {5},
			     						 {9}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test15() {
			int y=1;
			int[][] input = new int[][]{ {1},
									     {5},
									     {9}};
			int[][] output = new int[][]{{9},
			     						 {1},
			     						 {5}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
	
		@Test
		public void lab12_1_test16() {
			int y=-10;
			int[][] input = new int[][]{ {1},
									     {5},
									     {9}};
			int[][] output = new int[][]{{5},
			     						 {9},
			     						 {1}};								 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test17() {
			int y=10;
			int[][] input = new int[][]{ {1},{2},{3}};
			int[][] output = new int[][]{ {3},{1},{2}};						 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test18() {
			int y=22;
			int[][] input = new int[][]{ {1}};
			int[][] output = new int[][]{ {1}};						 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test19() {
			int y=-4;
			int[][] input = new int[][]{ {1}};
			int[][] output = new int[][]{ {1}};						 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		@Test
		public void lab12_1_test20() {
			int y=0;
			int[][] input = new int[][]{ {1}};
			int[][] output = new int[][]{ {1}};						 
			Assert.assertArrayEquals(Exercises.lab12_1(input, y),output);
		}
		
		/**		lab12_2		*/
		@Test
		public void lab12_2_test1() {
			char[] inputArray = {'b', 'a', 'w', 'w', 'T', 'T', 'x', 'x', 'x', 'w', 'w', 'w', 'W', 'w', 'a', 'w', '2', '1', '1'};
			char inputChar = 'w';
			int output = 3;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test2() {
			char[] inputArray = {'b', 'a', 'w', 'w', 'T', 'T', 'x', 'x', 'x', 'w', 'w', 'w', 'W', 'w', 'a', 'w', '2', '1', '1'};
			char inputChar = 'b';
			int output = 1;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test3() {
			char[] inputArray = {'b', 'a', 'w', 'w', 'T', 'T', 'x', 'x', 'x', 'w', 'w', 'w', 'W', 'w', 'a', 'w', '2', '1', '1'};
			char inputChar = 'a';
			int output = 1;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test4() {
			char[] inputArray = {'b', 'a', 'w', 'w', 'T', 'T', 'x', 'x', 'x', 'w', 'w', 'w', 'W', 'w', 'a', 'w', '2', '1', '1'};
			char inputChar = 'T';
			int output = 2;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		
		@Test
		public void lab12_2_test5() {
			char[] inputArray = {'b', 'a', 'w', 'w', 'T', 'T', 'x', 'x', 'x', 'w', 'w', 'w', 'W', 'w', 'a', 'w', '2', '1', '1'};
			char inputChar = 'x';
			int output = 3;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test6() {
			char[] inputArray = {'b', 'a', 'w', 'w', 'T', 'T', 'x', 'x', 'x', 'w', 'w', 'w', 'W', 'w', 'a', 'w', '2', '1', '1'};
			char inputChar = 'W';
			int output = 1;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test7() {
			char[] inputArray = {'b', 'a', 'w', 'w', 'T', 'T', 'x', 'x', 'x', 'w', 'w', 'w', 'W', 'w', 'a', 'w', '2', '1', '1'};
			char inputChar = '3';
			int output = 0;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test8() {
			char[] inputArray = {'b', 'a', 'w', 'w', 'T', 'T', 'x', 'x', 'x', 'w', 'w', 'w', 'W', 'w', 'a', 'w', '2', '1', '1'};
			char inputChar = '1';
			int output = 2;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test9() {
			char[] inputArray = {'b', 'a'};
			char inputChar = 'b';
			int output = 1;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test10() {
			char[] inputArray = {'b', 'a'};
			char inputChar = 'a';
			int output = 1;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test11() {
			char[] inputArray = {'b', 'a'};
			char inputChar = 'c';
			int output = 0;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test12() {
			char[] inputArray = {'a'};
			char inputChar = 'b';
			int output = 0;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test13() {
			char[] inputArray = {'a'};
			char inputChar = 'a';
			int output = 1;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test14() {
			char[] inputArray = {'a'};
			char inputChar = '1';
			int output = 0;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test15() {
			char[] inputArray = {'a','a','a'};
			char inputChar = 'a';
			int output = 3;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test16() {
			char[] inputArray = {'a','a'};
			char inputChar = 'a';
			int output = 2;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test17() {
			char[] inputArray = {'a','a'};
			char inputChar = 'b';
			int output = 0;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test18() {
			char[] inputArray = {'a','a','b'};
			char inputChar = 'a';
			int output = 2;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test19() {
			char[] inputArray = {'b','a','a'};
			char inputChar = 'a';
			int output = 2;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
		
		@Test
		public void lab12_2_test20() {
			char[] inputArray = {'a','b','a'};
			char inputChar = 'a';
			int output = 1;
			Assert.assertEquals(Exercises.lab12_2(inputArray, inputChar), output);
		}
	}
	
	@Nested
	class Lab13_Tests {
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
}