// Write a program that finds all the prime numbers between 2 and 100
class FindPrimes{
    public static void main(String[] args){
        int i, j, count;
        

        System.out.println("2 is prime");
        
        for(i = 3; i < 100; i += 2){
            count = 0;
            for (j = (int) Math.sqrt(i); j > 1; j--){
                if((i % j) == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(i + " is prime");
            }
        }
    }
}