public class methods {
    static void sum(int a,int b){
       int sum=a+b;
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        /*java methods are the block of code performing some action which rin only when it is called
        function ->bark() directly 
        method--> fluffy.bark();
        why methods are imp?
        write once and reuse many times
        tme save , dublicate code reduce and code maintainability
        types:
        1.user defined ->programmer
        2.standarted liberary method -> sqrt
        syntax:
        access modifier,return type , method name , (parameter list)
            public class main{
                public int sum(int a , int b){
                    //code for exe
                }
            } 
            1.method signature; method name + parameter list
            2.access specifier _ public default 
            3.return name
            4.method name
            5.parameter
            6.method body

            CALL A METHOD:
            sum();
            static na vaye we have to make an obj but as we are suing a static so we donot use it

            CONSTRUCTOR-> sepcial method used to initialize object
            constructoer namme = class name
            cons* -> no resturn type
         * 
         */
     
    sum(5, 6);        
    }
}
