package com.nat.ds.grpahs;

import java.util.Objects;

public class Vertex <T>{
    public T name;
    public boolean visited=false;

    public Vertex(T name, boolean visited){
        this.name=name;
        this.visited=visited;
    }

    public Vertex(T name){
        this.name=name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex<?> vertex = (Vertex<?>) o;
        return name.equals(vertex.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public boolean isVisited(){
        return  visited;
    }

    public boolean isNotVisited(){
        return  !visited;
    }
}
