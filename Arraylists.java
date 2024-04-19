import java.util.ArrayList;
import java.util.Collection;

public class Arraylists {

    static void reverlist( ArrayList<Integer> list){
        int i=0; 
        int j=list.size()-1;
        while (i<j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;


            
            
        }

    }

 
    public static void main(String[] args) {
        /*
         *    ARRAY LIST CLASS
         * 
         *  wrapper class
         *      : A class whose object contain or Wrap Primitive data type
         * as: int flot boolean
         *      : object of a wrapper class contain a field which store the 
         * primitive data type
         * int as --> INTEGER CLASS (wrapper class)
         * float --> Float
         * char, bootean long and all first in capittal
         * 
         * 
         * ARRYLIST CLASS present int ulil package
         * :(SYNTAX): list<AnyClass> list = new ArrayList <AnyClass>();
         * its used like if we see array 
         * int arr[]= new int [5];
         * their is only space for 5 but for arraylist have variable size
        //  */
        // Integer i=  Integer.valueOf(4);
        // System.out.println(i);
        // Float f = Float.valueOf(12.2f);
        // System.out.println(f);
        ArrayList<Integer> l1 = new ArrayList<>();

        //add a element at end
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(7);
        //get an element at index i
        // System.out.println(l1.get(0)); //access by .get
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));

        }
        //print the array list directly
        System.out.println(l1);

        //add element at some index i //5 100 6 7 8
        l1.add(1,100);//index , element
        System.err.println(l1);
        
        //modify element at index i 
        l1.set(1, 10);
        System.out.println(l1);

        //remove element at index i
        l1.remove(1);
        System.out.println(l1);

        //remove an element e
        l1.remove(Integer.valueOf(7));//remove 7 element
        System.out.println(l1);

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        //if we dont specify class , we can put anyting inside l
        // ArrayList  l2 = new ArrayList();
        // l2.add(1);
        // l2.add("help");
        // l2.add(true);
        // System.out.println(l2);

        //WRITE THE PROGRAM TO REVERSE THE GIVEN ARRAYLIST
        ArrayList <Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    //  reverlist(list);
    
        Collection.reverse(list);
     System.out.println(list);
     Collection.sort(list);//sort accending
     Collection.sort(list,Collection.reversesort());//decending

     Arrylist <String> l6 = new Arrylist<>();

    





    }
}
