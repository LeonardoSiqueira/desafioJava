package v3;

public class TestProjetoAgro3 {

    public static void main(String[] args) {
        PropostaV3 proposta1 = new PropostaV3();
        proposta1.setNomProdutor("Ken Block");
        proposta1.setNumCpf("11122233344");
        proposta1.setCooperativa(1985);
        proposta1.setUa(10);
        proposta1.setTpoProjeto("Custeio");
        proposta1.setTpoEnquadramento("Pronamp");
        proposta1.setTpoCultura("Milho");
        proposta1.setTpoSeguro("OMS");
        proposta1.setQuantidadeArea(10.00);
        proposta1.setValor(250.00);
        proposta1.setRecursoProprio(100.00);
        proposta1.setTotalFinanciado(150.00);
        proposta1.setQtdParcelas(3);

        System.out.println(proposta1.getNomProdutor());
        System.out.println(proposta1.getValor());
        System.out.println(proposta1.getTpoCultura());

        PropostaV3 proposta2 = new PropostaV3();
        proposta2.setTpoProjeto("Custeio");
        proposta2.setTpoEnquadramento("Pronamp");
        proposta2.setTpoCultura("SOJA");
        proposta2.setTpoSeguro("OMS");

        System.out.println(proposta2.getNomProdutor());
        System.out.println(proposta2.getValor());
        System.out.println(proposta2.getTpoCultura());

        PropostaV3 proposta3 = new PropostaV3();// custo
        proposta3.setQuantidadeArea(10.00);
        proposta3.setValor(250.00);
        proposta3.setRecursoProprio(100.00);
        proposta3.setTotalFinanciado(150.00);
        proposta3.setQtdParcelas(3);

        System.out.println(proposta3.getQuantidadeArea());
        System.out.println(proposta3.getValor());
        System.out.println(proposta3.getTpoCultura());
    }

    private static void imprimeProdutor(String nomProdutor, String numCpf, int cooperativa, int ua) {
        System.out.println("Dados Produtor: ");
        System.out.println("Nome Produtor: " + nomProdutor);
        System.out.println("CPF Produtor: " + numCpf);
        System.out.println("Cooperativa: " + cooperativa);
        System.out.println("UA: " + ua);
        System.out.println();
    }
    private static void imprimeProposta(String tpoProjeto, String tpoEnquadramento, String tpoCultura, String tpoSeguro, String quantidadeArea) {
        System.out.println("Dados da Proposta: ");
        System.out.println("Projeto: " + tpoProjeto);
        System.out.println("Enquadramento: " + tpoEnquadramento);
        System.out.println("Cultura: " + tpoCultura);
        System.out.println("Seguro: " + tpoSeguro);
        System.out.println("Area Total: " + quantidadeArea);
        System.out.println();
    }
    private static void imprimeValorProposta(double quantidadeArea, double valor, double recursoProprio, double totalFinanciado, int qtdParcelas, double vlrParcelas) {
        System.out.println("Valor Proposta: " + valor);
        System.out.println("Valor Recurso Proprio: " + recursoProprio);
        System.out.println("Valor Financiado: " + totalFinanciado);
        System.out.println("Quantidade Parcelas: " + qtdParcelas);
        System.out.println("Valor Parcelas: " + vlrParcelas);
    }
}
