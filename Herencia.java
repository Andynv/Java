public class Herencia {
    public static void main(String[] args) {
        Client client = new Client();    

        client.name = "John Doe";
        client.age = 30;
        client.telefono = "123456789";
        client.credito = 1000;

        Trabajador trabajador = new Trabajador();

        trabajador.name = "Jane Doe";
        trabajador.age = 25;
        trabajador.telefono = "987654321";
        trabajador.salario = 1000;
        
        System.out.println(
            "Nombre: " + client.name + "\n" +
            "Edad: " + client.age + "\n" +
            "Telefono: " + client.telefono + "\n" +
            "Credito: " + client.credito + "\n"
        );

        System.out.println(
            "Nombre: " + trabajador.name + "\n" +
            "Edad: " + trabajador.age + "\n" +
            "Telefono: " + trabajador.telefono + "\n" +
            "Salario: " + trabajador.salario + "\n"
        );
 }
}

class Person {
   String name;
   int age;
   String telefono;
}

class Client extends Person {
    int credito;
}

class Trabajador extends Person {
    int salario;
}

