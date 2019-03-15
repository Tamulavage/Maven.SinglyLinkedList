package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testGetSize() {
        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        Integer expected = 0;

        // when
        Integer actual = sll.size();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSizeAfterAdd1() {
        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        Integer expected = 1;
        SinglyLinkedList.NodeSingleLinked node = new SinglyLinkedList.NodeSingleLinked(1, null);

        // when
        sll.add(node);
        Integer actual = sll.size();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSizeAfterAdd2() {
        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        Integer expected = 2;
        SinglyLinkedList.NodeSingleLinked node = new SinglyLinkedList.NodeSingleLinked(1, null);

        // when
        sll.add(node);
        sll.add(new SinglyLinkedList.NodeSingleLinked(2, null));
        Integer actual = sll.size();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsSingle() {

        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked node = new SinglyLinkedList.NodeSingleLinked(1, null);

        // when
        sll.add(node);
        Boolean actual = sll.contains(node);

        // then
        Assert.assertTrue(actual);


    }

    @Test
    public void testContainsaNodeAt2ndSpot() {

        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked node = new SinglyLinkedList.NodeSingleLinked(1, null);
        SinglyLinkedList.NodeSingleLinked node2 = new SinglyLinkedList.NodeSingleLinked(2, null);

        // when
        sll.add(node);
        sll.add(node2);
        Boolean actual = sll.contains(node2);

        // then
        Assert.assertTrue(actual);

    }

    @Test
    public void testGetAt0Index() {

        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked expected = new SinglyLinkedList.NodeSingleLinked(1, null);

        // when
        sll.add(expected);
        SinglyLinkedList.NodeSingleLinked actual = sll.get(0);

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetAt1Index() {

        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked expected = new SinglyLinkedList.NodeSingleLinked(1, null);

        // when
        sll.add(new SinglyLinkedList.NodeSingleLinked(23, null));
        sll.add(expected);
        SinglyLinkedList.NodeSingleLinked actual = sll.get(1);

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindAt0Index() {

        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked node = new SinglyLinkedList.NodeSingleLinked(1, null);
        Integer expected = 0;

        // when
        sll.add(node);
        Integer actual = sll.find(node);

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindAt1Index() {

        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked node = new SinglyLinkedList.NodeSingleLinked(1, null);
        Integer expected = 1;

        // when
        sll.add(new SinglyLinkedList.NodeSingleLinked(11, null));
        sll.add(node);
        Integer actual = sll.find(node);

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemoveOnlyVerifyWithFind() {

        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked node = new SinglyLinkedList.NodeSingleLinked(1, null);
        Integer expected = 0;

        // when
        sll.add(node);
        sll.remove(node);
        Integer actual = sll.find(node);

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemoveOnlyVerifyWithContain() {

        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked node = new SinglyLinkedList.NodeSingleLinked(1, null);

        // when
        sll.add(node);
        sll.add(new SinglyLinkedList.NodeSingleLinked(55, null));
        sll.remove(node);
        Boolean actual = sll.contains(node);

        // then
        Assert.assertFalse( actual);

    }

    @Test
    public void testCopy() {

        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked node1 = new SinglyLinkedList.NodeSingleLinked(1, null);
        SinglyLinkedList.NodeSingleLinked node2 = new SinglyLinkedList.NodeSingleLinked(2, null);
        Integer expectedSize = 2;

        // when
        sll.add(node1);
        sll.add(node2);
        SinglyLinkedList copied = sll.copy();
        Integer actual = copied.size();

        // then
        Assert.assertEquals(expectedSize, actual);

    }

    @Test
    public void testSort() {

        // given
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.NodeSingleLinked node1 = new SinglyLinkedList.NodeSingleLinked(1, null);
        SinglyLinkedList.NodeSingleLinked node2 = new SinglyLinkedList.NodeSingleLinked(3, null);
        SinglyLinkedList.NodeSingleLinked node3 = new SinglyLinkedList.NodeSingleLinked(2, null);
        Integer expected = 2;

        // when
        sll.add(node1);
        sll.add(node2);
        sll.add(node3);
        sll.sort();
        Integer actual = sll.find(node2);


        // then
        Assert.assertEquals(expected, actual);

    }

}
