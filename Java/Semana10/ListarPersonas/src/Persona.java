public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String mail;
    private static int numeroPersonas = 0;

    //Constructor vacio
    public Persona() {
        this.id = ++Persona.numeroPersonas;
    }

    //Constructor con parametros(sobrecarga de constructores)

    public Persona(String nombre, String tel, String mail) {
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("matias", "15151", "hola");
        System.out.println(persona1);
    }

    //VER A PARTIR DE Teclear aquí para VER el video 6
}
