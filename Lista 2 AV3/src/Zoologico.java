
import java.util.Scanner;

public class Zoologico{
    
    private String jaula[];
    private static final int TAMANHO = 10;
    
    public Zoologico(){
        this.jaula = new String[TAMANHO];
    }
    
    public void alocaJaula(Animal guedes){
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i < TAMANHO; i++) {
            int aux = i;
            System.out.println("Digite o animal da jaula("+ (aux+=1)+")");
            jaula[i] = leia.next();
            System.out.print(jaula[i]+" : ");
            guedes.emitirSom();
            System.out.println("Este animal tem pernas?(S ou N)");
            String perna = leia.next();
            if(perna.equals("S")){
                guedes.locomover();
            }
        }
    }
    
}
