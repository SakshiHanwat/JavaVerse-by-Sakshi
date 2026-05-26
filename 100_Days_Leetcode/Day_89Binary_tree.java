class Solution {
public:
    vector<int> rightSideView(TreeNode* root) {

         if(root==NULL)return {};
        map<int,int> mpp;
        queue<pair<int, TreeNode*>> q;
        q.push({0,root});

        while(!q.empty())
        {
            auto it=q.front();
            q.pop();
            TreeNode* node=it.second;
            int level= it.first;

            if(mpp.find(level)==mpp.end()) mpp[level]=node->val;

            if(node->right) q.push({level+1, node->right});
            if(node->left) q.push({level+1, node->left});
        }

        vector<int> ans;
        for(auto i: mpp)
        {
            ans.push_back(i.second);
        }

        return ans;
    }
};