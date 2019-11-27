#include <iostream>
#include <vector>
#include <cassert>
#include <stdexcept>

using namespace std;

/// Two pointers
///// Time Complexity:  O(n)
///// Space Complexity: O(1)
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {

        int length = 1;

        if(nums.empty()) return 0;

        int temp = nums[0];

        for(int i = 1; i < nums.size(); ++i) {
            if(nums[i] != temp) {
                nums[length] = nums[i];
                length++;
                temp = nums[i];
            }
        }

        return length;
    }
};


int main() {

    vector<int> nums1 = {1, 1, 2};
    cout << Solution().removeDuplicates(nums1) << endl;

    return 0;
}