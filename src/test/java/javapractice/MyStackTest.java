package javapractice;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void givenWhen3NumbersAddedInStackShouldGiveLastElementAtTheTop(){
        MyNode<Integer> myFirstNode=new MyNode<>(70);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode myNode=myStack.peek();
        Assert.assertEquals(myThirdNode,myNode);
    }

    @Test
    public void GivenThreeNumbersInStackShouldPopTheElementsTillEmpty() {
        MyNode<Integer> myFirstNode=new MyNode<>(70);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        Boolean result=myStack.isEmpty();
        Assert.assertTrue(result);
    }
}
