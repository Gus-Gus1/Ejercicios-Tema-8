public class Ejercicios_tema8 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Gustavo Cardona");
        persona.setEdad(33);
        persona.setTelefono(8843183);


        String Nombre = persona.getNombre();
        System.out.println("Mi nombre es " +Nombre);
        System.out.println("Tengo " +persona.getEdad() + " años");
        System.out.println(("mi celular es +57400") +persona.getTelefono(8343183) + " de Colombia");
    }
}
class Persona {
    private String Nombre;
    private int Edad;
    private int Telefono;

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public void setTelefono(int Telefono){
        this.Telefono = Telefono;
    }

    public String getNombre(){
        return this.Nombre;
    }
    public int getEdad(){
        return this.Edad;
    }

    public int getTelefono(int i){
        return this.Telefono;
    }
}
