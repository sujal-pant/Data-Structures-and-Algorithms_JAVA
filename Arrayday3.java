import java.util.Scanner;
public class Arrayday3 {
    
    static int  Targetsum(int arr [] , int target){


        /*
         *                           TARGET SUM -    QUESTION PATTERN
         * 
         * find the total number of pair in the array which sum is 
         * equal to the given value x.
         * if the given array is said to be:
         * 4 6 3 5 8 2 and the target is 7 then the ans must be 2 as the pair are (4,5),(5,2)
         * so if we see:
         *      4 + (nth+ item)=7 then ans = ans++
         *      but for the 2nd iteration we should not do as:
         *        6+4 as its be done already (WE HAVE TO COUNT ONLY ONE PAIR NOT THE BOTH)
         * 
         */
        int ans=0;
         for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }

            }
         }
         return ans;
    }
    static int TargetsumTriplet(int arr[], int target){
        /* 
                            TARGET SUM -    QUESTION PATTERN
         * Count the number of triplet whose sum is equal to the given value x
         * take an example of a array:
         *  1 4 5 6 3 --->targert is set to 12 and the ans is 2 (1,5,6) and (4,5,3)
         *   we can say first we take :
         *     1 + 4 + (also we need one more number)so,+(5,6,3)->any
         * so,
         * 
         */
        int answer =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        answer++;
                    }

                }
            }
        }
        return answer;

    }
    static int arrymanu(int arr[]){
        /* 
         *              PATTERN: ARRAY MANIPULATION 
         * 
         * find the unique number in a given Array where all the elments all the elements
         * are being repeated twice with one value being unique 
         * (ONLY POSITIVE EMELENT IN THE ARRAY)
         * 
         *      say the array is : 1 2 3 4 2 1 3
         *      we have to give the ans as :4 
         *        
         *      Logic as :
         *              1 2 3 4 3 2 1
         *          
         *            same as TARGET SUM 
         *          
         *        if we take 1st element as 1 and we if check all the elemnt after that and 
         *          strick off the same element same as all for rest of all the numbers
         *      
         *          the ans is the one who is non stricked off
         * 
         * ALGORITHM:
         *  1. TRAVERSE ALL THE PAIRS
         *  2. EQUAL PAIR MARK AS -1
         * 3. TRAVERSE THE ARRAY AGAIN  THEN value > 0 is our ans;
         *  
         *
         */
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;i<arr.length;i++){
                    if(arr[i]==arr[j]){
                        arr[i]=-1;
                        arr[j]=-1;

                    }
                }
            }
            int ans=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    ans = arr[i];
                }
            }
            return ans;
    }
    static int findmax(int arr[]){
        /*
         *   find the 2nd largerst element in the array given.
         *  
         * if we take examples as :
         *   9 8 9 6 8 5 8 --> the max is 9 and the 2nd max is 8
         * 
         *   0 -2 0 -3 - -4 --> max is -0 and the 2nd max is -2
         * 
         * TO find the max of arr 
         * 5 4 1 6 2 -->max value in the array is 6
         * suppose:
         * max= -infinite or simple Integer.MINVALUE();
         
         * }
         * 
         * int max = Integer.MIN_VALUE;
        for(int i=0;iMarr.leangth;i++){
            if(arr[i]> max){
                max = arr[i];


            }
        }
            ALGORITHMS:
            1.find the maximum
            2.mark all the maxiumum as ->INTEGER.MINVALUE()
            3.find max again --> will be the max in the arr


         * 
         */
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];


            }
        }
        return max;

    }
    static int find2ndmax(int arr[]){
        int max = findmax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]== max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int Secmax = findmax(arr);
        return Secmax;
    }

    static int repetearr(int arr[]){
        /* 
         * Given is an array 'a' consisting of integers. Return the first value 
         * that is repeting in this array . If no value is being repeated , return -1;
         * example:
         * 1 5 3 4 6 3 4 --> ans is 3
         * but ans is not 4 as 1st value should be repeated 
         * 
         */
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static int smallest(int arr []){
        /*
         * 1 2 3 4 5-->smallest is 1
         * so if samllest is = 
         * 
         */
        int smallest = Integer.MAX_VALUE;
        int ans =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]< smallest){
                smallest= arr[i];
            }


        }
        return smallest;
    }
    static int secsmalles(int arr[]){
        int small = smallest(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==small){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int smallestsec = smallest(arr);
        return smallestsec;
    }
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the leangth of the array");
        int x = sc.nextInt();
        int arr [] = new int [x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // System.out.println("enter the target sum");
        // int target = sc.nextInt();
        // System.out.println(TargetsumTriplet(arr, target));
    //   System.out.println(arrymanu(arr));  
    // System.out.println(find2ndmax(arr));
    // System.out.println(repetearr(arr));
    System.out.println(secsmalles(arr));
      
    }
}
