package sw01.ex3.stack;

public class Element {
    private final int value;
    private Element next;

    public Element(int value) {
        this.value = value;
    }

    public int getValue() {
            return value;
    }

    void setNext(Element next) {
        this.next = next;
    }

    Element getNext() {
        return this.next;
    }
}
