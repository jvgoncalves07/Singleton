
public class TesteAviao {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1B");
    }
    
    private static void agendarAssento(String assento){
        Aviao a = new Aviao();
        System.out.println(a.bookAssentos(assento));
    }
}
