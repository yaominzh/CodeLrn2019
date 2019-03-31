package chap02observer;


public interface  Subject {
    public void registerOberver(Observer o);
    public void removeOberver(Observer o);
    public void notifyObervers();
}

