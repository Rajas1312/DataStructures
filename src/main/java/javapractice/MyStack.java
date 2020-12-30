package javapractice;

public class MyStack {

    private final MyLinkedList mylinkedList;

    public MyStack() {
        this.mylinkedList=new MyLinkedList();
    }
    public void push(INode myNode) {
        this.mylinkedList.add(myNode);
    }

    public INode peek() {
        return mylinkedList.getHead();
    }

    public void printStack() {
        mylinkedList.printNodes();
    }
}
