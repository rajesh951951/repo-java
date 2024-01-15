package main.java.dataStructures.Arrays;

public class ArraySearchInsertPosition {
    public static void main(String[] args) {
        ArraySearchInsertPosition arraySearchInsertPosition = new ArraySearchInsertPosition();
        System.out.println(arraySearchInsertPosition.searchInsert(new int[]{1,2,3,4}, 5));//4
        System.out.println(arraySearchInsertPosition.searchInsert(new int[]{1,3,4}, 2));//1
        System.out.println(arraySearchInsertPosition.searchInsert(new int[]{1,3}, 2));//1
        System.out.println(arraySearchInsertPosition.searchInsert(new int[]{1,3}, 1));//0
        System.out.println(arraySearchInsertPosition.searchInsert(new int[]{1}, 1));//0
        System.out.println(arraySearchInsertPosition.searchInsert(new int[]{1}, 2));//1
    }

    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums.length == 0)
                index = i;
            else if(nums.length == 1){
                if(nums[i] >= target)
                    index = i;
                else
                    index = i+1;
            }else if(nums[i]>=target /* && i != nums.length-1 */){
                index = i;
                break;
            }else if (nums[i] < target && i != 0){
                index = i+1;
            }/*else if (nums[i] > target && i != nums.length-1){
                index = i;
                break;
            }*/
        }
        return index;
    }
}
