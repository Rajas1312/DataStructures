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

    public INode pop() {
        return mylinkedList.pop();
    }

    public boolean isEmpty() {
        if(this.mylinkedList.getHead()==null){
            return true;
        }
        else{
            return false;
        }
    }
}
