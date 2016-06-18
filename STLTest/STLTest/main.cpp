//
//  main.cpp
//  STLTest
//
//  Created by machenfei on 16/6/18.
//  Copyright © 2016年 Jack. All rights reserved.
//

#include "VectorTest.h"

int main(int argc, const char * argv[]) {
    
    VectorTest *t = new VectorTest();
    t->test();
    
    delete t;
    
    return 0;
}
