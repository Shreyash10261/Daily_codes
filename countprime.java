class countprime 
{
    public static void main(String args[]) 
{
        int max = 100;
        int count = 0;

        System.out.println("Prime numbers between 1 and " + max + " are:");

        for (int num = 2; num <= max; num++) 
{
            int divisors = 0;

            for (int i = 1; i <= num; i++) 
{
                if (num % i == 0) 
{
                    divisors++;
                }
            }

            if (divisors == 2) 
{
                System.out.print(num + " "); 
                count++;
            }
        }

        System.out.println("\nTotal number of prime numbers between 1 and " + max + ": " + count);
    }
}