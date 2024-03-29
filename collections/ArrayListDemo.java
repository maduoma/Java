import java.util.ArrayList;
import java.util.LinkedList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); //Not typed
        list1.add("List1");
        list1.add("List1");
        System.out.println("\r\n");
        System.out.println("The number of Elements in the list: "+list1.size());
        for(Object o : list1){ //The list1 returns an object
            System.out.println(o.toString()); // List1 returns object since the array is not explicitly typed and
                                              // toString() can be used to convert the object to String
        }
        System.out.println("----------Get me the element at position zero----------------");
        String s = (String) list1.get(0); //List1 returns object since the array is not explicitly typed and must be converted to String before printing
        System.out.println("The element at position zero is: "+s);
        System.out.println("\r\n");
        //Typed Collection
        System.out.println("-----------------Typed Collection----------------");
        ArrayList<String> list2 = new ArrayList<>(); //Typed as String
        list2.add("List2");
        list2.add("List2");
        System.out.println("The number of element(s) in the list: " + list2.size());
        for(String oString : list2){
            System.out.println(oString);
        }
        System.out.println("\r");
        //Adding one list to another list using addAll() method
         System.out.println("-------addAll demo--------------");
        ArrayList<String> list3 = new ArrayList<>(); //Typed as String
        list3.add("List3");
        list3.add("List3");
        LinkedList<String> list4 = new LinkedList<>(); //Typed as String
        list4.add("List4");
        list4.add("List4");
        list4.addAll(list3);
        for(String aString: list4){
            System.out.println(aString);
        }
    }

}