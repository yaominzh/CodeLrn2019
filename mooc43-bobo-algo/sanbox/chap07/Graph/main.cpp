#include <iostream>
#include <vector>
#include "DenseGraph.h"
#include "SparseGraph.h"
#include "ReadGraph.h"

int main() {
    string filename = "../testG1.txt";
    SparseGraph g1(13, false);
    ReadGraph<SparseGraph> readGraph(g1, filename);
    g1.show();
}