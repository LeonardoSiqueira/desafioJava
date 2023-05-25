package v2;

public class TestProjetoAgro2 {

    public static void main(String[] args) {
        PropostaV2 proposta1 = new PropostaV2();
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

        imprimeProdutor(proposta1.getNomProdutor(), proposta1.getNumCpf(), proposta1.getCooperativa(), proposta1.getUa());
        imprimeProposta(proposta1.getTpoProjeto(), proposta1.getTpoEnquadramento(), proposta1.getTpoCultura(), proposta1.getTpoSeguro(), proposta1.getQuantidadeArea());
        imprimeValorProposta(proposta1.getQuantidadeArea(), proposta1.getValor(), proposta1.getRecursoProprio(), proposta1.getTotalFinanciado(), proposta1.getQtdParcelas(), proposta1.getValor() / proposta1.getQtdParcelas());

        PropostaV2 proposta2 = new PropostaV2();
        proposta2.setTpoProjeto("Custeio");
        proposta2.setTpoEnquadramento("Pronamp");
        proposta2.setTpoCultura("Milho");
        proposta2.setTpoSeguro("OMS");

        imprimeProdutor(proposta2.getNomProdutor(), proposta2.getNumCpf(), proposta2.getCooperativa(), proposta2.getUa());
        imprimeProposta(proposta2.getTpoProjeto(), proposta2.getTpoEnquadramento(), proposta2.getTpoCultura(), proposta2.getTpoSeguro(), proposta2.getQuantidadeArea());
        imprimeValorProposta(proposta2.getQuantidadeArea(), proposta2.getValor(), proposta2.getRecursoProprio(), proposta2.getTotalFinanciado(), proposta2.getQtdParcelas(), proposta2.getValor() / proposta2.getQtdParcelas());

        PropostaV2 proposta3 = new PropostaV2();// custo
        proposta3.setQuantidadeArea(10.00);
        proposta3.setValor(250.00);
        proposta3.setRecursoProprio(100.00);
        proposta3.setTotalFinanciado(150.00);
        proposta3.setQtdParcelas(3);

        imprimeProdutor(proposta3.getNomProdutor(), proposta3.getNumCpf(), proposta3.getCooperativa(), proposta3.getUa());
        imprimeProposta(proposta3.getTpoProjeto(), proposta3.getTpoEnquadramento(), proposta3.getTpoCultura(), proposta3.getTpoSeguro(), proposta3.getQuantidadeArea());
        imprimeValorProposta(proposta3.getQuantidadeArea(), proposta3.getValor(), proposta3.getRecursoProprio(), proposta3.getTotalFinanciado(), proposta3.getQtdParcelas(), proposta3.getValor() / proposta3.getQtdParcelas());
    }

    private static void imprimeProdutor(String nomProdutor, String numCpf, int cooperativa, int ua) {
        System.out.println("Dados Produtor: ");
        System.out.println("Nome Produtor: " + nomProdutor);
        System.out.println("CPF Produtor: " + numCpf);
        System.out.println("Cooperativa: " + cooperativa);
        System.out.println("UA: " + ua);
        System.out.println();
    }
    private static void imprimeProposta(String tpoProjeto, String tpoEnquadramento, String tpoCultura, String tpoSeguro, double quantidadeArea) {
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
