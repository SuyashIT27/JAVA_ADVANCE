public class Lecture1 {
    public static void main(String[] args) {
      /*task1 t1=new task1();
      Task2 t2=new Task2();
      t1.start();
      t2.start();*/
        // Using implements Runnable
        Task3 t3=new Task3();
        Task4 t4=new Task4();
        Thread th1=new Thread(t3);
        Thread th2=new Thread(t4);
        th1.start();
        th2.start();
    }
    // By Extending the thread calss
     public static class task1 extends Thread{
        @Override
        public void run(){
            for(; ;){
                System.out.println("Task1");
            }
        }
     }
     public static class Task2 extends Thread{
        @Override
         public void run(){
            for(;;) {
                System.out.println("Task2");
            }
        }
     }
     // By using the implements Runnable
    public static class Task3 implements Runnable{
        @Override
        public void run(){
            for(;;) {
                System.out.println("task3");
            }
        }
     }
     public static class Task4 implements Runnable{
         @Override
         public void run() {
             for(;;) {
                 System.out.println("task4");
             }
         }
     }
}
