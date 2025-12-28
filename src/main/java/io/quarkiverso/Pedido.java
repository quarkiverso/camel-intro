package io.quarkiverso;

public class Pedido {
    private String id;
    private String producto;
    private double monto;
    private boolean procesado;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public boolean isProcesado() { return procesado; }
    public void setProcesado(boolean procesado) { this.procesado = procesado; }
}
