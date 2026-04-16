//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear un usuario con todos los datos
        Usuario usuarioCompleto = new Usuario.UsuarioBuilder("Lionel", "Messi")
                .conEdad(38)
                .conTelefono("123-456789")
                .build();

        // Crear un usuario solo con los datos obligatorios
        Usuario usuarioBasico = new Usuario.UsuarioBuilder("Antonela", "Roccuzzo")
                .build();

        System.out.println("Usuario 1: " + usuarioCompleto.toString());
        System.out.println("Usuario 2: " + usuarioBasico.toString());
    }
}