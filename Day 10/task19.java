class task19 {
    public static void main(String[] args) {

        MyRunnable runnableInstance = new MyRunnable();
        MyThread threadInstance = new MyThread();

        // Creating a Thread object using Runnable
        Thread t1 = new Thread(runnableInstance);

        // Starting both threads
        t1.start();              // Runs MyRunnable's run()
        threadInstance.start();  // Runs MyThread's run()
    }
}
