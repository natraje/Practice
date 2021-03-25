package com.nat.ooad;
import java.util.*;
public class HashTable<K,V> {

    private class Node<K,V>{
        Node prev, next;
        K key;
        V value;
        public Node(K key, V value){
            this.key=key;
            this.value=value;
        }
    }

    int capacity;
    List<Node<K,V>>  maps;

    public HashTable(int capacity){
        this.capacity=capacity;
        maps=new ArrayList<>(capacity);
    }

    public void put(K key, V value){
        Node node=getNodeForKey(key);

        if(node==null){
            Node n=new Node(key,value);
            int idx=getKeyForIndex(key);
            if(maps.get(idx)!=null){
                n.next=maps.get(idx);
                n.next.prev=n;
            }
            maps.set(idx,n);
        } else{
            node.value=value;
        }
    }

    public V get(K key){
        if(key==null) return null;
        Node<K,V> n=getNodeForKey(key);
        return (n==null)?null: (V) n.value;
    }

    public void remove(K key){
        Node<K,V> n=getNodeForKey(key);
        if(n!=null){
            Node temp=n.prev;
            temp.next=n.next;
            n.next.prev=temp;
        }
    }

    public Node<K,V> getNodeForKey(K key){
        int idx=getKeyForIndex(key);
        Node<K,V> n=maps.get(idx);
        if(n!=null){
            if(n.key==key){
                return n;
            }
            n=n.next;
        }
        return null;
    }
    public int getKeyForIndex(K key){
        return Math.abs(key.hashCode()%this.capacity);
    }
}
