package com.zipcodewilmington.singlylinkedlist;


/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> testingSLL = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked addTest1 = new SinglyLinkedList.NodeSingleLinked(1, null);
        testingSLL.add(addTest1);
    }

}
