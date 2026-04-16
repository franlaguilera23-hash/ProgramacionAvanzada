//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        int totalCompra = 5000;

        // El usuario elige pagar con tarjeta
        carrito.setEstrategia(new PagoTarjeta());
        carrito.realizarPago(totalCompra);

        // El usuario decide cambiar a efectivo
        carrito.setEstrategia(new PagoEfectivo());
        carrito.realizarPago(totalCompra);
    }
}