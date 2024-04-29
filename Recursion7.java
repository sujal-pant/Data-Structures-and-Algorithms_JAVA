import java.util.Scanner;

public class Recursion7 {
    /*
     * STRINGS - RECURSION
     */

     static String remove(String s , int idx){
        /*
         * Remove all the occurrences of 'a' from string s= 'abcax'
         * by iterative method
         * string ans ;
         * for(int i=0;i<arr;i++){
         * if(s.charAt(i)!='a'){
         *  ans+=s.charAt(i);
         * }}
         */
        /*
         * F(str,idx)-- idx is representing the current index
         * here the above function will remove all occirence of 'a' in the string s
         * starting form index idx
         * Recurisve work is as
         * idx +1 through it will solve for me
         * base case 
         * if(idx == n ){
         * return
         * }
         */

         //base case
         if(idx == s.length()) return" ";
          
         //recursion 
         String smallans = remove(s, idx+1);

         //self work
         char currChar = s.charAt(idx);
         if(currChar != 'a'){
            return currChar+ smallans;

         }
         else {
            return smallans;
         }

            //time complexity is O(n^2)

     }
     static String removewithoutlen (String s){
        if(s.length()== 0) return "";
        String smallans= removewithoutlen(s.substring(1, 0));
        char currChar = s.charAt(0);
        if(currChar != 'a'){
           return currChar+ smallans;

        }
        else {
           return smallans;
        }
        //            //time complexity is O(n^2)

     }
     static String returnreverse(String s, int idx){
      /*
       * WAP TO REVERSE A STRING 
       * S= a b c d e
       * f(s,idx+1)+ s.charat(idx)--> reverse will be done by 1 index
       * here a will do done by me and bcde is done by recursion
       * f(s,idx){this will reverse string form index idx}
       */
      if(idx == s.length()) return " ";
      String smallans= returnreverse(s, idx+1);
      //SELF WORK
      return smallans + s.charAt(idx);
     }
     static boolean palindrom(String s ,int l ,int r ){
      /*WAP TO FIND PALINDORM 
       * EG DAD = DAD SAME FORM BACK AND FRONT
       * f(s,l,r)-> its string s b/w inces l and r are plindrom?
       * l=0, r=n-1
       * recursion ley f(s,l+1,r-1)
       * s.charat(l)==s.charat(r)
       * l>=r is empty
       */
      if(l <=r) return true;

      return (s.charAt(l)==s.charAt(r)&& palindrom(s, l+1, r-1));

     }
     public static void main(String[] args) {
        // String s = "college";
        // collection of character is string
        Scanner sc = new Scanner(System.in);
        ;
        // String ss = sc.next();// donot reads spapace
        // String ssx="college";
        // System.out.println(ssx);

        // char ch = ssx.charAt(0);
        // System.out.println(ch);
        // /*
        //  * index is same as array
        //  * college
        //  * 0123456
        //  * n=7
        //  * last valid index is 6
        //  * 
        //  */
        // for(int i=0;i<ssx.length();i++){
        //     System.out.println(ssx.charAt(i));
        // }
        // System.out.println(ssx.substring(2, 4));//begain and end inde
        // //(2,3) begain is included and end is exclusive
            String s = sc.nextLine();
            // System.out.println(remove(s, 0));
            String req = returnreverse(s, 0);
            if(req.equals(s)){
               System.out.println("yes");
            }
            else{
               System.out.println("no");
            }


    }
}
