public class StopWatch {
    private long startTime, endTime;
    private boolean running = false;
    public StopWatch(){

    }
    void  start(){
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    void stop(){
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }
    long  getElapsedTime(){
        long elapsed;
        if (running) elapsed = (System.currentTimeMillis() - startTime);
        else elapsed = (endTime - startTime);
        return elapsed;
    }

}
