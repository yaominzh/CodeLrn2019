/// Source : https://leetcode.com/problems/all-possible-full-binary-trees/description/
/// Author : liuyubobobo
/// Time   : 2018-08-26

#include <iostream>
#include <vector>

using namespace std;


/// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};


/// Recursion
/// Time Complexity: O(2^n)
/// Space Complexity: O(2^n)
class Solution {

private:
    TreeNode* root;

public:
    vector<TreeNode*> allPossibleFBT(int N) {

        if(N % 2 == 0)
            return {};

        if(N == 1)
            return {new TreeNode(0)};

        vector<TreeNode*> ret;
        for(int i = 1; i < N; i += 2){
            vector<TreeNode*> left_vec = allPossibleFBT(i);
            vector<TreeNode*> right_vec = allPossibleFBT(N - 1 - i);
            for(TreeNode* left: left_vec)
                for(TreeNode* right: right_vec){
                    TreeNode* root = new TreeNode(0);
                    root->left = left;
                    root->right = right;
                    ret.push_back(root);
                }
        }
        return ret;
    }
};


int main() {

    Solution().allPossibleFBT(7);

    return 0;
}