interface EstrategiaPago {
    void pagar(int monto);
}

class PagoTarjeta implements EstrategiaPago {
    public void pagar(int monto) {
        System.out.println("Pagando " + monto + " con Tarjeta de Crédito.");
    }
}

class PagoEfectivo implements EstrategiaPago {
    public void pagar(int monto) {
        System.out.println("Pagando " + monto + " en efectivo con 10% descuento.");
    }
}

// Contexto
class Carrito {
    private EstrategiaPago estrategia;

    public void setEstrategia(EstrategiaPago e) {
        this.estrategia = e;
    }

    public void realizarPago(int monto) {
        estrategia.pagar(monto);
    }
}
