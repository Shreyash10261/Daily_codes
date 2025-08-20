/*1.Two thread functions:-
    threadFunction1 and threadfunction2 are two classes that implements Runnable interface.

2.Inside both function run() menthod , run a loop for   5 times.Within loop there is a call do thread.sleep(10).After sleep a message is printed displaying thread name and number.

3.After starting the thread , the main thread calls the join method on both thread.*/

class ThreadFunction1 implements Runnable 
{
    @Override
    public void run() 
{
        for (int i = 1; i <= 5; i++) 
{
            try 
{
               // Thread.sleep(10);
            } 
catch (Exception e) 
{
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}

class ThreadFunction2 implements Runnable 
{
   
 @Override
    public void run() 
{
        for (int i = 1; i <= 5; i++) 
{
            try 
{
                Thread.sleep(10);
            } 
catch (InterruptedException e) 
{
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}

public class ThreadExample 
{
    public static void main(String args[]) 
{
        Thread t1 = new Thread(new ThreadFunction1(), "Thread-1");
        Thread t2 = new Thread(new ThreadFunction2(), "Thread-2");

        t1.start();
        t2.start();

        try 
{
            t1.join();
            t2.join();
        } 
catch (InterruptedException e) 
{
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Both threads have completed execution.");
    }
}