import java.util.ArrayList;
import java.util.List;

public class Jornal implements Observable{
    
    private List <Observer> observers;
    private String noticia;

    public Jornal(){
        this.observers  = new ArrayList<Observer>();
        noticia = "noticia do dia";
    }

    public void setNoticia(String noticia){
        this.noticia = noticia;
        notfyObservers(null);
    }

    public void addObserver(Observer obs){
        this.observers.add(obs);
        obs.update("Assinatura realizada com sucesso.");
        System.out.println("\n");
    }

    public void delObserver(Observer obs){
        obs.update("Voce deixou de ser um assinante." + "\n");
        this.observers.remove(obs);
    }

    public void NotfyObserver(Observer obs){
        for(Observer obs : this.observers){
            obs.update(noticia);
        }
        System.out.println("\n");
    }
}
