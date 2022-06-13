public class Persona {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setNombre("Quincy");
        persona.setEdad(18);
        persona.setTelefono("664-123-4567");
       
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());
      }
    String nombre = "";
    int edad = 0;
    String telefono = "";

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
} 