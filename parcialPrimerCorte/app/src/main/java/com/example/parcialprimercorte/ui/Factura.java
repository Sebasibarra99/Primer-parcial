package com.example.parcialprimercorte.ui;

class Factura{
    String cliente;
    String documentoCliente;
    float valorFinal;
    String ciudad;

    public Factura(String cliente,String documentoCliente,float valorFinal,String ciudad){
        this.cliente = cliente;
        this.documentoCliente = documentoCliente;
        this.valorFinal = valorFinal;
        this.ciudad = ciudad;
    }

}

public class Main{
    public static void main(String[] args) {
        factura1 = new Factura("Sebastian","1233512",12000000, "Bogota D.C")
    }
}
