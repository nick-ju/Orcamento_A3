public class Orcamento {

    int totalHoras;
    double custoFinal;
    Desenvolvedor desenvolvedor;

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public void setCustoFinal(double custoFinal) {
        this.custoFinal = custoFinal;
    }

    public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public double getCustoFinal() {
        return custoFinal;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }

}
