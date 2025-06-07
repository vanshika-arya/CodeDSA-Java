public class WaitandNotify {
    boolean isSignalled=false;
    public synchronized void producesignal(){
        isSignalled= true;
        System.out.println("producing.....");
        notify();
    }
    public synchronized void Waitforsignal(){
        while(!isSignalled){
             try {
                 System.out.println("waiting....");
                 wait();
        } catch (InterruptedException e) {
        }   
            }
            System.out.println("got signal");
        }
        
    }
    public static void main(String[] args) {
        WaitandNotify obj= new WaitandNotify();
        Thread a= new Thread( ()->{
             obj.Waitforsignal();
        });
       
        Thread b= new Thread( ()->{
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
               obj.producesignal();
            }
        });
    }
    

