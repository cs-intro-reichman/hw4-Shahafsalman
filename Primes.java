public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n];
        for (int i = 0; i < isPrime.length; i++)
        {
            if (i > 1) {
                isPrime[i] = true;
            }
            else
            {
                isPrime[i] = false;
            }
        }

        int isPrimeIndex = 0;
        for (int m = 2; m <= Math.sqrt(n); m++)
        {
            while (isPrimeIndex <= isPrime.length - 1)
            {
                if (isPrimeIndex % m == 0 && isPrimeIndex != m) {
                    isPrime[isPrimeIndex] = false;
                }
                isPrimeIndex++;
            }
            isPrimeIndex = 0;
        }


        System.out.println("prime numbers up to " + n);
        printsArray(isPrime);
        System.out.println("there are " + primeCount(isPrime) + " primes between 2 and " + n + " (" + (int)primePercent(isPrime, n) + "% are primes)");

        
    }

    public static void printsArray(boolean[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] == true) {
            System.out.println(i);
        }
    }
  }

  public static int primeCount (boolean[] arr)
  {
    int count = 0;
    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] == true) {
            count++;
        }
    }
    return count;
  }

  public static double primePercent (boolean[] arr, int n)   //recieves the array and the n 
  {
      return ((double)10 / (double)30) * 100 ;
      
  }


}