import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Desenvolvedor> dev = new ArrayList<>();

        //pegar dados do desenvolvedor//
        System.out.println("Informe seu nome completo: ");
        String nomeDev = scanner.nextLine();System.out.println("Quantas horas você tem disponíveis por dia?");
        int horasDispDia = scanner.nextInt();
        System.out.println("Qual o valor mensal que você deseja receber?");
        Double valorDesejMes = scanner.nextDouble();
        scanner.nextLine();

        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.setNome(nomeDev);
        desenvolvedor.setHorasDisponivel(horasDispDia);
        desenvolvedor.setValorDesejado(valorDesejMes);
        double valorHoraDev = desenvolvedor.valorHora();
        dev.add(desenvolvedor);

        //Dados dos itens do projeto//
        String continua;
        List<ItemDoSistema> itens = new ArrayList<>();
        do {
            System.out.println("Informe descrição do item: ");
            String descricao = scanner.nextLine();

            System.out.println("Informe dificuldade do item: 1 - 2 - 3");
            int dificuldade = scanner.nextInt();
            if (dificuldade < 1 || dificuldade > 3) {
                System.out.println("Valor inválido");
                System.out.println("Informe dificuldade do item: 1 - 2 - 3");
                dificuldade = scanner.nextInt();
            }

            System.out.println("Informe horas de desenvolvimento do item: ");
            int horasDesen = scanner.nextInt();

            ItemDoSistema itemSistema = new ItemDoSistema();
            itemSistema.setDescItem(descricao);
            itemSistema.setDificuldade(dificuldade);
            itemSistema.setHorasExec(horasDesen);
            itens.add(itemSistema);

            System.out.println("Deseja criar um novo item? sim/não ");
            scanner.nextLine();
            continua = scanner.nextLine();
        } while (continua.equals("sim"));

        int sumHoras = 0;
        for (ItemDoSistema item : itens) {
            sumHoras += item.getHorasExec();
            //System.out.println(sumHoras);
        }

        // calculo orcamento
        double valorLiq = (sumHoras * valorHoraDev) * 1.30;

        Orcamento orcamento = new Orcamento();
        orcamento.setDesenvolvedor(desenvolvedor);
        orcamento.setTotalHoras(sumHoras);
        orcamento.setCustoFinal(valorLiq);

        OrcamentoDao dao = new OrcamentoDao();
        dao.insert(orcamento);
    }

}
