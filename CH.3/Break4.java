// Using break with a label.
class Break4{
    public static void main(String[] args) {
        int i;

        for(i = 1; i < 4; i++){
one:       {
two:            {
three:              {
                        System.out.println("\ni is " + i);
                        if(i == 1) break one;
                        if(i == 2) break two;
                        if(i == 3) break three;

                        System.out.println("If this prints, I'm not gay");

                    }System.out.println("Print after block 3");
                }System.out.println("Print after block 2");
            }System.out.println("Print after block 1");
        }System.out.println("Print after block for loop");
    }
}