package exercises.AbstractClass;

public class MyLinkedList implements NodeList{

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null){
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;

        do {
            if ((currentItem.compareTo(item)) < 0) {
                if (currentItem.next() == null) {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                } else currentItem = currentItem.next();
            } else if (currentItem.compareTo(item) > 0) {
                if (currentItem.previous() == null) {
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                } else {
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                }
                return true;
            } else return false;
        } while (currentItem != null);
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (this.root == null) {
            return false;
        }

        ListItem currentItem = this.root;
        do {
            if (currentItem.compareTo(item) == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                    if (this.root != null) {
                        this.root.setPrevious(null);
                    }
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }
            currentItem = currentItem.next();
        } while (currentItem != null);
        return false;
    }

    @Override
    public void traverse(ListItem root) {
       if (root != null) {
           Object leftItemValue = root.leftLink != null ? root.leftLink.value : null;
           Object rightItemValue = root.rightLink != null ? root.rightLink.value : null;
           Object currItemValue = root.value;
           String output = "lv: " + leftItemValue + ", cv: " + currItemValue + ", rv: " + rightItemValue;
           System.out.println(output);
           if (root.rightLink != null) traverse(root.rightLink);
       }else{
           System.out.println("The list is empty.");
       }
    }
}
