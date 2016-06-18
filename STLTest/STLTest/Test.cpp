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
    Log("Test::Test: name %s, count %d", _name.c_str(), _count);
}

Test::~Test()
{
    Log("Test::~Test: name %s, count %d", _name.c_str(), _count);
}

