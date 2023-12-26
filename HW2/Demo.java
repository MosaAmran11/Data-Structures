package HW2;

public class Demo {
    public static void main(String[] args) {
        CircularlyLinkedList list = new CircularlyLinkedList<>();
        list.add("Mosa");
        list.add("Amran");
        list.add(11);

        CircularlyLinkedList list2 = new CircularlyLinkedList<>();
        list2.add("Mosa");
        list2.add("Amran");
        list2.add(11);

        System.out.println(list.equals(list2));

        // System.out.println(list.getElement(0));
        // System.out.println(list.size());
        // System.out.println(list.getTail().getElement());
    }
}
