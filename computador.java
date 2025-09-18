public class computador {
    private Integer memoriaRAM;
    private Integer SSD;
    private Integer nucleos;
    private Double operacoesPorSegundo;


    public computador(Integer memoriaRAM, Integer SSD, Integer nucleos, Double operacoesPorSegundo) {
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }
    

    public Integer getMemoriaRAM() {
        return this.memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getSSD() {
        return this.SSD;
    }

    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    public Integer getNucleos() {
        return this.nucleos;
    }

    public void setNucleos(Integer nucleos) {
        this.nucleos = nucleos;
    }

    public Double getOperacoesPorSegundo() {
        return this.operacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(Double operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

}