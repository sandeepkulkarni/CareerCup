package careercup.companies.adobe;

import java.util.Scanner;

/**
 * Career Cup url : http://www.careercup.com/question?id=8148134
 * 
 * A frog has to cross a river. There are n rocks in the river, using which the
 * frog can leap across the river. On its way across the river the frog can
 * chose to skip a rock, but it cannot skip two consecutive rocks because that
 * would be two far a distance for the frog to hop, also the frog would not skip
 * the first rock and the last rock. E.g. if there are 3 rocks, 1,2,3 and 4,
 * there could be three following routes it could take: 
 * 1,2,3,4
 * 1,2,3,4
 * 1,3,4
 * 1,2,4
 * 
 * Write a recursive algorithm, that takes a number of rocks' and prints all the
 * feasible paths. Ofcourse there can be other arguments too.
 */
public class FrogCrossingRiver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int noOfRocks = sc.nextInt();
		
		//initialize the rocks array from 1 to n
		int[] rocks = new int[noOfRocks];
		//Initialize Paths, paths will hold value of rock at indexes of rocks traversed by frog 
		int[] paths = new int[noOfRocks]; 
		
		for(int i=0; i < rocks.length; i++){
			int rockNo = i;
			rocks[i] = rockNo + 1;
			paths[i] = 0;
		}
		
		//Count variables to keep track if rocks and paths traversed
		int rockCount = 0;
		int pathCount = 0;
		printFrogPaths(rocks, rockCount, paths, pathCount);
		
		sc.close();
	}

	private static void printFrogPaths(int[] rocks, int rockCount, int[] paths, int pathCount) {
		
		//Base case : 
		//When rockCount == no of rocks and paths[i] == rocks[i] i.e when last rock reached, print paths
		if(rockCount == rocks.length && rocks[rockCount-1] == paths[pathCount-1]){
			//IMP : only print paths till path count
			for(int i=0; i < pathCount; i++){
				System.out.print(paths[i] + " ");
			}
			System.out.println();
			return;
		}else if(rockCount < rocks.length) {		//last rock not reached
			for(int i = 1; i <= 2; i++){	//as we can skip at max 2 rocks
				paths[pathCount] = rocks[rockCount];
				printFrogPaths(rocks, rockCount + i, paths, pathCount + 1);
			}
			
		}
		
		
	}

}
