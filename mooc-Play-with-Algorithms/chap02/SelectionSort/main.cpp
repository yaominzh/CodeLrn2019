#include <iostream>
#include <algorithm>
#include "Student.h"
#include "SortTestHelper.h"

using namespace std;

template <typename T>
void selectionSort(T arr[], int n) {
    for (int i = 0; i < n; i++) {
        //寻找[i,n)区间里的最小值
        int minIndex = i;
        for (int j = i + 1; j < n; j++)
            if (arr[j] < arr[minIndex])
                minIndex = j;
        swap(arr[i], arr[minIndex]);
    }
}

int main() {
    int n = 10000;
    int *arr=SortTestHelper::generateRandomArray(n,0,n);
//    selectionSort(arr,n);
//    SortTestHelper::printArray(arr,n);
    SortTestHelper::testSort("selection Sort", selectionSort,arr,n);
    delete[] arr;


    int a[10] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    selectionSort(a, 10);
    for (int i = 0; i < 10; i++)
        cout << a[i] << " ";
    std::cout << std::endl;

    float b[10] = {10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1};
    selectionSort(a, 10);
    for (int i = 0; i < 10; i++)
        cout << a[i] << " ";
    std::cout << std::endl;

    Student d[4] = {{"D",90},{"C",100},{"B",95},{"A",95}};
    selectionSort(d, 4);
    for (int i = 0; i < 4; i++)
        cout << d[i] << " ";
    std::cout << std::endl;
    std::cout << "Hello, World!" << std::endl;
    return 0;
}