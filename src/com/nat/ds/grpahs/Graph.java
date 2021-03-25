package com.nat.ds.grpahs;

import com.nat.util.PrintHelper;

import java.util.Stack;

public class Graph<T> {
    private Vertex<T> vertestlist[];
    private int adjMatrix[][];
    private int size;
    private int currsize;
    private Stack<Integer> stacks =new Stack<Integer>();

    public Graph(int size){
        this.vertestlist=new Vertex[size];
        this.size=size;
        this.adjMatrix=new int[size][size];
        currsize=0;
    }

    public void addVertex(T node){
        this.vertestlist[currsize++]= new Vertex<>(node);
    }

    public int getAdjUnvisited(int v){
        for(int j=0;j<currsize;j++){
            if(adjMatrix[v][j]==1 && !vertestlist[j].isVisited()){
                return j;
            }
        }
        return -1;
    }
    public void addEdge(int start,int end){
        adjMatrix[start][end]=1;
        adjMatrix[end][start]=1;
    }
    public void displayVertex(int v){
        System.out.print(vertestlist[v].name);
    }

    public void dfs(){
        Integer i=0;
        vertestlist[i].visited=true;
        displayVertex(i);
        stacks.push(i);
        while(!stacks.isEmpty()){
            int v=getAdjUnvisited(stacks.peek());
            if(v==-1)
                stacks.pop();
            else{
                vertestlist[v].visited=true;
                displayVertex(v);
                stacks.push(v);
            }
        }
    }
}
