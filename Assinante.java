public class Assinante implements Observer{
    private String nome;

    public Assinante(String nome){
        this.nome = nome;
    }

    public void update(Object obj){
        System.out.println("Caro Assinante " + this.nome + ", " + (String)obj);
    }
}
