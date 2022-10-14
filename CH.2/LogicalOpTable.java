/*
 * Try This 2-2: a truth table for the logical operators.
 */
class LogicalOpTable{
    public static void main(String[] args){
        boolean p,q;

        System.out.println("P\tQ\tP AND Q\tP OR Q\tP XOR Q\tNOT P");

        p = q = true;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p) );

        p = true; q = false;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p) );

        p = false; q = true;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p) );

        p = q = false;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p) );
    }
    
}