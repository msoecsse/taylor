package wk2;

import wk1.ArrayList;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<50; i++) {
            nums.add(i);
        }
        System.out.println(sum(nums));
    }

    public static int sum(List<Integer> nums) {
        int total = 0;
        for(int i=0; i<nums.size(); i++) {
            total += nums.get(i);
        }
        return total;
    }
}
