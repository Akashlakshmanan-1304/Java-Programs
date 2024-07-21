public class Thread5 implements Runnable
{
       public static void main(String[] args) {
        Thread AThread  = new Thread();
        Thread BThread  = new Thread("Alpha");
        AThread.start();
        BThread.start();
        System.out.println("Thread names are following:");
        System.out.println(AThread.getName());
        System.out.println(BThread.getName());
    }
    public void run() {
	System.out.println("Running ");
    }
}