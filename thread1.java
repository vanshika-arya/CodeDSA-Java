public class thread1 {
    public static void main(String[] args) {
        Thread t1= new Thread( ()-> { System.out.println("hello");
    });
     Thread t2= new Thread( ()-> { System.out.println("byee");});
     t1.start();
     t2.start();
    }
    
    
}
