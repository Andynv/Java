public class Coche {
    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.NuevaPuerta();
        System.out.println(miCoche.puertas);
      }
    int puertas = 0;
    public void NuevaPuerta(){
        this.puertas++;
    } 
} 
