package poo.practicaantesexamen.miniredsocial;

public class Usuario {
    private String nick;
    private String email;
    private boolean activo;
    private Direccion direccion;

    public Usuario(String nick, String email,Direccion direccion) {
        this.nick = nick;
        this.email = email;
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

    public void activar(){
        activo = true;
    }
    public void desactivar(){
        activo = false;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void mostrarPerfil(){
        System.out.println("*** MOSTRANDO INFORMACIÓN DEL USUARIO ***");
        System.out.println("\t Nick: " + nick);
        System.out.println("\t Email: " + email);
        System.out.println("\t Estado: " + activo);
        System.out.println("\t Dirección: " + direccion);
    }
}
