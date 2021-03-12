package com;
 interface INode<K> {
    K getKey();
    void setKey(K key);

    INode getNext();
    void setNext(INode next);
}

public class MyNode<K> {
    private MyNode next;
    private K key;
    private INode tail;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Node :");
        INode head = null;
        INode tempNode =  head;
        while(tempNode.getNext() != null)
        {
            myNodes.append(tempNode.getNext());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getNext());
        System.out.println(myNodes);
    }
}



