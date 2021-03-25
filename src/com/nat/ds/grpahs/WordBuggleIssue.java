package com.nat.ds.grpahs;

import java.util.Objects;

public class WordBuggleIssue {


    private class Vertex{
        public char c;
        public boolean visited=false;

        public Vertex(char c){
            this.c=c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vertex vertex = (Vertex) o;
            return c == vertex.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(c);
        }

        boolean isNotVisited(){
            return !visited;
        }
    }

    private Vertex[] vertexs;
    private int size;
    private int current;
   // private Vertex[] vertexs;

}
