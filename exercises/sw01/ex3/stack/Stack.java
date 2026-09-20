package sw01.ex3.stack;

public interface Stack {
    void push(Element e);
    Element top();
    boolean pop();
    void print();
    boolean isEmpty();
    int size();
}
