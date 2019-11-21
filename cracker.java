import java.util.*;

public class cracker {

	/* from, over, to; describes moves. */
	static int[][] moves = { 
		{0, 1, 3}, 
		{0, 2, 5},
		{1, 3, 6}, 
		{1, 4, 8}, 
		{2, 4, 7},
		{2, 5, 9}, 
		{3, 6, 10}, 
		{3, 7, 12},
		{4, 7, 11}, 
		{4, 8, 13}, 
		{5, 8, 12},
		{5, 9, 14}, 
		{3, 4, 5}, 
		{6, 7, 8},
		{7, 8, 9}, 
		{10, 11, 12}, 
		{11, 12, 13},
		{12, 13, 14}
	};

	/* generator for moves and their opposites */
	static int[][] step = {
		{3, 1, 0}, 
		{5, 2, 0},
		{6, 3, 1}, 
		{8, 4, 1}, 
		{7, 4, 2},
		{9, 5, 2}, 
		{10, 6, 3}, 
		{12, 7, 3},
		{11, 7, 4}, 
		{13, 8, 4}, 
		{12, 8, 5},
		{14, 9, 5}, 
		{5, 4, 3}, 
		{8, 7, 6},
		{9, 8, 7}, 
		{12, 11, 10}, 
		{13, 12, 11},
		{14, 13, 12}
	};

	/*build cells, 1 if full and 0 if empty */
	public static int[] init(int i)
	{
		int[] cells = new int[15];
		cells[i] = 0;
		return(cells);
	}

	/* performs a move if possible, given current cell occupancy */
	public static int[] move(int[] i, int from, int over, int to)
	{
		int k = 14;
		int[] d = i;
		int[] temp = new int[15];

		if(d[from] == 1 && d[over] == 1 && d[to] == 0)
		{
			//copy
			for(int iter = 0; iter < d.length; iter++)
			{
				temp[iter] = d[iter];
			}
		}
		return(temp);
	}

	/* set initial position with empty at i */
	public static int[] puzzle(int i)
	{
		int[] kd = init(i);

		return(kd);
	}





	/* MAIN */
	public static void main(String[] args)
	{
		//Turn nonstatic referenced objects into referencable static objects
		cracker obj = new cracker();
		//cracker.step();

	}
}