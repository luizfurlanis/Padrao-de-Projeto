public class Cliente {
    public static void main(String[] args) {
        Jornal j = new Jornal();
        Assinante u1 = new Assinante("Rhuan Cruz");
        j.addObserver(u1);

        Assinante u2 = new Assinante("Thiago Menezes");
        j.addObserver(u2);

        Assinante u3 = new Assinante("Luiz Furlanis");
        j.addObserver(u3);
        
        j.setNoticia("NOticia chocante");
        
        j.delObserver(u2);
        
        j.setNoticia("Sala toda pega dp em calculo II!");
        
    }
}

