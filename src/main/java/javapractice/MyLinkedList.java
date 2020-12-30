package javapractice;

public class MyLinkedList  {
    private INode head;
    private INode tail;
    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }
    public void add(INode newNode) {
        if(this.head==null){
            this.head=newNode;
        }
        if(this.tail==null){
            this.tail=newNode;
        }else{
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode newNode){
        if(this.head==null){
            this.head=newNode;
        }
        if(this.tail==null){
            this.tail=newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }
    public void insert(INode myNode,INode newNode){
        INode tempNode=myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public INode pop(){
        INode tempNode=this.head;
        this.head=head.getNext();
        return tempNode;
    }
    public INode popLast(){
        INode tempNode=head;
        while (!tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode=tempNode.getNext();
        return tempNode;
    }
    public void printNodes(){
        StringBuffer myNodes=new StringBuffer("My Nodes: ");
        INode tempNode=head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)){
                myNodes.append("->");
                tempNode=tempNode.getNext();
            }
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public INode getHead() {
        return head;
    }

    public void setHead(INode head) {
        this.head = head;
    }

    public INode getTail() {
        return tail;
    }

    public void setTail(INode tail) {
        this.tail = tail;
    }
}
