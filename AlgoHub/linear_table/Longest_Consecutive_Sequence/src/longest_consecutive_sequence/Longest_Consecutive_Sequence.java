/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longest_consecutive_sequence;
import java.util.*;
/**
 *
 * @author james.wang
 */
public class Longest_Consecutive_Sequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] input = {100, 4, 200, 1, 3, 2};
        int[][] output = longestConsecutive(input);
        System.out.println("input: " + Arrays.toString(input) + 
                "\noutput array: " + Arrays.toString(output[1]) +
                "\noutput index: " + (output[0][0]) );
    }

    public static int[][] longestConsecutive(int[] nums) {

    	HashSet<Integer> mySet = new HashSet<Integer>();
    	HashSet<Integer> mySet_consec = new HashSet<Integer>();
    	int[][] res = new int[2][1];

    	for(int i : nums) mySet.add(i);

    	int longest = 0;

    	for(int i : nums) {
    		int length = 1;
    		for(int j = i - 1; mySet.contains(j); --j) {
    			mySet.remove(j);
    			mySet_consec.add(j);
    			++length;
    		}
    		for(int j = i + 1; mySet.contains(j); ++j) {
    			mySet.remove(j);
    			mySet_consec.add(j);
    			++length;
    		}
    		longest = Math.max(longest, length);
    	}

    	//return longest;
    	res[1] = mySet_consec.stream().mapToInt(Integer::intValue).toArray();
        res[0][0] = longest;
    	return res;
    }
    
}
