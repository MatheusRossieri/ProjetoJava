public abstract class Func extends Pessoa{
    
    private String departamento;
    private String cargo;
    private String data_contratacao;
    private String turno_trabalho;

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getData_contratacao() {
        return data_contratacao;
    }
    public void setData_contratacao(String data_contratacao) {
        this.data_contratacao = data_contratacao;
    }
    public String getTurno_trabalho() {
        return turno_trabalho;
    }
    public void setTurno_trabalho(String turno_trabalho) {
        this.turno_trabalho = turno_trabalho;
    }
}
