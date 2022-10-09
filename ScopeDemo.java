// Demonstrate block scope.

class ScopeDemo {
    public static void main(String[] args){
        int x; // known to all code within main

        x = 10;
        if(x==10) { // start new scope
            int y = 20; // known only to this if block

            //x and y are both known in the if block
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y is not known here. y's type hasnt been defined
        // x is still known here
        System.out.println("x is " + x);

    }
}