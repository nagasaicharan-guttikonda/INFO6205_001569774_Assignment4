package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class UfClient_3 {


    public static void main(String[] args) {
    	int n = 100;
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 10; j++)
            {
                count += UF(n);
            }
            System.out.println("No of sites: " + n + " mean value for 10 runs: " +  count / 10);
            n = n * 2;
        }
    }
    
	public static  int generateRandomly(int max) {
	    Random random = new Random();
	    return random.nextInt(max);
	}
    
    public static int UF(int n) {
        int pairCount = 0;
        UF_HWQUPC ufhwqupc = new UF_HWQUPC(n);  //Takes true value for pathcompression as default this method calls UF_HWQUPC(n,true)
        while (ufhwqupc.components() > 1) {
    		int p= generateRandomly(n);
    		int q= generateRandomly(n);
            pairCount++;
            if (ufhwqupc.connected(p, q)) continue;
            ufhwqupc.union(p, q);
        }
        return  pairCount;
    }
}