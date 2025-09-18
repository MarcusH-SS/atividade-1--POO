public class programa {
    private Integer memoriaRAMAlocada;
    private Integer SSDOcupado;
    private Integer quantidadeOperacoes;

    public programa(int memoriaRAMAlocada, int SSDOcupado, int nucleos, int quantidadeOperacoes) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }


    public Integer getMemoriaRAMAlocada() {
        return this.memoriaRAMAlocada;
    }

    public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public Integer getSSDOcupado() {
        return this.SSDOcupado;
    }

    public void setSSDOcupado(Integer SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getQuantidadeOperacoes() {
        return this.quantidadeOperacoes;
    }

    public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
    
}
