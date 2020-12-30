package javapractice;

public class MyQueue {

    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList=new MyLinkedList();
    }

    public void enqueue(MyNode myNode) {
        this.myLinkedList.append(myNode);
    }

    public void printQueue() {
        this.myLinkedList.printNodes();
    }

    public INode getHead() {
        return this.myLinkedList.getHead();
    }

    public INode getTail() {
        return this.myLinkedList.getTail();
    }
}
