package org.example_COllection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Ivy You
 * @version:
 * @Aim:
 */
public class collection {
    //调用arralylist



    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("EE",11));
        System.out.println("obj" + col);
        col.add(new Book("SS",122));
        for (Object book: col) {
            System.out.println("the book"+ book);
            //增强for也可以在数组使用
            int[] nums = {1,2,3,4};
            for(int i:nums){
                System.out.println(i);
            }


        }
        //iterate col
//        Iterator iterator = col.iterator();
//        while (iterator.hasNext()){
//            Object next = iterator.next();
//            System.out.println("obj" + next);
//        }

        //itit只适用于下面这个，ctrl+j 可以显示所有快捷模板
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//
//        }


    }

}

@SuppressWarnings({"all"})
class Book{
    public String getBooknumber() {
        return booknumber;
    }

    public void setBooknumber(String booknumber) {
        this.booknumber = booknumber;
    }

    public int getBookpage() {
        return bookpage;
    }

    public void setBookpage(int bookpage) {
        this.bookpage = bookpage;
    }

    private String booknumber;
    private int bookpage;

    //当print出来整个集合的时候要注意tostring的集合
    @Override
    public String toString() {
        return "Book{" +
                "booknumber'" + booknumber + '\'' +
                ", bookpage" + bookpage +
                '}';
    }

    public Book(String booknumber, int bookpage) {
        this.booknumber = booknumber;
        this.bookpage = bookpage;
    }

}
