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
    public void addContactos(String nombre, String telefono,String direccion)
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

}
