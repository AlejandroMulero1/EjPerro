package principal;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

enum Raza{RAZA1, RAZA2, RAZA3, RAZA49}

public class Perro {
    private int id;
    private String nombre;
    private Raza raza;
    private boolean conChapa;
    private String color;
    private int edad;

    public Perro(int id, String nombre, Raza raza, boolean conChapa, String color, int edad){
        this.id=id;
        this.nombre=nombre;
        this.raza=raza;
        this.conChapa=conChapa;
        this.color=color;
        this.edad=edad;
    }

    public static void crearPerros(List<Perro> perros){
        perros.add(new Perro(1, "Repoio", Raza.RAZA1, false, "rojo", 7));
        perros.add(new Perro(2, "Azulito", Raza.RAZA2, true, "azul", 17));
        perros.add(new Perro(3, "Joselito", Raza.RAZA3, true, "amarillo", 14));
        perros.add(new Perro(4, "Tobi", Raza.RAZA49, false, "negro", 7));
        perros.add(new Perro(5, "David", Raza.RAZA2, true, "rosa", 25));
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        StringBuffer sb = new StringBuffer(nombre);
        sb.setLength(10);
        return sb.toString();
    }

    public String getRaza() {
        StringBuffer sb = new StringBuffer(String.valueOf(raza));
        sb.setLength(10);
        return sb.toString();
    }

    public boolean isConChapa() {
        return conChapa;
    }

    public String getColor() {
        StringBuffer sb = new StringBuffer(color);
        sb.setLength(10);
        return sb.toString();
    }

    public int getEdad() {
        return edad;
    }
}
