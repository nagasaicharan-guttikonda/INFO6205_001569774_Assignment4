
package edu.neu.coe.info6205.union_find;

import java.util.Random;
import edu.neu.coe.info6205.union_find.UF_HWQUPC;

public class UFClient {
	static int pairCount=0;
	public static void Benchmark(int N) {
		
		WeighedUnionFindWithPathCompressionAllNodes wu = new WeighedUnionFindWithPathCompressionAllNodes(N);
		//UnionByDepthUF wu = new UnionByDepthUF(N);
		while(wu.components() != 1)
		{
			
		int p= generateRandomly(N);
		int q= generateRandomly(N);
		count();
		//System.out.println("p = "+p+" q = "+q);
		if(p==q)
			continue;
		if(wu.connected(p, q)) continue;
		else {	
			wu.union(p, q);
			  }
		}
		}
	
	public static  int generateRandomly(int max) {
	    Random random = new Random();
	    return random.nextInt(max);
	}
	public static int count()
	{
		return pairCount++;
	}

}
