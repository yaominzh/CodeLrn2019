#include <iostream>
#include <vector>

using namespace std;
class Solution {
public:
    void moveZeroes(vector<int>& nums){
        int j = 0;
        for(int i=0;i<nums.size();i++)
            if(nums[i]>0)
                if(j!=i) swap(nums[i], nums[j++]);
                else j++;


    }
};
//空间复杂度O(n)
//using namespace std;
//class Solution {
//public:
//    void moveZeroes(vector<int>& nums){
//        vector<int> nonZeroElements;
//        for(int i=0; i<nums.size(); i++)
//            if(nums[i]>0)
//                nonZeroElements.push_back(nums[i]);
//        for(int i = 0; i<nonZeroElements.size();i++)
//            nums[i]=nonZeroElements[i];
//        for(int i=nonZeroElements.size(); i<nums.size(); i++)
//            nums[i]=0;
//
//    }
//};
int main() {
    int arr[] = {0,1,0,3,12};
    vector<int> vec(arr, arr + sizeof(arr)/sizeof(int));
    Solution().moveZeroes(vec);
    for (int i=0; i<vec.size(); i++)
        cout<<vec[i]<<" ";
    cout<<endl;
    return 0;
}