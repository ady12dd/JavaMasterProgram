package InterfacesInnerClassAbstractClass.AbstractClasses.AbstractClassChallenge;

public class MyLinkList implements NodeList {
    private ListItem root= null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        if(root!=null){
            return this.root;
        }else{
            return null;
        }
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root!=null){
           ListItem currentItem=this.root;
           while (currentItem!=null){
               int comparison=(currentItem).compareTo(newItem);
               if(comparison<0){
                   //newItem is grater, move right if possible
                   if(currentItem.next()!=null){
                       currentItem=currentItem.next();
                   }else{
                       currentItem.setNext(newItem);
                       newItem.setPrevious(currentItem);
                       return true;
                   }
               }else if(comparison>0){
                //new item is less, insert before
                   if(currentItem.previous()!=null){
                       currentItem.previous().setNext(newItem);
                       newItem.setPrevious(currentItem.previous());
                       newItem.setNext(currentItem);
                       currentItem.setPrevious(newItem);

                   }else{
                       newItem.setNext(this.root);
                       this.root.setPrevious(newItem);
                       this.root=newItem;

                   }
                   return true;
               }else{
                   System.out.println(newItem.getValue()+" is already present");
                   return false;
               }
           }

        }else{
            //the list is empty and this item become de head
            this.root=newItem;
            return true;
        }

        return false;
    }

    @Override
    public boolean deleteItem(ListItem item) {
        if(item!=null){
            System.out.println("Deleting the item "+ item.getValue());
        }else{
            System.out.println("The item is null");
        }
        if((this.root).compareTo(item)==0){
                this.root.next().setPrevious(null);
                this.root=this.root.next();
                return true;
            }else{
                ListItem currentItem=this.root;
                while (currentItem!=null){
                    if(((currentItem).compareTo(item))==0){
                        currentItem.previous().setNext(currentItem.next());
                        if(currentItem.next()!=null){
                            currentItem.next().setPrevious(currentItem.previous());
                            return true;
                        }
                    }else if((currentItem.compareTo(item))<0){
                        currentItem=currentItem.next();
                    }else{
                        return false;
                    }

                }
            }
       return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root!=null){
            ListItem current=root;
            while (current!=null){
                System.out.println(current.getValue());
                current=current.next();
            }
        }else{
            System.out.println("The list is empty");
        }
    }
}
