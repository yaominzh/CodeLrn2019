#include <iostream>
#include <vector>

/*
 * Leetcode 0209
 * Given an array of n positive integers and a positive integer s,
 * find the minimal length of a contiguous subarray of which the sum ≥ s.
 * If there isn't one, return 0 instead.
 */
using namespace std;

class Solution {
public:
    int minSubArrayLen(int s, vector<int> &nums) {
        int l = 0, r = -1; //nums[l...r]为滑动窗口
        int sum = 0;
        int res = nums.size() + 1;
        while (l < nums.size()) {
            if (r + 1 < nums.size() && sum < s)
                sum +=nums[++r];
            else
                sum -=nums[l++];

            if(sum>=s)
                res = min(res, r-l+1);
        }
        if(res == nums.size()+1)
            return 0;
        return res;

    }

};

int main() {
    int arr[] = {1, 1, 2, 2, 3};
    vector<int> vec(arr, arr + sizeof(arr) / sizeof(int));
    cout << Solution().minSubArrayLen(3,vec) << endl;
//    for (int i = 0; i < vec.size(); i++)
//        cout << vec[i] << " ";
//    cout << endl;
    return 0;
}