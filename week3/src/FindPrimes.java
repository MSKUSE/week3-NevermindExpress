public class FindPrimes {
    private static boolean isPrime(int p){
        if(p<2) return false;
        else if(p==2) return true;
        else if(p%2 == 0) return false;

        for (int i = 3; i < p; i+=2){
            if(p%i == 0) return false;
        } return true;
    }

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        } int max = Integer.parseInt(args[0]);
       // for (int i = 1; i < max; i++) {
       //     if(isPrime(i)){
       //         System.out.println(i);
       //     }
       // }

        for (int i = 2; i <= max ; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; break;
                }
            }
            if(isPrime) System.out.println(i);
        }
    }
}
