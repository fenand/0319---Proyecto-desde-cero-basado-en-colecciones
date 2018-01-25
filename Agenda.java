import java.util.ArrayList;
import java.util.Iterator;   
/**
 * Write a description of class paginasAmarillas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Agenda
{
    //coleccion de contactos de la agenda
    private ArrayList<Contacto> contactos;
    //numero identificador de cada contacto
    private int id;

    /**
     * Constructor for objects of class paginasAmarillas
     */
    public Agenda(int id)
    {
        contactos = new ArrayList<Contacto>();
        this.id = id;
    }

    /**
     * Metodo para añadir contactos a las paginas amarillas
     */
    public void addContactos(String nombre, int telefono,String direccion,int edad)
    {
        contactos.add(new Contacto(nombre,telefono,direccion,edad));
    }

    /**
     * metodo que devuelve el id del contacto
     */
    public int getId()
    {
        return id;
    }

    /**
     * metodo para devolver el numero de contactos
     */
    public void getNumeroDeContactos()
    {
        System.out.println(contactos.size());  
    }

    /**
     * Metodo para mostra la informacion de cada contacto por pantalla numerados
     * 
     */
    public void mostrasContactos()
    {
        System.out.println("Lista de Contactos : ");

        for(Contacto contactos : contactos) {
            System.out.println(contactos.getContactoCompleto());
        }
        System.out.println();
    }

    /**
     * metodo Permita mostrar un listado ordenado de los objetos 
     * en función de su edad y telefono, 
     */
    public ArrayList<Contacto> ordenadoDeMayorAMenorPorEdad(ArrayList<Contacto> coleccion) {
        ArrayList<Contacto> contactosConMayorEdad = new ArrayList<Contacto>();
        int edadMaxima = 0;
        int contador = 0;

        if(coleccion.size() > 0) {
            for(Contacto Contacto : coleccion) {
                if(Contacto.obtenerEdad() > edadMaxima) {
                    edadMaxima = Contacto.obtenerEdad();
                }
            }

            while(contador < coleccion.size()) {
                if(coleccion.get(contador).obtenerEdad() == edadMaxima) {
                    contactosConMayorEdad.add(coleccion.get(contador));
                    coleccion.remove(coleccion.get(contador));
                    contador -= 1;
                }
                contador += 1;
            }
        }

        return contactosConMayorEdad;
    }

    public ArrayList<Contacto> ordenadoDeMayorAMenorTelefono(ArrayList<Contacto> coleccion) {
        ArrayList<Contacto> contactosConMayorTelefono = new ArrayList<Contacto>();
        int telefonoMaximo = 0;
        int contador = 0;

        if(coleccion.size() > 0) {
            for(Contacto Telefono : coleccion) {
                if(Telefono.obtenerTelefono() > telefonoMaximo) {
                    telefonoMaximo = Telefono.obtenerTelefono();
                }
            }

            while(contador < coleccion.size()) {
                if(coleccion.get(contador).obtenerTelefono() == telefonoMaximo) {
                    contactosConMayorTelefono.add(coleccion.get(contador));
                    coleccion.remove(coleccion.get(contador));
                    contador -= 1;
                }
                contador += 1;
            }
        }

        return contactosConMayorTelefono;
    }

    /**
     * Ordena de mayor a menor edad los contactos y los muestra por pantalla.
     */
    public void contactosOrdenadosDeMayorAMenorEdad() {
        ArrayList<Contacto> contactosOrdenadosDeMayorAMenorPorEdad = new ArrayList<Contacto>(); 
        ArrayList<Contacto> copiaDeContactos = new ArrayList<Contacto>();

        if(contactos.size() > 0) {
            copiaDeContactos.addAll(contactos);
            while(copiaDeContactos.size() != 0) {
                contactosOrdenadosDeMayorAMenorPorEdad.addAll(ordenadoDeMayorAMenorPorEdad(copiaDeContactos));
            }

            for(Contacto Contacto : contactosOrdenadosDeMayorAMenorPorEdad) {
                System.out.println(Contacto.getContactoCompleto());
            }
        }
    }

    /**
     * Ordena de mayor a menor edad los contactos y los muestra por pantalla.
     */
    public void contactosOrdenadosDeMayorAMenorNumeroDeTelefono() {
        ArrayList<Contacto> contactosOrdenadosDeMayorAMenorTelefono = new ArrayList<Contacto>(); 
        ArrayList<Contacto> copiaDeContactos = new ArrayList<Contacto>();

        if(contactos.size() > 0) {
            copiaDeContactos.addAll(contactos);
            while(copiaDeContactos.size() != 0) {
                contactosOrdenadosDeMayorAMenorTelefono.addAll(ordenadoDeMayorAMenorTelefono(copiaDeContactos));
            }

            for(Contacto Contacto : contactosOrdenadosDeMayorAMenorTelefono) {
                System.out.println(Contacto.getContactoCompleto());
            }
        }
    }

    /**
     * Elimina los contactos que contengan el nombre del contacto
     * introducido por el usuario por parametro String
     */
    public void removeContacto(String contacto) {
        Iterator<Contacto> it = contactos.iterator();

        while(it.hasNext()) {
            if(it.next().obtenerNombre().contains(contacto)) {
                it.remove();
            }
        }
    }
}
