package com.zipcodewilmington.singlylinkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<E extends Comparable<E>> {

    private Integer size = 0;
    private NodeSingleLinked node = null;


    public void add(NodeSingleLinked nodeToInsert) {
        NodeSingleLinked last = this.node;

        if (last == null) {
            this.node = nodeToInsert;
        } else {
            while (!(last.next == null)) {
                last = last.next;
            }
            last.next = nodeToInsert;
        }

        this.size++;

    }

    public void remove(NodeSingleLinked nodeToRemove) {
        NodeSingleLinked last = null;
        NodeSingleLinked current = this.node;

        if (contains(node)) {
            // at least 1 exists


            if (current.item.equals(nodeToRemove.item) && size == 1) {
                this.node = null;
                current = null;
            } else if (current.item.equals(nodeToRemove.item) && size > 1) {
                this.node = this.node.next;
                current = null;
            }

            while (current != null) {
                if (current.item.equals(nodeToRemove.item)) {
                    last.next = current.next;
                }
                last = current;
                current = current.next;
            }

            this.size--;

        }

    }

    public Boolean contains(NodeSingleLinked node) {
        Boolean retVal = false;

        NodeSingleLinked current = this.node;

        while (current != null) {
            if (current.item.equals(node.item)) {
                retVal = true;
            }
            current = current.next;
        }

        return retVal;
    }

    public Integer find(NodeSingleLinked node) {
        Integer retVal = 0;

        NodeSingleLinked current = this.node;

        while (current != null) {
            if (!current.item.equals(node.item)) {
                retVal++;
                current = current.next;
            } else {
                current = null;
            }
        }

        return retVal;

    }

    public Integer size() {
        return this.size;
    }


    public NodeSingleLinked get(Integer index) {
        NodeSingleLinked retVal = null;
        Integer indexCounter = 0;

        NodeSingleLinked current = this.node;

        while (current != null) {
            if (indexCounter.equals(index)) {
                retVal = current;
            }
            current = current.next;
            indexCounter++;
        }

        return retVal;
    }

    // TODO
    public SinglyLinkedList copy() {

        NodeSingleLinked current = this.node;

        if (current == null) {
            return null;
        }

        SinglyLinkedList retVal = new SinglyLinkedList();


        NodeSingleLinked tempNode = new NodeSingleLinked(current.item, null);
        retVal.add(tempNode);

        while (current.next != null) {
            // if addinal, add
            current = current.next;
            retVal.add(current);

        }

        return retVal;
    }

    //  TODO

    public void sort() {

        NodeSingleLinked current = this.node;
        NodeSingleLinked prev = null;
        NodeSingleLinked next = null;

        if (current != null) {
            while (current.next != null) {
                if (current.item.compareTo(current.next.item) > 0) {
                     next = current.next;
                    if (prev != null) {
                        prev.next = next;
                    }
                    current.next = next.next;
                    next.next = current;
                }
                prev = current;
                if(current.next!=null){
                current = current.next;}
                else {
                    break;
                }

            }
        }

    }


    // copied and manipulated from linkedList.java for training purpose ONLY
    public static class NodeSingleLinked<E extends Comparable<E>> {
        E item;
        NodeSingleLinked<E> next = null;

        NodeSingleLinked(E element, NodeSingleLinked<E> next) {
            this.item = element;
            this.next = next;
        }


    }


}
