package poo.redsocial;

public class Usuario {
    private String nick;
    private String email;
    private boolean activo;
    private Direccion direccion;

    public Usuario(String nick, String email) {
        this.nick = nick;
        this.email = email;
        this.activo = true;
    }

    public Usuario(String nick, String email, Direccion direccion) {
        this.nick = nick;
        this.email = email;
        this.direccion = direccion;
    }

    public void mostrarPerfil(){
        System.out.println("Nickname: " + nick);
        System.out.println("Email: " + email);
        System.out.println("Activo: " + activo);
        System.out.println("Dirección: " + direccion);
    }

    public String getNick() {
        return nick;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActivo() {
        return activo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", activo=" + activo +
                ", direccion=" + direccion +
                '}';
    }
}
