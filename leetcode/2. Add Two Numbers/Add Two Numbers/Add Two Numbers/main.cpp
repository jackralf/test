//
//  main.cpp
//  Add Two Numbers
//
//  Created by machenfei on 16/8/2.
//  Copyright © 2016年 Jack. All rights reserved.
//

#include <iostream>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

ListNode* addTwoNumbers(ListNode* l1, ListNode* l2);

int main(int argc, const char * argv[]) {
    
    ListNode *l1 = new ListNode(5);
//    l1->next = new ListNode(4);
//    l1->next->next = new ListNode(3);
    
    ListNode *l2 = new ListNode(5);
//    l2->next = new ListNode(6);
//    l2->next->next = new ListNode(4);
    
    auto ret = addTwoNumbers(l1, l2);
    do {
        cout << ret->val << endl;
        ret = ret->next;
    } while (ret);
    
    return 0;
}


ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
    ListNode *node = nullptr;
    ListNode *iter = nullptr;
    
    int sum = 0;
    int nextAdd = 0;
    while (l1 && l2) {
        sum = l1->val + l2->val + nextAdd;
        nextAdd = sum / 10;
        sum = sum % 10;
        if(node == nullptr)
        {
            node = new ListNode(sum);
            iter = node;
        }
        else
        {
            iter->next = new ListNode(sum);
            iter = iter->next;
        }
        
        l1 = l1->next;
        l2 = l2->next;
    }
    
    ListNode *tmp = nullptr;
    if(l1 || l2)
    {
        tmp = l1 ? l1 : l2;
    }
    while(tmp)
    {
        sum = tmp->val + nextAdd;
        nextAdd = sum / 10;
        sum = sum % 10;
        
        if(node == nullptr)
        {
            node = new ListNode(sum);
            iter = node;
        }
        else
        {
            iter->next = new ListNode(sum);
            iter = iter->next;
        }
        
        tmp = tmp->next;
    }
    
    if(nextAdd)
    {
        iter->next = new ListNode(nextAdd);
    }
    
    return node;
}