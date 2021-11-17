package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    /*
    Arbol esta vacio o no
    */
    public boolean estaVacio() {
        return raiz == null;
    }

    /*
    Metodo recursivo para insertar un nodo a nuestro abb
   */
    private void insertar(Nodo padre, Nodo hijo, int dato) {
        if (hijo == null) {
            Nodo nuevo = new Nodo(null, dato, null);
            if (dato >= padre.getDato()) {
                padre.setDerecho(nuevo);
            } else {
                padre.setIzquierdo(nuevo);
            }
        } else {
            if (dato >= padre.getDato()) {
                insertar(hijo, hijo.getDerecho(), dato);
            } else {
                insertar(hijo, hijo.getIzquierdo(), dato);
            }
        }
    }

    /*
    Metodoo auxiliar para insertar un nuevo nodo al abb
     */
    public void insertar(int dato) {
        if (estaVacio()){
            Nodo nuevo = new Nodo(null,dato,null);
            raiz = nuevo;
        }else{
            if (dato>= raiz.getDato()){
                insertar(raiz,raiz.getDerecho(),dato);
            }else {
                insertar(raiz,raiz.getIzquierdo(),dato);
            }
        }
    }
    /*
    Metodo recursivo para recorer o mostrar el arbol inOrden
     */
    private void mostrarInOrden(Nodo nodo){
        if (nodo==null){

        }else {
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + "  ");
            mostrarInOrden(nodo.getDerecho());
        }
    }
    /*
    Metodo auxiliar para recorer o mostrar el arbol inOrden
     */
    public  void InOrden(){
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
}