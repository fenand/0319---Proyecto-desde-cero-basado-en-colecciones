import java.util.ArrayList;
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
    public void addContactos(String nombre, int telefono,String direccion)
    {
        contactos.add(new Contacto(nombre,telefono,direccion));
    }

    /**
     * metodo que devuelve el id del contacto
     */
    public int getId()
    {
        return id;
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

    // /**
     // * metodo Permita mostrar un listado ordenado de los objetos en función de una de sus características, 
     // */
    // public void ordenarPorNombre()
    // {
    
    // }
    // public ArrayList<Contacto> localizaMayorLoImprimeYLoBorra(ArrayList<Contacto> coleccion)
    // {
    
    // }
}
