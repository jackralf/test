//
//  MapTest.cpp
//  STLTest
//
//  Created by machenfei on 16/6/19.
//  Copyright © 2016年 Jack. All rights reserved.
//

#include "MapTest.h"


MapTest::MapTest()
{

}

MapTest::~MapTest()
{

}

void MapTest::test()
{
    map<Test, Test> m;
    Test *t1 = new Test("t1", 1);
    Test *t2 = new Test("t2", 2);
    Test *t3 = new Test("t3", 3);
    
    m.insert(make_pair(*t1, *t1));
    m.insert(make_pair(*t2, *t2));
    pair< map<Test, Test>::iterator, bool> pos = m.insert(make_pair(*t3, *t3));
    
    m[*t3] = *t3;
    
    
    if(pos.second)
    {
        pos.first->second.description();
    }
    else
    {
        pos.first->second.description();
    }
    
    
    for(auto it : m)
    {
        it.second.description();
    }
    
    
}