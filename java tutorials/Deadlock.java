public class Deadlock {
    public static void main(String[]args){
        final String resourse1="Akku";
        final String resourse2="Ankita";
         Thread t1=new Thread(){
         public void run(){
                synchronized(resourse1){
                    System.out.println("Thread1: lock resourse1");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e){}
                    synchronized(resourse2)
                    {
                        System.out.println("Thread2:lock resourse2");
                    }
                }
            }
         };
          Thread t2=new Thread(){
            public void run(){
                synchronized(resourse2){
                    System.out.println("Thread2:lock resourse2");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e){}
                    synchronized(resourse1){
                         System.out.println("Thread1:lock resourse1");
                    }
                }
            }
          };
            t1.start();
             t2.start();
        }
}
