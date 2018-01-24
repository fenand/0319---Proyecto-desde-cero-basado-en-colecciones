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
    private String telefono;
    //direccion de los contactos
    private String direccion;

    /**
     * Constructor for objects of class Agenda
     */
    public Contacto(String nombre,String telefono,String direccion)
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    /**
     * return nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Return the telefono.
     */
    public String getTelefono()
    {
        return telefono;
    }

    /**
     * Return the file direccion.
     */
    public String getDireccion()
    {
        return direccion;
    }

    /**
     * Return detalles contacto.
     */
    public String getContactoCompleto()
    {
        return "Nombre: "+ nombre + " Telefono: " + telefono + " Direccion: " + direccion ;
    }

}
