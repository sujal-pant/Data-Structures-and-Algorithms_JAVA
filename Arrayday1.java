public class Arrayday1 {
         
    
    public static void main(String[] args) {
        /*
         * arrays are for storing large data
         * --> collection of similar type of data
         * 1.data structre which stores a colletion of homogemous items
         * 2.0 based indexing
         * 3.Contigious memory allocation
         * 
         * syntax; int [] ages;
         * syntax of Array declaration:
         * int [] ages ;
         * ages = new int [size]
         * or this:
         * int [] ages = new int [10];
         * if we know the sie;
         * int [] arr ={1,24.21};
         * Types of arrays:
         * 1.single dimensional 
         * 2.multi dimensional
         * Initilize the multi array
         * 
         * int arr [] []= new int [4][5];
         */
        int arr [] = new int [5];
        arr[0]=1;
        System.out.println(arr[0]);
        int multi [][]= new int [5][3];
        multi[0][1]=10;
        System.out.println(multi[0][1]);
        System.out.println(multi.length);
        
    }
}
