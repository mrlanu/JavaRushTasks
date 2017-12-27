package com.javarush.task.task20.task2028;


import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
Построй дерево(1)
*/
public class CustomTree extends AbstractList implements Serializable, Cloneable{

    Entry<String> root;
    ArrayList<Entry> listArr = new ArrayList<>();

    public CustomTree() {
        this.root = new Entry<>("0");
        this.root.lineNumber = 0;
        this.listArr.add(this.root);
    }

    public static void main(String[] args) {
        List<String> list = new CustomTree();
        for (int i = 1; i < 16; i++) {
            //list.add(String.valueOf(i));
            list.add(String.valueOf(i));
        }

        //System.out.println("Expected 3, actual is " + ((CustomTree) list).getParent("8"));
        // list.remove("5");
        //System.out.println("Expected null, actual is " + ((CustomTree) list).getParent("11"));

    }


    public Entry<String> newEntry(Entry<String> eParent, Entry<String> eNewChild){
        Entry<String> result = eNewChild;
        result.lineNumber = eParent.lineNumber + 1;
        result.parent = eParent;
        eParent.isAvailableToAddChildren();
        if (eParent.availableToAddLeftChildren)eParent.leftChild = eNewChild;
        else if (eParent.availableToAddRightChildren)eParent.rightChild = eNewChild;
        return result;
    }

    public boolean add(String s){

        Entry<String> e = new Entry<>(s);
        int maxLine = 0;
        Entry<String> firstInLine = null;
        int listSize = this.listArr.size();

        for (Entry<String> ss : this.listArr)if (ss.lineNumber > maxLine)maxLine = ss.lineNumber;

        if (maxLine == 0){
            Entry<String> eTempolary = this.listArr.get(0);
            this.listArr.add(newEntry(eTempolary, e));
        }
        else {
            for (Entry<String> eS : this.listArr){
                if (eS.lineNumber == maxLine)firstInLine = eS;
                if (eS.lineNumber == maxLine - 1 && eS.isAvailableToAddChildren()){
                    this.listArr.add(newEntry(eS,e));
                    break;
                }
            }
            if (listSize == this.listArr.size())this.listArr.add(newEntry(firstInLine, e));
        }
        return true;
    }

    public int size() {
        return 0;
    }

    public String get(int index){
        throw new UnsupportedOperationException();
    }

    public String set(int index, String element){
        throw new UnsupportedOperationException();
    }

    public void add(int index, String element){
        throw new UnsupportedOperationException();
    }

    public String remove(int index){
        throw new UnsupportedOperationException();
    }

    public List<String> subList(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }

    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }

//    public boolean addAll(int index, Collection<? extends String> c){
//        throw new UnsupportedOperationException();
//    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }

    static class Entry<T> implements Serializable{
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        void checkChildren(){
            if (leftChild != null)availableToAddLeftChildren = false;
            if (rightChild != null)availableToAddRightChildren =false;
        }

        public boolean isAvailableToAddChildren(){
            return availableToAddRightChildren || availableToAddLeftChildren;
        }
    }
}
