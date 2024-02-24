package List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivy You
 * @version:
 * @Aim:
 */
public class listandLinkedlist {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zhan");
        list.add("zz");
        //在索引1插入一个对象
        list.add(1,"you");
        System.out.println(list);
        List list2 = new ArrayList();
        list2.addAll(list);
        System.out.println(list2);
        System.out.println(list.indexOf("zz"));
        System.out.println(list.get(1));
        System.out.println(list.lastIndexOf("zz"));
        list.remove("zz");
        System.out.println(list);
    }
//arraylisy 没有syconized 他是线程不安全
    //linked list 效率比较高只需要把前一个的next指向后一个的
    //后一个的pre指向前一个


}
