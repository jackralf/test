//
//  Common.cpp
//  STLTest
//
//  Created by machenfei on 16/6/18.
//  Copyright © 2016年 Jack. All rights reserved.
//

#include "Common.h"


void _log(const char *format, va_list args)
{
    char buf[MAX_LOG_LENGTH];
    
    vsnprintf(buf, MAX_LOG_LENGTH-3, format, args);
    strcat(buf, "\n");
    
    fprintf(stdout, "%s", buf);
    fflush(stdout);
}

void Log(const char * format, ...)
{
    va_list args;
    va_start(args, format);
    _log(format, args);
    va_end(args);
}