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
{

}

VectorTest::~VectorTest()
{

}

void VectorTest::test()
{
    vector<Test *> v;
    
    Test *t1 = new Test("t1", 1);
    Test *t2 = new Test("t2", 2);
    Test *t3 = new Test("t3", 3);
    
    
    v.push_back(t1);
    v.push_back(t2);
    v.push_back(t3);
    
    
    for(auto iter : v)
    {
        iter->description();
    }
}

