//
//  main.cpp
//  Longest Substring Without Repeating Characters
//
//  Created by machenfei on 16/8/4.
//  Copyright © 2016年 Jack. All rights reserved.
//

#include <iostream>
#include <string>
using namespace std;

int lengthOfLongestSubstring(string s);

int main(int argc, const char * argv[]) {
    // insert code here...
    
    int len = lengthOfLongestSubstring("pwwkew");
    cout << len << endl;
    
    return 0;
}

int lengthOfLongestSubstring(string s) {
    int len = 0;
    
    string str = "";
    int startIndex = 0;
    int endIndex = -1;
    for(int i = 0; i < s.length(); i ++)
    {
        size_t pos = str.find(s[i]);
        if(pos != string::npos)
        {
            if(endIndex - startIndex + 1 > len)
            {
                len = endIndex - startIndex + 1;
            }
            startIndex = startIndex + (int)pos + 1;
            ++endIndex;
            str = s.substr(startIndex, endIndex - startIndex + 1);
        }
        else
        {
            str += s[i];
            ++endIndex;
        }
    }
    
    if(str.length() > len) len = (int)str.length();
    
    return len;
}