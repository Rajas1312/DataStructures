package javapractice;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3numbersShouldReturnQueueFirstInFirstOut() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        boolean result= myQueue.getHead().equals(myFirstNode)&&
                myQueue.getHead().getNext().equals(mySecondNode)&&
                myQueue.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3numbersShouldReturnDequeue() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.dequeue();
        boolean result=
                myQueue.getHead().equals(mySecondNode)&&
                        myQueue.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
