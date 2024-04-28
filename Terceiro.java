public class Terceiro extends Pessoa{
    
    private String tipo_servico;
    private int tempo_contrato;
    private String empresa;
    private String avaliacao_servico;
    private double valor_contrato;
    
    public String getTipo_servico() {
        return tipo_servico;
    }
    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }
    public int getTempo_contrato() {
        return tempo_contrato;
    }
    public void setTempo_contrato(int tempo_contrato) {
        this.tempo_contrato = tempo_contrato;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getAvaliacao_servico() {
        return avaliacao_servico;
    }
    public void setAvaliacao_servico(String avaliacao_servico) {
        this.avaliacao_servico = avaliacao_servico;
    }
    public double getValor_contrato() {
        return valor_contrato;
    }
    public void setValor_contrato(double valor_contrato) {
        this.valor_contrato = valor_contrato;
    }
    
}
