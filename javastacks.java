package dsa;

import java.util.Stack;

public class javastacks {
    public static void main(String[] args) {
        Stack<Integer>  a=new Stack();
        a.push(23);
        a.push(35);
        a.push(44);
        a.remove(2);
        System.out.println(a);
        a.search(2);
        System.out.println(a);
        System.out.println(a.get(1));

    }
}
