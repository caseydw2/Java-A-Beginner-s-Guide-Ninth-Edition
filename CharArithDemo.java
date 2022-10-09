/*
 * Character variables can be handled like integers.
 */

class CharArithDemo {
    public static void main(String[] args) {
        char ch;
        int asciicode;

        asciicode = 0;

        for(ch = 0; ch <= 127; ch++){
            System.out.println("For asciicode " + asciicode + " the character is " + ch);
            asciicode++;
        }
        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++; // increment ch
        System.out.println("ch is now "+ ch);

        ch = 90; // give ch the value Z
        System.out.println("ch is now " + ch);

    }
    
}
