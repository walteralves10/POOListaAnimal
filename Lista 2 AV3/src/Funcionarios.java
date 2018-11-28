
import java.util.Scanner;

/*
    Exercicio 05
 */
public class Funcionarios {

    private String nome;
    private int codigoFunc;
    private String basico;
    private String medio;
    private String graduado;
    private double salario;
    private static final double RENDA = 1000.00;
    private static final double BASICO = 0.1;//4
    private static final double MEDIO = 0.5;//4
    private static final double GRADUADO = 1;//2

    public Funcionarios(String name, int codF) {
        setNome(name);
        setCodigoFunc(codF);
        setSalario(RENDA);
        System.out.println("renda: "+ getSalario());
    }

    public Funcionarios(String input) {
        verificaAcademico(input);
    }
    
    //exercicio 07
    public void calculaTotal(){
        Scanner leia = new Scanner(System.in);
        String nome[] = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite nome func:");
            nome[i] = leia.next();
            verificaAcademico(nome[i]);
        }
    }

    public void verificaAcademico(String input) {
        Scanner leia = new Scanner(System.in);
        System.out.println("1 - para ensino basico"
                + "2 - para ensino medio"
                + "3 - graduação");
        int aux = leia.nextInt();
        switch (aux) {
            case 1:
                setBasico(input);
                setSalario((RENDA+(RENDA*BASICO)));
                System.out.println("renda: "+ getSalario());
                break;
            case 2:
                setMedio(input);
                setSalario((RENDA+(RENDA*(BASICO+MEDIO))));
                System.out.println("renda: "+ getSalario());
                break;
            case 3:
                setGraduado(input);
                setSalario((RENDA+(RENDA*(BASICO+MEDIO+GRADUADO))));
                System.out.println("renda: "+ getSalario());
                break;
            default:
                System.out.println("escolha incorreta, tente novamente");
                verificaAcademico(input);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFunc() {
        return codigoFunc;
    }

    public void setCodigoFunc(int codigoFunc) {
        this.codigoFunc = codigoFunc;
    }

    public String getBasico() {
        return basico;
    }

    public void setBasico(String basico) {
        this.basico = basico;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getGraduado() {
        return graduado;
    }

    public void setGraduado(String graduado) {
        this.graduado = graduado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
