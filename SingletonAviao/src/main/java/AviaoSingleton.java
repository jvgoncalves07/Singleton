
import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {
    
    private static AviaoSingleton INSTANCE;
    private Set<String> assentosDisponiveis;

    public static AviaoSingleton getINSTANCE() {
        if(INSTANCE == null){
            synchronized(AviaoSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new AviaoSingleton();
                }
            }
        }
        return INSTANCE;
    }
    
    
    
    private AviaoSingleton() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
        
    }
   
    public boolean bookAssentos(String assento){
        return assentosDisponiveis.remove(assento);
    }
    
}
