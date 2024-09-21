package datastructures.stack.usingLinkedList;

public class Stack {
    private Node top;
    private int length;

    public boolean isEmpty() {
        return top == null;
    }

    public void getTop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top: " + top.getValue());
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.println("| " + temp.getValue() + " |");
            System.out.println("------");
            temp = temp.getBottomNode();
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (!isEmpty()) {
            newNode.setBottomNode(top);
        }
        top = newNode;
        length++;
    }

}
