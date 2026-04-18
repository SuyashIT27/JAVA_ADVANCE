public class Lecture2 extends Thread {
    @Override
    public void run() {
        System.out.println("Task1");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Lecture2 t1=new Lecture2();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try {
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println("there is error"+e.getMessage());
        }
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
        Task1 t2=new Task1();
        Task2 t3=new Task2();
        t2.setPriority(6);
        t2.setPriority(2);
        t2.start();
        t3.start();


    }
    public static class Task1 extends Thread{
        @Override
        public void run() {
            for(;;) {
                System.out.println("task1");
            }
        }
    }
    public static class Task2 extends Thread{
        @Override
        public void run() {
            for(;;){
                System.out.println("Task2");
            }
        }
    }
}
