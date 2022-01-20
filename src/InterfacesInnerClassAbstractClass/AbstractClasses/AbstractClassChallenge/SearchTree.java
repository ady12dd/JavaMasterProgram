package InterfacesInnerClassAbstractClass.AbstractClasses.AbstractClassChallenge;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            //the tree is empty so our item becomes the end of the tree
            this.root = item;
            return true;
        }
        //otherwise . start comparing from the head of the tree
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                //newItem is grater
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //there is no node to the righ, so add at this point
                    currentItem.setNext(item);
                    return true;
                }
            } else if (comparison > 0) {
                //new item is lower
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(item);
                    return true;
                }
            } else {
                System.out.println("The item is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean deleteItem(ListItem item) {
        if(item!=null){
            System.out.println("Deleting item "+item.getValue());
        }
        ListItem currentItem=this.root;
        ListItem parentItem=currentItem;
        while (currentItem!=null){
            int comparison=currentItem.compareTo(item);
            if(comparison<0){
                parentItem=currentItem;
                currentItem=currentItem.next();
            }else if(comparison>0){
                parentItem=currentItem;
                currentItem=currentItem.previous();
            }else{
                //equal so we find the item that need to be deleted
                //performRemoval(currentItem,parentItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        //recursive method
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
