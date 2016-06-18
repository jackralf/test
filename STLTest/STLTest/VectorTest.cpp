//
//  VectorTest.cpp
//  STLTest
//
//  Created by machenfei on 16/6/18.
//  Copyright © 2016年 Jack. All rights reserved.
//

#include "VectorTest.h"
#include "Test.h"

VectorTest::VectorTest()
:t1("t1", 1)
,t2("t2", 2)
,t3("t3", 3)
{

}

VectorTest::~VectorTest()
{
    Log("VectorTest::~VectorTest");
}

void VectorTest::test()
{
    Log("size of Test: %d", sizeof(Test));
    vector<Test> v;
    v.reserve(10);
   
    v.push_back(t1);
    v.push_back(t2);
    v.push_back(t3);
    
    Log("vector size:%d", v.size());
    v.erase(v.begin());
    auto begin = v.begin();
    begin->description();
    Log("vector size:%d", v.size());
    
    for(auto iter : v)
    {
        Log("memory addr %p", &iter);
    }
    
    for(int i = 0; i < v.size(); i ++)
    {
        Log("vectory memory addr %p", &v.at(i));
    }
}

