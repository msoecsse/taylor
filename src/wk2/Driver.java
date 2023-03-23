package wk2;

import wk1.ArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>();
        for(int i=0; i<50; i++) {
            nums.add(i);
        }
        System.out.println(sumIteratingEnhancedForLoop(nums));
    }

    public static int sumIterating(Collection<Integer> nums) {
        int total = 0;
        Iterator<Integer> aName = nums.iterator();
        while(aName.hasNext()) {
            Integer num = aName.next();
            total += num;
        }
        return total;
    }

    public static int sumIteratingEnhancedForLoop(Collection<Integer> nums) {
        int total = 0;
        for(Integer num : nums) {
            total += num;
        }
        return total;
    }

    public static int sum(List<Integer> nums) {
        int total = 0;
        int size = nums.size();
        for(int i=0; i<size; i++) {
            total += nums.get(i);
        }
        return total;
    }
}
