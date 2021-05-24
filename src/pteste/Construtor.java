package pteste;

public class Construtor {
    private String nome;
    private int cpf;
    private String carroLocado;
    private double valorPago;

    public Construtor(){
        super();
    }

    public Construtor(String nome, int cpf, String carroLocado, double valorPago) {
        this.nome = nome;
        this.cpf = cpf;
        this.carroLocado = carroLocado;
        this.valorPago = valorPago;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getCarroLocado() {
        return carroLocado;
    }

    public void setCarroLocado(String carroLocado) {
        this.carroLocado = carroLocado;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "Construtor{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", carroLocado='" + carroLocado + '\'' +
                ", valorPago=" + valorPago +
                '}';
    }
}
