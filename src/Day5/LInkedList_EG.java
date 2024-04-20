package Day5;

import java.util.LinkedList;

public class LInkedList_EG {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Good");
        list.add("Bad");
        list.add("Ugly");
        list.add("Hi");
        list.add("Good");


        System.out.println(list);

        list.addFirst("Begin");
        System.out.println(list);

        list.addLast("End");
        System.out.println(list);

       //
        LinkedList clonedLinkedlist = new LinkedList<>();
        clonedLinkedlist = (LinkedList) list.clone();
        System.out.println(clonedLinkedlist);
        System.out.println(list);
        clonedLinkedlist.clear();
        System.out.println(clonedLinkedlist);

        //first elemt
        System.out.println(list.element());

        System.out.println(list.getFirst());

        System.out.println(list.get(2));

        System.out.println(list.getLast());

        list.push("Insert");
        System.out.println(list);

        list.pop();
        System.out.println(list);

        //remove
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.removeFirstOccurrence("Good");
        System.out.println(list);

        list.removeLastOccurrence("Good");
        System.out.println(list);

    }
}
