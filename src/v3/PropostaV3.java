package v3;

public class PropostaV3 {

    private String nomProdutor;
    private String numCpf;
    private int cooperativa;
    private int ua;
    private String tpoProjeto;
    private String tpoEnquadramento;
    private String tpoCultura;
    private String tpoSeguro;
    private double quantidadeArea;
    private double valor;
    private double recursoProprio;
    private double totalFinanciado;
    private int qtdParcelas;
    private double vlrParcelas;



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

    public String getNomProdutor() {
        return nomProdutor;
    }

    public void setNomProdutor(String nomProdutor) {
        this.nomProdutor = nomProdutor;
    }

    public String getNumCpf() {
        return numCpf;
    }

    public void setNumCpf(String numCpf) {
        this.numCpf = numCpf;
    }

    public int getCooperativa() {
        return cooperativa;
    }

    public void setCooperativa(int cooperativa) {
        this.cooperativa = cooperativa;
    }

    public int getUa() {
        return ua;
    }

    public void setUa(int ua) {
        this.ua = ua;
    }

    public String getTpoProjeto() {
        return tpoProjeto;
    }

    public void setTpoProjeto(String tpoProjeto) {
        this.tpoProjeto = tpoProjeto;
    }

    public String getTpoEnquadramento() {
        return tpoEnquadramento;
    }

    public void setTpoEnquadramento(String tpoEnquadramento) {
        this.tpoEnquadramento = tpoEnquadramento;
    }

    public String getTpoCultura() {
        return tpoCultura;
    }

    public void setTpoCultura(String tpoCultura) {
        this.tpoCultura = tpoCultura;
    }

    public String getTpoSeguro() {
        return tpoSeguro;
    }

    public void setTpoSeguro(String tpoSeguro) {
        this.tpoSeguro = tpoSeguro;
    }

    public double getQuantidadeArea() {
        return quantidadeArea;
    }

    public void setQuantidadeArea(double quantidadeArea) {
        this.quantidadeArea = quantidadeArea;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getRecursoProprio() {
        return recursoProprio;
    }

    public void setRecursoProprio(double recursoProprio) {
        this.recursoProprio = recursoProprio;
    }

    public double getTotalFinanciado() {
        return totalFinanciado;
    }

    public void setTotalFinanciado(double totalFinanciado) {
        this.totalFinanciado = totalFinanciado;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public double getVlrParcelas() {
        return vlrParcelas;
    }
}