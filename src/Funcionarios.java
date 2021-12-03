/**
 * 
 * @author itamar
 *
 */
public class Funcionarios {
	private String nome;
    private String departamento;
    private double salario;


    public void recebeAumento(double valor){
        this.salario += valor;
    }

    public double getGanhoAnual(){
        return this.salario * 12;
    }

    public double getSalario(){
        return this.salario;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }


    public double setSalario(double novoSalario){
         return this.salario = novoSalario;
    }

    public void mostra(){

            
            System.out.println("Funcionario    : "+this.getNome());
            System.out.println("Deparatamento  : "+this.getDepartamento());
            System.out.println("Salario        : R$ "+this.getSalario());
        
       
            System.out.println("Ganho Anual    : R$ "+this.getGanhoAnual());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
}
