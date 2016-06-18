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
    
    Test(string name, int count):_name(name),_count(count){}
    void description(){Log("Test name:%s, count:%d", _name.c_str(), _count);}
private:
    string _name;
    int _count;
};


#endif /* defined(__STLTest__Test__) */
