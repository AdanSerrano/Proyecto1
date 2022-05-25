package Listas;
public class Listas
{
	
    private Nodo primero;
    private Nodo ultimo;


    public Listas()
    {
        primero = null;
        ultimo = null;
    }

    public Nodo leerPrimero()
    {
        return primero;
    }


    public Listas agregarNodoALista(Object entrada)
    {
        Nodo nuevo ;
        nuevo = new Nodo(entrada);
        if (primero == null) {
            primero = nuevo;
            ultimo  = nuevo;
        }
        else
        {
            ultimo.enlace = nuevo;
        }
        ultimo = nuevo;
        return this;
    }


    public Listas insertarLista(Nodo anterior, Object entrada)
    {
        Nodo nuevo;

        nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;
        return this;
    }

    public void eliminar (Object entrada)
    {
        Nodo actual, anterior;
        //boolean encontrado;

        actual = primero;
        anterior = null;
        // encontrado = false;
        // Bucle de búsqueda
        while ((actual!= null) && !actual.dato.equals(entrada))
        {
            if (!actual.dato.equals(entrada))
            {
                anterior = actual;
                actual = actual.enlace;
            }
        }

        if (actual != null)  // se econtro
        {
            // Se distingue entre que el nod sea el cabecera
            // o del resto de la lista
            if (actual == primero)
            {
                primero = actual.enlace;
            }
            else
            {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }

    }

    public Nodo buscarLista(Object destino)
    //  destino: dato que se busca en la lista.
    {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace)
            if (indice.dato.equals(destino))
                return indice;
        return null;
    }


    public void visualizar()
    {
        Nodo n;
        n = primero;
        while (n != null)
        {
            System.out.print(n.dato + "  ");
            n = n.enlace;
        }
    }
}