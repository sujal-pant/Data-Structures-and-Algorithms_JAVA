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
       * 
       * 
       * Total number of row =4
       * empty spaces on each line is different
       * r1->3 1
       * r2->23
       * r3-15
       * r4-07
       * (4-1) so on so the realtion on spaces are (r-i)
       * and the star is (2*(i-r)
       */
      for (int i = 1; i <= 4; i++) {
        // traversing over rows
        // print (r-i) spaces
        for (int j = 1; j <= 4 - i; j++) {
            System.out.print(" ");
        }
        // print 2*i-1 stars
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        // move to new line
        System.out.println();
    }
    
    //numerical Rectangle Pattern
    /*
     * 1234567
     * 2345671
     * 3456712
     * 4567123
     * **so on
     * 
     */for(int i=1;i<=7;i++){
        for(int j=i;j<=7;j++){
            System.out.print(j);
        }
        for(int k=1;k<=i-1;k++){
            System.out.print(k);
        }
        System.out.println();
     }
     System.out.println("end of this");
     /*
      * 123456
        123456
        123456
        123456
      */
      for(int i=1;i<=6;i++){
        for(int j=1;j<=6;j++){
            System.out.print(j);
        }
        System.out.println();
      }
      System.out.println("end of this question");
      /*
       * 121212
       * 212121
       * 121212
       * 212121
       * i+j-->even are 1
       * i+j-->odd are 2
       */
      for(int i=1;i<=6;i++){
        for(int j=1;j<=6;j++){
           if((i+j)%2==0){
            System.err.print("1");
           }
           else{
            System.out.print("2");
           }
        }
        System.out.println();

    
    }
    /*
     * 1
     *121
     12321
     123421

     r-i spaces
     r-i 1to i and i-1 to 1
     */
    
    for (int i = 1; i <= 4; i++) {
    // Print (4-i) spaces
    for (int j = 1; j <= 4 - i; j++) {
        System.out.print(" ");
    }
    
    // Print numbers from 1 to i
    for (int k = 1; k <= i; k++) {
        System.out.print(k);
    }
    
    // Print numbers from (i-1) to 1
    for (int l = i - 1; l >= 1; l--) {
        System.out.print(l);
    }
    
    System.out.println();
    }}}