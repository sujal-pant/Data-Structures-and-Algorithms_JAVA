public class Arrayday1_1 {

    void demoarr(){

        //traversing array through loops
        /*
         * for loop , for each and while loop
         */
        int arr [] = new int [5];
        arr[0]=1;
        arr[1]=2;
        arr[3]=4;
        for(int i =0 ;i<=arr.length;i++){
            System.out.println(arr[i]);
        // for each loop
        for(int age :arr){
            System.out.println(age);
        }
        int i=0;
        while (i<3) {
            System.out.println(arr[i]);
            i++;
            
        }
        }
    }
    void multiarr(){
        int  arr [] [] = new int [2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }

    }
    public static void main(String[] args) {
        //Arrayday1_1 obj = new Arrayday1_1();
        //obj.demoarr();
        Arrayday1_1 help = new Arrayday1_1();
        help.multiarr();

    }
    
}
