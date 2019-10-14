import java.util.ArrayList;
import java.util.LinkedList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Madu");
        list1.add("Man");
        System.out.println("The number of Elements in the list: "+list1.size());
        for(Object o : list1){
            System.out.println(o.toString());
        }
        System.out.println("----------Get me the element at position zero----------------");
        String s = (String) list1.get(0);
        System.out.println("The element at position zero is: "+s);
        System.out.println("\r\n");
        //Typed Collection
        System.out.println("-----------------Typed Collection----------------");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Manifesto");
        list2.add("Man");
        System.out.println("The number of element(s) in the list: " + list2.size());
        for(String oString : list2){
            System.out.println(oString);
        }
        System.out.println("\r");
        //Adding one list to another list using addAll() method
         System.out.println("-------addAll demo--------------");
        ArrayList list3 = new ArrayList<>();
        list3.add("List3");
        list3.add("List3");
        LinkedList<String> list4 = new LinkedList<>();
        list4.add("List4");
        list4.add("List4");
        list4.addAll(list3);
        for(String aString: list4){
            System.out.println(aString);
        }
    }

}