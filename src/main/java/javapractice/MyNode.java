package javapractice;

public class MyNode<K> implements INode<K> {
    private K key;
    private INode next;

    public MyNode(K key) {
        this.key =key;
        this.next=null;
    }
    @Override
    public K getKey() {
        return key;
    }
    @Override
    public void setKey(K key) {
        this.key=key;
    }
    @Override
    public INode getNext() {
        return next;
    }
    @Override
    public void setNext(INode next) {
        this.next=next;
    }

    @Override
    public String toString() {
        StringBuilder myNodeString=new StringBuilder();
        myNodeString.append("MyNode{ "+ "key= ").append(key).append("}");
        if(getNext()!=null)
            myNodeString.append("->").append(getNext());
        return myNodeString.toString();
    }
}
