#include <iostream>
#include <algorithm>
#include "SortTestHelper.h"
#include "SelectionSort.h"

using namespace std;

template<typename T>
void insertionSort(T arr[], int n) {
    for (int i = 1; i < n; i++) {
        T e = arr[i];
        int j;
        for (j = i; j > 0 && arr[j-1]> e; j--) {
                arr[j]= arr[j-1];
        }
        arr[j]=e;
    }
}
//
//void insertionSort(T arr[], int n) {
//    for (int i = 1; i < n; i++) {
//        for (int j = i; j > 0; j--) {
//            if (arr[j] < arr[j - 1])
//                swap(arr[j], arr[j - 1]);
//            else
//                break;
//        }
//    }
//}

int main() {
    int n = 20000;
    int *arr = SortTestHelper::generateRandomArray(n, 0, n);
    int *arr2 = SortTestHelper::copyIntArray(arr, n);
    SortTestHelper::testSort("Insertion Sort", insertionSort, arr, n);
    SortTestHelper::testSort("Selection Sort", selectionSort, arr2, n);


    delete[] arr;
    delete[] arr2;
    std::cout << "Hello, World!" << std::endl;
    return 0;
}