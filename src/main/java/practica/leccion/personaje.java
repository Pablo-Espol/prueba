package practica.leccion;

public class personaje {
    protected String nombre;
    protected int edad;
    protected String elemento;
    protected int vida;


    public personaje(String nombre, int edad, String elemento, int vida){
        this.nombre= nombre;
        this.edad = edad;
        this.elemento= elemento;
        this.vida=vida;
    
    }

    public void datosPersonaje(){
        System.out.printf("nombre: %s \n" + //
                        "edad: %d \n" + //
                        "elemento: %s \n" + //
                         "vida: %d \n" , nombre,edad,elemento,vida);
    }
}
