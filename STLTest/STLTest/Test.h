//
//  Test.h
//  STLTest
//
//  Created by machenfei on 16/6/18.
//  Copyright © 2016年 Jack. All rights reserved.
//

#ifndef __STLTest__Test__
#define __STLTest__Test__

#include "Common.h"

class Test 
{
public:
    Test();
	~Test();
    
    Test(string name, int count);
    void description() const {Log("Test name:%s, count:%d", _name.c_str(), _count);}
    
    bool operator==(const Test &t) const;
    Test operator+(const Test &t) const;
    bool operator<(const Test &t) const;

    string _name;
    int _count;
};

class TestCmp
{
public:
    bool operator()(const Test& t1, const Test& t2) const;
    bool operator()(const pair<int, Test *>& t1, const pair<int, Test *>& t2) const;
};


#endif /* defined(__STLTest__Test__) */
