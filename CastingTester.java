package javatraining.oletsky.oop.castingtester;

/**
 * @author O.Oletsky
 * A program for exploring possible type castings
 */

public class CastingTester {
    public static void main(String[] args) {
        //Experiment 1
        /*
        Base t1 = new Sub();
        Sub t4 = (Sub) t1;
        //Ok

         */
        //Experiment 2
        /*
        Base t1 = new Sub();
        Base t4 = (Base) t1;
        //Ok

         */

        //Experiment 3
        /*
        Interf t1 = new Sub();
        Base t4 = (Base) t1;
        //Compilation error
        */

        //Experiment 4

        /*
        Base t1 = new Base();
        Sub t4 = (Sub) t1;
        //ClassCastException

         */

        //Experiment 5
        /*
        Base t1 = new Sub();
        OtherSub t4 = (OtherSub) t1;
        //ClassCastException

         */

        //Experiment 6
        /*
        Sub t1 = new Sub();
        Alien t4 = (Alien) t1;
        //ClassCastException
         */

        //Experiment 7
        /*
        Interf t1 = new OtherSub ();
        Alien t4 = (Alien)t1;
        //ClassCastException
        
         */


    }
}
