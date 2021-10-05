package com.pranay;

public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }else{
            ListItem currentItem = this.root;
            while(currentItem != null){
                int comparision = currentItem.compareTo(item);
                if(comparision < 0){
                    if(currentItem.next() != null){
                        currentItem = currentItem.next();
                    }else{
                        currentItem.setNext(item);
                        item.setPrevious(currentItem);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
