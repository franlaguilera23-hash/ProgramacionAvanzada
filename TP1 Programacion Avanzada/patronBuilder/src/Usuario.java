public class Usuario {
    // Atributos
    private final String name;
    private final String lastName;
    private final int age;
    private final String numberPhone;

    private Usuario(UsuarioBuilder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.numberPhone = builder.numberPhone;
    }

    // Clase Builder interna
    public static class UsuarioBuilder {
        private final String name;
        private final String lastName;
        private int age;
        private String numberPhone;

        public UsuarioBuilder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public UsuarioBuilder conEdad(int age) {
            this.age = age;
            return this;
        }

        public UsuarioBuilder conTelefono(String numberPhone) {
            this.numberPhone = numberPhone;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario: " + name + " " + lastName + " (Edad: " + age + ")";
    }
}