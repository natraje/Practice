package com.nat.ds.grpahs;

public class GraphTest {

    public static void main(String[] a){
        Graph<Character> gr=new Graph<>(5);
        gr.addVertex('A');
        gr.addVertex('B');
        gr.addVertex('C');
        gr.addVertex('D');
        gr.addVertex('E');
        gr.addEdge(0,1);
        gr.addEdge(1,2);
        gr.addEdge(1,3);
        gr.addEdge(1,4);
        gr.addEdge(2,4);
        gr.addEdge(0,4);
        gr.addEdge(0,3);
        gr.dfs();
    }
}
