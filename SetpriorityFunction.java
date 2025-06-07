class Mythread extends Thread{
    public void run(){
        for(int i=1;i<=4;i++){
            System.out.println(getName()+ " priority "+ getPriority());
            Thread.yield();
        }
    }
}
public class SetpriorityFunction {
    public static void main(String[] args) {
        Mythread t1= new Mythread();
        Mythread t2= new Mythread();
        t1.setName("Vanshika");
        t2.setName("Alshifa");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
    
}
