package homework0809.hw01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Product> hashSet =new HashSet<>();
        hashSet.add(new Product("1","百科全书",66.6,"商务印书馆"));
        hashSet.add(new Product("1","百科全书",66.6,"商务印书馆"));
        hashSet.add(new Product("4","百科全书1",666.6,"商务印书馆"));
        hashSet.add(new Product("4","百科全书1",666.6,"商务印书馆"));
        hashSet.add(new Product("3","百科全书2",6666.6,"商务印书馆"));
        hashSet.add(new Product("3","百科全书2",6666.6,"商务印书馆"));
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println((iterator.next()).toString());
        }

        System.out.println("__________________________________________________________________");
        TreeSet<Product> treeSet = new TreeSet<>();

        treeSet.add(new Product("1","百科全书",66.6,"商务印书馆"));
        treeSet.add(new Product("1","百科全书",66.6,"商务印书馆"));
        treeSet.add(new Product("4","百科全书1",666.6,"商务印书馆"));
        treeSet.add(new Product("4","百科全书1",666.6,"商务印书馆"));
        treeSet.add(new Product("3","百科全书2",6666.6,"商务印书馆"));
        treeSet.add(new Product("3","百科全书2",6666.6,"商务印书馆"));

        Iterator iterator1 = treeSet.iterator();
        while(iterator1.hasNext()){
            System.out.println((iterator1.next()).toString());
        }
    }

    public void setHashSet(){
        HashSet<Product> hashSet= new HashSet<>();
        hashSet.add(new Product("1","百科全书",66.6,"商务印书馆"));
        hashSet.add(new Product("2","百科全书1",666.66,"商务印书馆1"));
        hashSet.add(new Product("3","百科全书2",666.6,"商务印书馆2"));
        hashSet.add(new Product("4","百科全书",66.6,"商务印书馆"));
        System.out.println(hashSet);
    }
}
