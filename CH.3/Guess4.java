// Guess the letter game, 4th verision.

class Guess4{
    public static void main(String[] args)
        throws java.io.IOException{

            char ch, ignore, answer = 'K';

            do{
                System.out.println("I'm thinking of a letter between A and Z.");
                System.out.print("Can you guess it: ");

                ch = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();

                }while(ignore != '\n');

                    if (ch == answer) System.out.println("**RIGHT**");
                    else{
                        System.out.print("...Sorry, you're ");
                        if (ch < answer) System.out.print( "too low. ");
                        else System.out.print("too high. ");
                        System.out.println("Try Again! \n");
                    }
                } while(ch != answer);
                 
            
        }
}