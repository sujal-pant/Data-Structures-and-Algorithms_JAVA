public class Arrayday1_1QUE {
    public void sum(){
        /*
         * CALCULATE THE SUM OF ARRAY ON GIVEM
         * ARR[]= {ANY}
         * OUTPUT : ADDITION OF ANY
         */
        int arr [] = {1,2,3,4};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
        
    
    }
    public void maxum(){
        /*CALCULATE THE MAXIMUM VALUE IN THE ARRAY */
        //assuming all +ve 
            int arr [] = {1,2,34,42,121};
            int ans=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>ans){
                    ans=arr[i];
                    break;
                }
            }
            System.out.println(ans);

    
            
    }
    public void find(){
        /*
         * Search the given element x in the array and if present then return the index 
         * else return -1
         */
        //lINEAR SEARCH
        int arr []={1,5,3};
        int ans =-1;
        int x =590;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
            }
        }
        System.out.println("found at "+ ans);
        
    }
    public static void main(String[] args) {
        Arrayday1_1QUE obj = new Arrayday1_1QUE();
        //obj.sum();
        //obj.maxum();
        obj.find();

    }
}
