package sw01.ex3.stack;

public class SimpleStack implements Stack {
    private Element currentElement;

    @Override
    public void push(Element e) {
        if (currentElement == null) {
            currentElement = e;
        } else {
            e.setNext(currentElement);
            currentElement = e;
        }
    }

    @Override
    public Element top() {
        return currentElement;
    }

    @Override
    public boolean pop() {
        if (currentElement == null) {
            return false;
        }
        currentElement = currentElement.getNext();
        return true;
    }

    @Override
    public void print() {
        if (currentElement == null) {
            System.out.println("print - Stack is empty");
            return;
        }
        System.out.print("print - Stack contains: ");
        var element = currentElement;
        while (element !=  null) {
            System.out.print(element.getValue() + ", ");
            element = element.getNext();
        }
        System.out.print("top Element = " + currentElement.getValue() + "\n");
    }

    @Override
    public boolean isEmpty() {
        return currentElement == null;
    }

    @Override
    public int size() {
        int size = 0;
        var element = currentElement;
        while (element !=  null) {
            element = element.getNext();
            size++;
        }
        return size;
    }
}
