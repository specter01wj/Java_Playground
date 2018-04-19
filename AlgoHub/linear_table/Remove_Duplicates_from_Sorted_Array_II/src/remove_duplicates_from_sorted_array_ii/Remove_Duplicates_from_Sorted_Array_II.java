/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remove_duplicates_from_sorted_array_ii;
import java.util.*;
/**
 *
 * @author james.wang
 */
public class Remove_Duplicates_from_Sorted_Array_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] input = {1,1,1,1,2,3,3};
        System.out.println("O input: " + Arrays.toString(input));
        int[][] output = removeDuplicates2(input);
        System.out.println("input: " + Arrays.toString(input) + 
                "\noutput array: " + Arrays.toString(output[1]) +
                "\noutput index: " + (output[0][0]) );
    }

    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public static int[][] removeDuplicates2(int[] nums) {
    	
    	int index = 2;
    	int[][] res = new int[2][1];
        
        if(nums.length <= 2) {
            res[0][0] = nums.length;
            return res;
        }
            
    	for(int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[index - 2]) {
    		nums[index++] = nums[i];
            }
    	}

    	//return index;
    	res[1] = Arrays.copyOfRange(nums, 0, index);
        res[0][0] = index;
        return res;
    }
    
}
