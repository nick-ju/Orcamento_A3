public class Desenvolvedor {
    String nome;
    int horasDisponivel;
    double valorDesejado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasDisponivel() {
        return horasDisponivel;
    }

    public void setHorasDisponivel(int horasDisponivel) {
        this.horasDisponivel = horasDisponivel;
    }

    public double getValorDesejado() {
        return valorDesejado;
    }

    public void setValorDesejado(double valorDesejado) {
        this.valorDesejado = valorDesejado;
    }

    public double valorHora(){
        return (this.valorDesejado*20)/this.horasDisponivel;
    }
}
