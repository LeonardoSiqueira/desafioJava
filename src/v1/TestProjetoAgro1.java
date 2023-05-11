package v1;

class TestProjetoAgro1 {

    public static void main(String[] args) {

        PropostaV1 novaProposta1 = new PropostaV1();
        novaProposta1.nomProdutor = "Ken Block";
        novaProposta1.tpoProjeto = "Custeio";
        novaProposta1.tpoEnquadramento = "Pronaf";
        novaProposta1.tpoCultura = "Soja";
        novaProposta1.tpoSeguro = "Proagro";
        novaProposta1.quantidadeArea = 1.00;
        novaProposta1.valor = 25.50;
        novaProposta1.recursoProprio = 5.50;
        novaProposta1.qtdParcelas = 3;

        System.out.println("------ PROJETO AGRICOLA ----");
        System.out.println();
        System.out.println(" Consulta: ");
        System.out.println(" tpoProjeto: " + novaProposta1.tpoProjeto);
        System.out.println(" tpoEnquadramento: " + novaProposta1.tpoEnquadramento);
        System.out.println(" tpoCultura: " + novaProposta1.tpoCultura);
        System.out.println(" tpoSeguro: " + novaProposta1.tpoSeguro);
        System.out.println(" quantidadeArea: " + novaProposta1.quantidadeArea);
        System.out.println(" valor: " + novaProposta1.valor);//25.5
        System.out.println(" recursoProprio: " + novaProposta1.recursoProprio);
        System.out.println(" parcelas: " + novaProposta1.qtdParcelas);

//        novaProposta1.calcula(10.99);
//        System.out.println(" totalFinanciado: " + novaProposta1.totalFinanciado);

        PropostaV1 novaProposta2 = new PropostaV1();
        novaProposta2.tpoProjeto = "Custeio";
        novaProposta2.tpoEnquadramento = "Demais Produtores";
        novaProposta2.tpoCultura = "Milho";
        novaProposta2.tpoSeguro = "Sem Seguro";
        novaProposta2.quantidadeArea = 33.44;
        novaProposta2.valor = 1000.00;
        novaProposta2.recursoProprio = 25.50;
        novaProposta2.qtdParcelas = 12;

        System.out.println("------ PROJETO AGRICOLA ----");
        System.out.println();
        System.out.println(" Consulta: ");
        System.out.println(" tpoProjeto: " + novaProposta2.tpoProjeto);
        System.out.println(" tpoEnquadramento: " + novaProposta2.tpoEnquadramento);
        System.out.println(" tpoCultura: " + novaProposta2.tpoCultura);
        System.out.println(" tpoSeguro: " + novaProposta2.tpoSeguro);
        System.out.println(" quantidadeArea: " + novaProposta2.quantidadeArea);
        System.out.println(" valor: " + novaProposta2.valor);
        System.out.println(" recursoProprio: " + novaProposta2.recursoProprio);
        System.out.println(" parcelas: " + novaProposta2.qtdParcelas);

        PropostaV1 novaProposta3 = new PropostaV1();
        novaProposta3.tpoProjeto = "Custeio";
        novaProposta3.tpoEnquadramento = "Pronamp";
        novaProposta3.tpoCultura = "Banana";
        novaProposta3.tpoSeguro = "Outros Tipos de Seguro";
        novaProposta3.quantidadeArea = 2.00;
        novaProposta3.valor = 1000.00;
        novaProposta3.recursoProprio = 0;
        novaProposta3.qtdParcelas = 0;

        System.out.println("------ PROJETO AGRICOLA ----");
        System.out.println();
        System.out.println(" Consulta: ");
        System.out.println(" tpoProjeto: " + novaProposta3.tpoProjeto);
        System.out.println(" tpoEnquadramento: " + novaProposta3.tpoEnquadramento);
        System.out.println(" tpoCultura: " + novaProposta3.tpoCultura);
        System.out.println(" tpoSeguro: " + novaProposta3.tpoSeguro);
        System.out.println(" quantidadeArea: " + novaProposta3.quantidadeArea);
        System.out.println(" valor: " + novaProposta3.valor);
        System.out.println(" recursoProprio: " + novaProposta3.recursoProprio);
        System.out.println(" parcelas: " + novaProposta3.qtdParcelas);
    }
}