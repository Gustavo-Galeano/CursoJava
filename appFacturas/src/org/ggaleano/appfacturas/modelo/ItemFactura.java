package org.ggaleano.appfacturas.modelo;

public class ItemFactura {
    private int cantiadad;
    private Producto producto;

    public ItemFactura(int cantiadad, Producto producto) {
        this.cantiadad = cantiadad;
        this.producto = producto;
    }

    public int getCantiadad() {
        return cantiadad;
    }

    public void setCantiadad(int cantiadad) {
        this.cantiadad = cantiadad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float calcularImporte(){
        return this.cantiadad * this.producto.getPrecio();
    }

    @Override
    public String toString() {
        return producto.toString() +
                "\t" + cantiadad +
                "\t" + calcularImporte();
    }
}
