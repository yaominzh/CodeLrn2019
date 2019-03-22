[toc]
# Chap01 算法面试简介
关注基础， 
1. 各种排序算法，基础数据结构和算法的实现
1. 基础数据结构：链表，栈，队列，哈希表，图，Trie, 并查集
1. 基础算法:深度优先、广度优先、二分查找、递归
1. 基本算法思想:递归、分治、回溯搜索、贪心、动态规划
1. 基本设计模式：3类23个
1. Top项目源码解析
## 1.1 
oj
## 1-4 
边界条件 
1. 题目中的条件
2. 暴力算法
3. 优化算法： 遍历常见算法，遍历常见数据结构，空间和时间， 预处理
4. 实际编写： 极端条件， 代码规范， 模块化、复用性
5. 基本问题要白板编程
# Chap02
##  2.2 
时间复杂度benchmark
空间复杂度
## 2.3 各时间复杂度code snippet
```java
//O(1)
void swapTwoInts(int &a, int &b){
    int temp = a;
    a =b;
    b =temp;
}
//O(n) 典型特征是中间有一个for 循环
int sum( int n) {
    int ret = 0;
    for (int i=0; i<=n; i++) ret +=i; 
    return ret;
}

void revers( string &s ) {
    int n = s.size();
    for (int i=0; i<n/2; i++)swap(s[i], s[n-1-i]);
}

//O(n^2)
void selectionSort( int arr[], int n ) {
    for (int i=0; i<n; i++) { 
        int minIndex = i;
        for (int j=i+1; j<n; j++)
            if(arr[j]<arr[minIndex]) minIndex = j;
        swap(arr[i], arr[minIndex]);
    }
}
//O(logn)
int binarySearch(int arr[], int n, int target){
    int l=0, r=n-1;
    while (l<=r){
        int mid = l+(r-l)/2;
        if(arr[mid]==target) return mid;
        if(arr[mid]>target) r=mid -1;
        else l = mid +1; 
    }
    return -1;
}
//O(sqrt(n))
bool isPrime( int n ) {
    for(int x=2; x*x <=n; x++)
        if(n%x == 0)
            return false;
        return true;
}

``` 
## 2-5
递归中的情况
```java
int binarySearch(int arr[], int r, int target){
    if(l>r)return -1;
    int mid = l + (r-l)/2;
    if(arr[mid]==target)
        return mid;
    else if(arr[mid]>target)
        return binarySearch(arr, l, mid-1, target);
    else
        return binarySearch(arr, mid+1,r, target);
    
}

void mergeSort(int arr[], int l, int r){
    if(l>=r) return ; 
    int mid = (l+r)/2;
    mergeSort(arr, l, mid);
    mergeSort(arr, mid+1, r);
    merge(arr, l, mid, r);
}

```
主定理
## 2-6

# Chap03 数组
## 3-1
数组相关问题
1. 排序：选择、插入、归并，快速
2. 查找：二分查找
3. 数据结构：栈、队列、堆

> 如何写出正确的程序
边界处理
## 3-2
## 3-3
## 3-2

# Chap01 

# Chap01 
# Chap01 
# Chap01 
# Chap01 
