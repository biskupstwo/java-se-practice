package exercises.AbstractClass;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
        this.leftLink = null;
        this.rightLink = null;
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    void setNext(ListItem item) {
        this.rightLink = item;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    void setPrevious(ListItem item) {
        this.leftLink = item;
    }

    @Override
    public int compareTo(ListItem item) throws UnsupportedOperationException {
        if (this.value instanceof Comparable && item.value instanceof Comparable) {
            return ((Comparable<Object>) this.value).compareTo((item.value));
        }else{
            throw new UnsupportedOperationException("Objects are not comparable.");
        }
    }
}
