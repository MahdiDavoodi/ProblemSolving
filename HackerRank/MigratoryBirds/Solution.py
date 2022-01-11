#!/bin/python3

import math
import os
import random
import re
import sys

def migratoryBirds(arr):
    myset = set(arr)
    mymax = 0
    number = 0
    for i in myset:
        a = arr.count(i)
        if (mymax < a):
            mymax = a
            number = i
    return number
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    result = migratoryBirds(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
