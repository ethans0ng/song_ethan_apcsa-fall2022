package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

public class Grid
{
   private String[][] grid;
   private String counts = "";

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				grid[i][j] = vals[(int) Math.floor(Math.random()*vals.length)];
			}
		}
		for(int i=0; i<vals.length; i++) {
			counts = counts + vals[i] + " count is " + countVals(vals[i]) + "\n";
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[] counts = new int[vals.length];
		for(int i=0; i<vals.length; i++) {
			counts[i]=countVals(vals[i]);
		}
		int maxIdx = 0;
		for(int i=0; i<counts.length; i++) {
			if(counts[i]>maxIdx) maxIdx = counts[i];
		}
		for(int i=0; i<counts.length; i++) {
			if(counts[i]==maxIdx) return vals[i] + " occurs the most.";
		}
		return "";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				if(grid[i][j].equals(val)) count+=1;
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				output += grid[i][j] + " ";
			}
			output+="\n";
		}
		return output + "\n" + counts;
	}
}