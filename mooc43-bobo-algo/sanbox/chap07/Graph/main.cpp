#include <iostream>
#include <vector>
#include "DenseGraph.h"
#include "DenseGraph.h"
#include "ReadGraph.h"

int main() {
    int N = 20;
    int M = 100;
    srand(time(NULL));
    cout << rand();
    cout << endl;
    DenseGraph g1(N, false);
    for (int i = 0; i < M; i++) {
        int a = rand() % N;
        int b = rand() % N;
        g1.addEdge(a, b);
    }
    for(int v=0;v<N;v++){
        cout<<v<<" : ";
        DenseGraph::adjIterator adj(g1, v);
        for(int w = adj.begin();!adj.end();w=adj.next())
            cout<<w<<" ";
        cout<<endl;
    }
    cout<<endl;

    DenseGraph g2(N, false);
    for (int i = 0; i < M; i++) {
        int a = rand() % N;
        int b = rand() % N;
        g1.addEdge(a, b);
    }
    for(int v=0;v<N;v++){
        cout<<v<<" : ";
        DenseGraph::adjIterator adj(g1, v);
        for(int w = adj.begin();!adj.end();w=adj.next())
            cout<<w<<" ";
        cout<<endl;
    }
    cout<<endl;
    return 0 ;
}