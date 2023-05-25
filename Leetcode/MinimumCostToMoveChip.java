package Leetcode;

public class MinimumCostToMoveChip {
    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        for(int i:position)
            if(i%2==0)
                even++;
        return Math.min(even,position.length-even);
    }
    public static void main(String args[]) {
        int[] positon={2,3,4,5};
        System.out.println(minCostToMoveChips(positon));
    }
}
