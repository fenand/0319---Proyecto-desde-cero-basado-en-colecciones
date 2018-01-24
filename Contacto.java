import java.util.ArrayList;

/**
 * Write a description of class Agenda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contacto
{
    //nombre de los contactos
    private String nombre;
    //numero de telefono de los contacto
    private int telefono;
    //direccion de los contactos
    private String direccion;

    /**
     * Constructor for objects of class Agenda
     */
    public Contacto(String nombre,int telefono,String direccion)
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    /**
     * Return detalles contacto.
     */
    public String getContactoCompleto()
    {
        return "Nombre: "+ nombre + " Telefono: " + telefono + " Direccion: " + direccion ;
    }

    
}
