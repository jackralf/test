//
//  Test.cpp
//  STLTest
//
//  Created by machenfei on 16/6/18.
//  Copyright © 2016年 Jack. All rights reserved.
//

#include "Test.h"

Test::Test()
{

}

Test::Test(string name, int count)
:_name(name)
,_count(count)
{
//    Log("Test::Test: name %s, count %d", _name.c_str(), _count);
}

Test::~Test()
{
//    Log("Test::~Test: name %s, count %d", _name.c_str(), _count);
}

bool Test::operator==(const Test &t) const
{
    return (this->_name == t._name && this->_count == t._count);
}

Test Test::operator+(const Test &t) const
{
    Test ret;
    
    ret._name = _name + t._name;
    ret._count = _count + t._count;
    
    return ret;
}

bool Test::operator<(const Test &t) const
{
    return _count > t._count;
}

bool TestCmp::operator()(const Test &t1, const Test &t2) const
{
    return t1._count > t2._count;
}