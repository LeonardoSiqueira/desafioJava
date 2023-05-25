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
}
