//
// Created by zhangym on 2019-03-21.
// benchmark
//

#include <iostream>
#include <cmath>
#include <cassert>
#include <ctime>
#include "MyUtil.h"

using namespace std;
/*
 * 要点
 * 1. 边界条件维护
 * 2. 历史bug, (l+r)/2 的整形溢出问题
 */
template<typename T>
int binarySearch(T arr[], int n, T target) {
    int l = 0, r = n - 1;    //边界条件，并一直维护这个条件
    while (l <= r) {
        int mid = l + (r - l) / 2;
        if (arr[mid] == target) return arr[mid];
        if (arr[mid] < target)
            l = mid + 1;
        else
            r = mid - 1;
    }
    return -1;


}

int main() {
    int n = 1000000;
    int *data = MyUtil::generateOrderedArray(n);
    clock_t startTime = clock();
    for (int i = 0; i < n; i++)
        assert(i == binarySearch(data, n, i));
    clock_t endTime = clock();

    cout << "binarySearch test complete" << endl;
    cout << "Time cose: " << double(endTime - startTime) / CLOCKS_PER_SEC << " s" << endl;
    return 0;
}
