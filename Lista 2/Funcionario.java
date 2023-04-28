

public class Funcionario {

    private String nome;
    public double SalarioHoraMinimo = 12.50;
    private double SalarioHora = SalarioHoraMinimo, horasTrabalhadasMes = 0;
    private static int proxID = 1;
    private final int ID_FUNC = proxID;

    public Funcionario(String nome) {
        this.nome = nome;
        this.adicionaDiaDeTrabalho(4);
        proxID += 1;

    }

    public Funcionario(String nome, double SalarioHora) {
        this.atualizarNome(nome);
        this.atualizaSalarioHora(SalarioHora);
        proxID += 1;
    }

    public String getNome() {
        return this.nome;

    }

    public int getID() {
        return this.ID_FUNC;
    }

    public double getSalarioHora() {
        return this.SalarioHora;

    }

    public int getProxID() {
        return proxID;
    }

    public double calculaSalarioMes() {

        return this.SalarioHora * horasTrabalhadasMes;

    }

    public void reiniciaMes() {
        this.horasTrabalhadasMes = 0;
    }

    public void atualizarNome(String nome) {
        this.nome = nome;

    }
    public void atualizaSalarioHora(double SalarioHora){
        this.SalarioHora = SalarioHora;

    }
    public void adicionaDiaDeTrabalho(double Dia){
        if (Dia >= 4){
            this.horasTrabalhadasMes += Dia;
        }
        else{
            System.out.println("Tem que ser pelo menos 4 horas!");
        }
        
    }
    public void funcionarioCompleto(){
        System.out.println("Id: "+ this.ID_FUNC +
        "\nNome: "+ this.getNome() +
        "\nSalarioHora: " + this.getSalarioHora() +
        "\nHoras Trabalhadas: " + this.horasTrabalhadasMes);
    }

}
