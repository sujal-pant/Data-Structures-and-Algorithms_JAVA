public class day4nestedloop {
    public static void main(String[] args) {
     /*
         NESTED LOOPS:
         SYNTAX:
         for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                sysout(i,j);
            }
         } 
     */   
    System.out.println("ques-1");
    /*
     * ******
     * ******
     * ******
     */
     for(int i=1;i<=3;i++){
        for(int j=1;j<=6;j++){
            System.out.print("*");
        }
        System.out.println();
     }   
     /*
      ******
      *    *
      *    *
      ******
      */
      for(int i=1;i<=4;i++){
        for(int j=1;j<=6;j++){
            if(i==1 || i==4 || j==1 || j==6){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println();
      }
      /*
       * *
       * **
       * ***
       * ****
       */
      for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
      }
      /*
       * *****
       * ***
       * **
       * *
       */
      for(int i=5;i>0;i--){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
      }
      /*
       *    *
       *   ***
       *   ****
       *   *****
       *   ******
       */

         

    }

}
