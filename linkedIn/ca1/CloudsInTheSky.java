/*Question Description
We have a satellite observing the Earth's sky and monitoring the activity of the clouds. The satellite uses a Heat Radiation Index varying from 0 to 9 to determine if a particular spot in the sky is a cloud or not. Since clouds are colder, an index <= 4 can be considered a cloud.

The sky is represented as a two-dimensional array of integers containing the Heat Radiation Index.

We need to implement a method that returns the number of clouds that can be identified in the provided sky.

Note: a cloud is one or more connected cells with index <= 4. Cells are connected if they are horizontally or vertically adjacent to each other, not diagonally.

Examples: 

  9 9 5 2
  8 8 1 5
  8 8 8 8
  9 9 9 4

This should return 3 (cells [0][3] and [1][2] are not connected).


 9 8 7 4 4 3 3 2 5 9
 6 6 2 3 4 4 7 8 8 9
 8 7 7 8 9 9 7 7 6 5
 8 4 4 3 8 8 9 9 8 7
 5 4 3 2 8 8 9 8 8 7

This should return 2. 

Follow-up 1: change the method to return the size of the largest cloud, that is, the cloud with the most number of cells.
Follow-up 2: implement the new method boolean isThunderstorm(int[][] sky) which returns true if there is any clouds where at least half of its cells have index <= 1.

Evaluation Criteria
A great candidate will:
Have a working and clean solution in 25-30 minutes.
Ask clarifying questions.  For example about diagonal cloud cells.
Provide a couple sample test cases.  They should solve for the cloud 
Be comfortable with recursion

A good candidate will:
Have a working solution in 35 minutes.
Be comfortable with recursion
Maybe need a hint or two

A poor candidate will:
Have a solution in > 45 minutes or be unable to solve it independently
Not be comfortable with recursion, and fumble through it with many revisions
Have code that doesn't consider IndexOutOfBoundExceptions
*/



public class CloudsInTheSky {

  public static int getNumberOfClouds(int[][] sky) {
	
  }

  public static void main(String[] args){
	  
	  int[][] sky = {
		{9, 9, 5, 2},
		{8, 8, 1, 5},
		{8, 8, 8, 8},
		{9, 9, 9, 4}
	  };

	  int[][] sky2 = {
		{ 9, 8, 7, 4, 4, 3, 3, 2, 5, 9 },
		{ 6, 6, 2, 3, 4, 4, 7, 8, 8, 9 },
		{ 8, 7, 7, 8, 9, 9, 7, 7, 6, 5 },
		{ 8, 4, 4, 3, 8, 8, 9, 9, 8, 7 },
		{ 5, 4, 3, 2, 8, 8, 9, 8, 8, 7 }
	  };
  }
}