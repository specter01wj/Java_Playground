/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remove_duplicates_from_sorted_array;
import java.util.*;
/**
 *
 * @author james.wang
 */
public class Remove_Duplicates_from_Sorted_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] input = {1,1,1,1,2,3,3};
        System.out.println("O input: " + Arrays.toString(input));
        int[][] output = removeDuplicates(input);
        System.out.println("input: " + Arrays.toString(input) + 
                "\noutput array: " + Arrays.toString(output[1]) +
                "\noutput index: " + (output[0][0]) );
    }
    
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public static int[][] removeDuplicates(int[] nums) {
        //if(nums.length == 0) return 0;

        int index = 1;
        int[][] res = new int[2][1];
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[index - 1]) {
                nums[index++] = nums[i];
            }
        }
        
        res[1] = Arrays.copyOfRange(nums, 0, index);
        res[0][0] = index;
        //return index;
        return res;

    }
    
}
