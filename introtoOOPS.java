public class introtoOOPS {
    int age=10;
    public static void main(String[] args) {
        introtoOOPS sujal = new introtoOOPS();
        System.out.println(sujal.age);
        /*
         *OOPS real world entity
          like car racing games - in mind car - 1 game has muliple cars
          multiple tracks
          cars like - Toyota , bmw and alto have common attribute as
          model number,color , year of manufacture
          And all have some funcationality as - acclerate , brake , open trunk

          classes- the blue print or template of the real world entity which we are builing
          object-the build items form classes are object like bmw , alto and so on.

          class car : model number , YOM , company and color-->attributes (class attributes also known as member variable)
          acclerate brake steear-->methods(class methods)
          3 characterstics of an object:
          1.identity , 2.state 3.behaviour

          CREATE A CLASS
          1.access modifiers
          ->public- eg roods
          protected- property (dads home is also my home)
          default- default (if not set by us)
           and private-phone ,messages
          syntax:
          class is a keyword where as car is class name
          public class car{
            //class body

          }
          CREATE A OBJECT
          className ObjectName = new ClassName();
          Objectname .attribute
          JAVA FILE -> MULTIPLE CLASSES->PUBLIC CLASS -> ONLY1
          PUBLIC CLASS -> FILE NAME
         *  
         */
    }
}
