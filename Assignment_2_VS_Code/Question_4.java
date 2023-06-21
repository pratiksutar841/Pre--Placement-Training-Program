/*  Question 4
You have a long flowerbed in which some of the plots are planted, and some are not.
However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, 
and an integer n, return true if n new flowers can be planted in the flowerbed without violating 
the no-adjacent-flowers rule and false otherwise.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
 */
package Assignment_2_VS_Code;


public class Question_4{ //CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        int i = 0;
        
        while (i < length) {
            // Check if the current plot is empty and its adjacent plots are also empty
           if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) 
           {
                flowerbed[i] = 1; // Plant a flower
                count++; // Increment the count of planted flowers
                
                // Break the loop if the required number of flowers have been planted
                if (count >= n) {
                    break;
                }
            }
            
            i++;
        }
        
        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }
}
