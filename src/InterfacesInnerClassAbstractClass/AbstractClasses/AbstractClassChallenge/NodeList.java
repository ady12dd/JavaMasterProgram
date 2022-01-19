package InterfacesInnerClassAbstractClass.AbstractClasses.AbstractClassChallenge;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean deleteItem(ListItem item);
    void traverse(ListItem root);

}
