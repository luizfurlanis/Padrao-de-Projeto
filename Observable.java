public interface Observable {

    //add observer
    public void addObserver(Observer obs);

    //deleta observer
    public void delObserver(Observer obs);

    //notifica observer 
    public void notfyObservers(Observer obs);
}