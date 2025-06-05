public class thread1 {
    public static void main(String[] args) {
        Thread t1= new Thread( ()-> { System.out.println("hello");
        try{
        Thread.sleep(1000);
        }catch(Exception e){}
    });
    
     Thread t2= new Thread( ()-> { System.out.println("byee");});
     t1.start();
     t2.start();
    }
    
    
}
