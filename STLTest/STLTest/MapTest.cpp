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
    map<int, Test*> m;
    Test *t1 = new Test("t1", 1);
    Test *t2 = new Test("t2", 2);
    Test *t3 = new Test("t3", 3);
    Test *t4 = new Test("t4", 4);
    
    m.insert(make_pair(1, t1));
    m.insert(make_pair(4, t4));
    m.insert(make_pair(3, t3));
    
    m[2] = t2;

    map<int, Test*>::iterator it = m.begin();
    for(;it != m.end(); ++ it)
    {
        Log("map key :%d", it->first);
        it->second->description();
    }
    
    map<int, Test*>::iterator pos = m.find(5);
    if(pos != m.end())
    {
        pos->second->description();
    }
    
    typedef pair<int, Test *> PAIR;
    vector<PAIR> v(m.begin(), m.end());
//    sort(v.begin(), v.end(), [](PAIR p1, PAIR p2){return p1.second->_count > p2.second->_count;});
    sort(v.begin(), v.end(), TestCmp());
    vector<PAIR>::iterator it1 = v.begin();
    for(; it1 != v.end(); ++ it1)
    {
        Log("map key :%d", it1->first);
        it1->second->description();
    }
}