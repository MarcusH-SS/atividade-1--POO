public class sistemaOperacional {
    private computador pc;
    private String versao;
    private String marca;


    public sistemaOperacional(computador pc, String versao, String marca) {
        this.pc = pc;
        this.versao = versao;
        this.marca = marca;
    }


    public computador getpc() {
        return this.pc;
    }

    public void setPc(computador pc) {
        this.pc = pc;
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean executarPrograma(programa p) {
        if(p.getSSDOcupado() > this.pc.getSSD()){
            System.out.println("erro na instalação do programa.");
            return false;
        }
        if(p.getMemoriaRAMAlocada() > this.pc.getMemoriaRAM()){
            System.out.println("Erro na EXECUÇÃO do programa.");

            return false;
        }

        Double TempoExecucao = p.getQuantidadeOperacoes() / (this.pc.getOperacoesPorSegundo()*this.pc.getNucleos());
        System.out.println("Programa executado com sucesso: " + TempoExecucao + "s");
        return true;
    }
}
