package javapractice;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void given3NumbersWhenAddedToListshouldBeAddedToTheTop(){
        MyNode<Integer> myFirstNode=new MyNode<>(70);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printNodes();
        boolean result= myLinkedList.getHead().equals(myThirdNode)&&
                        myLinkedList.getHead().getNext().equals(mySecondNode)&&
                        myLinkedList.getTail().equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedToListshouldBeAddedToTheLast() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printNodes();
        boolean result= myLinkedList.getHead().equals(myFirstNode)&&
                myLinkedList.getHead().getNext().equals(mySecondNode)&&
                myLinkedList.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNumbersWhenAddedBetween2NumbersInLinkedListShouldReturnLinkedList() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printNodes();
        boolean result= myLinkedList.getHead().equals(myFirstNode)&&
                myLinkedList.getHead().getNext().equals(mySecondNode)&&
                myLinkedList.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstElementWhenDeletedShouldReturnLinkedList(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.pop();
        myLinkedList.printNodes();
        boolean result=
                myLinkedList.getHead().equals(mySecondNode)&&
                myLinkedList.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastElementWhenDeletedShouldReturnLinkedList() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.search(30);
        myLinkedList.printNodes();

    }
}
