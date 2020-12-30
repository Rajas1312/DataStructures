package javapractice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyNodeTest {
    @Test
    public void givenWhenNumbersAreLinkedShouldReturnLinkedList(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result=myFirstNode.getNext().equals(mySecondNode) &&
                        mySecondNode.equals(myThirdNode);
        Assert.assertTrue(result);
    }

}