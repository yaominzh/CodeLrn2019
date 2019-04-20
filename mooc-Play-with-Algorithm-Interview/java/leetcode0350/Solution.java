package leetcode0350;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

/*
350. Intersection of Two Arrays II
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?


bobo数据结构   7-9讲解
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> map= new TreeMap<>();
        for(int num:nums1){
            if(!map.containsKey(num))
                map.put(num,1);
            else
                map.put(num, map.get(num)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums2){
            if(map.containsKey(num)){
                list.add(num);
                map.put(num, map.get(num)-1);
                if(map.get(num)==0)
                    map.remove(num);
            }
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size(); i++)
            res[i]= list.get(i);
        return res;
    }

}
