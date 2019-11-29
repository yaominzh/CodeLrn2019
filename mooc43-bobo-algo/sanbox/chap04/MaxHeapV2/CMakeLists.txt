cmake_minimum_required(VERSION 3.13)
project(MaxHeapV2)

set(CMAKE_CXX_STANDARD 14)

add_executable(MaxHeapV2 main.cpp Heap.h InsertionSort.h MergeSort.h QuickSort.h QuickSort2Ways.h QuickSort3Ways.h)