

/**
 * The test class AgendaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AgendaTest2
{
    /**
     * Default constructor for test class AgendaTest
     */
    public AgendaTest2()
    {
    }

    public void Test()
    {
        Agenda agenda1 = new Agenda(1); 

        agenda1.addContactos("laura", 19,"era1", 53456435);
        agenda1.addContactos("Fernando2", 18,"era1", 1034563456);
        agenda1.addContactos("Fernando3", 11,"era1", 206456);
        agenda1.addContactos("Fernando4", 35,"era1", 256456345);
        agenda1.addContactos("Fernando5", 77,"era1", 3435645);
        System.out.println("Todos los contactos: ");
        agenda1.mostrasContactos();
        System.out.println();

        System.out.println("Mostramos los contactos ordenados de mayor a menor edad:");
        agenda1.contactosOrdenadosDeMayorAMenorEdad();
        System.out.println();

        System.out.println("Mostramos los contactos ordenados de mayor a menor telefono:");
        agenda1.contactosOrdenadosDeMayorAMenorNumeroDeTelefono();
        System.out.println();

        System.out.println();

        System.out.println("Eliminamos el contacto que contenga el nombre indicado por parametro .");
        agenda1.removeContacto("laura");
        System.out.println();

        System.out.println("Mostramos todos los contactos:");
        agenda1.mostrasContactos();
    }

}
