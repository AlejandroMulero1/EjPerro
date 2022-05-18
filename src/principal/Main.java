package principal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import static principal.Perro.crearPerros;

public class Main {

    public static void main(String[] args)  {
        RandomAccessFile file=null;
        List<Perro> listaPerros = new ArrayList<>();

        crearPerros(listaPerros);

        try{

            file = new RandomAccessFile("LosPerros.dat", "rw");

            for (Perro perro : listaPerros){
                file.writeInt(perro.getId());
                file.writeChars(perro.getNombre());
                file.writeBoolean(perro.isConChapa());
                file.writeChars(perro.getColor());
                file.writeChars(perro.getRaza());
                file.writeInt(perro.getEdad());
            }
            int pos=0;
            for(int it=0; it<listaPerros.size(); it++) {

                file.seek(pos);

                System.out.print(file.readInt());
                System.out.print("   ");

                String nombre = "";
                for (int i = 0; i < 10; i++) {
                    nombre += file.readChar();
                }
                System.out.print(nombre);
                System.out.print("   ");

                System.out.print(file.readBoolean());
                System.out.print("   ");

                String nombre2 = "";
                for (int i = 0; i < 10; i++) {
                    nombre2 += file.readChar();
                }
                System.out.print(nombre2);
                System.out.print("   ");

                String nombre3 = "";
                for (int i = 0; i < 10; i++) {
                    nombre3 += file.readChar();
                }
                System.out.print(nombre3);
                System.out.print("   ");

                System.out.print(file.readInt());
                System.out.println();
                pos+=69;
            }








        }catch (FileNotFoundException fe){

            System.out.println("Error");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                file.close();

            }catch (IOException e){

            }

        }
    }
}