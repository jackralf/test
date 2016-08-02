//
//  main.cpp
//  Two Sum
//
//  Created by machenfei on 16/8/1.
//  Copyright © 2016年 Jack. All rights reserved.
//

#include <iostream>
#include <vector>
using namespace std;

vector<int> twoSum(vector<int>& nums, int target);

int main(int argc, const char * argv[]) {
    // insert code here...
    vector<int> nums = {3,2,4};
    int target = 6;
    
    vector<int> ret = twoSum(nums, target);
    for(auto v : ret)
    {
        cout << v << endl;
    }
    
    return 0;
}

vector<int> twoSum(vector<int>& nums, int target) {
    vector<int> ret;
    vector<int> tmp = nums;
    
    sort(tmp.begin(), tmp.end());
    
    int x = 0, y = 0;
    int vectorSize = (int)tmp.size();
    for(int i = 0, j = vectorSize - 1; i < j;)
    {
        if(tmp[i] + tmp[j] == target)
        {
            x = tmp[i];
            y = tmp[j];
            break;
        }
        else if(tmp[i] + tmp[j] < target)
        {
            ++i;
        }
        else
        {
            --j;
        }
    }
    
    for(int i = 0; i < vectorSize; i ++)
    {
        if(nums[i] == x || nums[i] == y)
        {
            ret.push_back(i);
        }
    }
    
    return ret;
}
