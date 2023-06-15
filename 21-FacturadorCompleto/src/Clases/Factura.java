
package Clases;


public class Factura {
    private String id;
    private String cedula_cliente;
    private String cedula_vendedor;
    private String fecha;
    private String total;
    
    public Factura(String id, String cedula_cliente, String cedula_vendedor, String fecha, String total) {
        this.id = id;
        this.cedula_cliente = cedula_cliente;
        this.cedula_vendedor = cedula_vendedor;
        this.fecha = fecha;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCedulaCliente() {
        return cedula_cliente;
    }

    public void setCedulaCliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public String getCedulaVendedor() {
        return cedula_vendedor;
    }

    public void setCedulaVendedor(String cedula_vendedor) {
        this.cedula_vendedor = cedula_vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
