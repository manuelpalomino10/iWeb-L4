public class ProcedimientoMedico {
    private int codigo;
    private String requisito;
    private int duracion;
    private int tarifa;

    public ProcedimientoMedico(int tarifa, int duracion, String requisito, int codigo) {
        this.tarifa = tarifa;
        this.duracion = duracion;
        this.requisito = requisito;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
}
