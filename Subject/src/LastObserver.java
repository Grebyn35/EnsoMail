public class LastObserver extends Observer {

    public LastObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Highest One Bit: "+ Integer.highestOneBit(subject.getState()));
    }


}
