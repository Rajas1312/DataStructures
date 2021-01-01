package javapractice;

public class MyLinkedList<K>  {
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
        INode tempNode=head;
        this.head=head.getNext();
        return tempNode;
    }
    public INode popLast(){
        INode tempNode=this.head;
        while (!tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode=tempNode.getNext();
        this.head=head.getNext();
        return tempNode;
    }
    public INode search(K key){
        INode tempNode=head;
        while (tempNode!=null &&tempNode.getNext()!=null){
            if(tempNode.getKey().equals(key)){
                //System.out.println(key);
                return tempNode;
            }
                tempNode=tempNode.getNext();
        }
        return null;
    }
    public void printNodes(){
        System.out.println("My nodes: " +head);
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

    @Override
    public String toString() {
        return "MyLinkedListNodes{" +head+ " }";
    }
}
