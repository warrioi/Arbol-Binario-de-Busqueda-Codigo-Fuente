import abb.ArbolBinarioBusqueda;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        //elementos
        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);



        //mostramos7recorremos los elemtos del arbol inOrden
        abb.InOrden();
        //elementos
        abb.insertar(8);
        abb.insertar(11);
        abb.insertar(21);
        abb.InOrden();

    }
}
