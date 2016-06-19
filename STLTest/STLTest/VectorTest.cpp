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

void echo(Test t)
{
    t.description();
}

void VectorTest::test()
{
    Log("size of Test: %d", sizeof(Test));
    vector<Test> v;
    v.reserve(10);
   
    v.push_back(t1);
    v.push_back(t2);
    v.push_back(t3);
    Test t4("t3", 3);
    
    vector<Test>::iterator pos = find(v.begin(), v.end(), t4);
    if(pos != v.end())
    {
        pos->description();
    }
    
    Test t5 = t1 + t2;
    t5.description();
    v.insert(v.begin(), t5);
    
    vector<Test>::const_reverse_iterator iter = v.crbegin();
    for(;iter != v.crend(); iter ++)
    {
        iter->description();
    }
}

