#include <iostream>
#include <vector>

/*
 * Leetcode 0080
 */
using namespace std;
class Solution {
public:
    int sortColors(vector<int>& nums){
        int zero = -1; // nums[0...zero] == 0
        int two = nums.size(); // nums[two...n-1] == 2
        for(int i=0; i<two;){
            if(nums[i]==1)
                i++;
            else if (nums[i]==2)
                swap(nums[i], nums[--two]);
            else{
                assert(nums[i]==0);
                swap(nums[++zero], nums[i++]);
            }
        }

    }

};
//class Solution {
//public:
//    int sortColors(vector<int>& nums){
//        int count[3] = {0};
//        for(int i=0; i<nums.size(); i++){
//            assert(nums[i]>=0 && nums[i]<=2);
//            count[nums[i]]++;
//        }
//        int index =0;
//        for (int k=0; k<sizeof(count)/sizeof(int);k++){
//            for(int i=0; i<count[k]; i++)
//                nums[index++]=k;
//        }
//        return 0;
//    }
//
//};
int main() {
    int arr[] = {0,1,0,2,0};
    vector<int> vec(arr, arr + sizeof(arr)/sizeof(int));
    cout<<Solution().sortColors(vec)<<endl;
    for (int i=0; i<vec.size(); i++)
        cout<<vec[i]<<" ";
    cout<<endl;
    return 0;
}