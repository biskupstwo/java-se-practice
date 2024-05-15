package exercises.AbstractClass;

public class SearchTree implements NodeList{

    ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null){
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;

        while (true){
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
            }
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }


    @Override
    public void traverse(ListItem root) {
        if (root == null) return;
        Object leftValue = root.leftLink != null ? root.leftLink.value : "null";
        Object rightValue = root.rightLink != null ? root.rightLink.value : "null";
        String output = "lv: " + leftValue + ", cv: " + root.value + ", rv: " + rightValue;
        System.out.println(output);
        if (root.rightLink != null){
            traverse(root.rightLink);
        }
    }
}