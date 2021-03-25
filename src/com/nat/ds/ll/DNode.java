package com.nat.ds.ll;

import java.util.Objects;

public class DNode {

    public int key;
    public int val;
    public DNode next, prev;

    public DNode(){}
    public DNode(int key,int val){
        this.val=val;
        this.key=key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DNode dNode = (DNode) o;
        return key == dNode.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
