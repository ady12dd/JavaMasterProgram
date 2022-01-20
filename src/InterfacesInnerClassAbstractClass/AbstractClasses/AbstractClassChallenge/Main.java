package InterfacesInnerClassAbstractClass.AbstractClasses.AbstractClassChallenge;

public class Main {
    public static void main(String[] args) {
//        MyLinkList tree=new MyLinkList(null);
//        String stringData="Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//        String[]date=stringData.split(" ");
//        for(String s:date){
//            Node node=new Node(s);
//            tree.addItem(node);
//        }
//        tree.traverse(tree.getRoot());
//
//        MyLinkList listOfNumbers=new MyLinkList(null);
//        String stringNumbers="1 2 3 4 5 6 7 8 9";
//        String[]numbers= stringNumbers.split(" ");
//        for(String a:numbers){
//            listOfNumbers.addItem(new Node(a));
//        }
//        listOfNumbers.traverse(listOfNumbers.getRoot());
//        listOfNumbers.deleteItem(new Node("3"));
//        listOfNumbers.traverse(listOfNumbers.getRoot());

        SearchTree tree= new SearchTree(null);
        String stringData="Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[]date=stringData.split(" ");
        for(String s:date){
            Node node=new Node(s);
            tree.addItem(node);
        }
        tree.traverse(tree.getRoot());



    }
}
