package com.nat.string;

import com.nat.util.PrintHelper;

import java.util.*;

public class AutoComplete {

    private class Node{
        String prefix;
        Map<Character,Node> child=new TreeMap<>();
        boolean isWord;

        public Node(String prefix){
            this.prefix=prefix;
        }
    }

    private Node trie;

    public AutoComplete(){
        this.trie=new Node("");
    }

    public static void main(String[] s){
        String[] arr={"acd","bef","aba","a","acb","def","acda","acdb"};
        AutoComplete ac=new AutoComplete();
       // Node t=ac.trie;
        ac.insertWords(arr);
        List<String> values=ac.getWords("acd");

        Node t=ac.trie;
        for(String s1:values)
            PrintHelper.print(s1);

    }

    public void insertWords(String[] arr){
        for(String s: arr){
            Node curr=trie;
            int i=0;
            while(i<s.length()){
                if(curr!=null && !curr.child.containsKey(s.charAt(i))){
                    curr.child.put(s.charAt(i),new Node(s.substring(0,i+1)));
                }
                curr=curr.child.get(s.charAt(i));
                i++;
            }
            curr.isWord=true;
        }
    }

    public List<String> getWords(String word){
        List<String> values=new LinkedList<>();
        Node curr=trie;
        for(char c:word.toCharArray()){
            if(curr.child.containsKey(c)){
                curr=curr.child.get(c);
            } else{
                return values;
            }
        }
        filterWords(curr,values);
        return values;
    }

    public void filterWords(Node curr,List<String> values){
        if(curr.isWord) values.add(curr.prefix);
        for(Character c: curr.child.keySet()){
            filterWords(curr.child.get(c),values);
        }

    }

}
