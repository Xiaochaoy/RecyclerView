package com.company.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();


    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio(){
        elementos.add(new Elemento(R.drawable.kaisa,"Kaisa", "Es tu abuela"));
        elementos.add(new Elemento(R.drawable.ahri,"Ahri", "Es tu novia"));
        elementos.add(new Elemento(R.drawable.ezreal,"Ezreal", "Es tu novio"));
    }

    List<Elemento> obtener() {
        return elementos;
    }

    void insertar(Elemento elemento, Callback callback){
        elementos.add(elemento);
        callback.cuandoFinalice(elementos);
    }

    void eliminar(Elemento elemento, Callback callback) {
        elementos.remove(elemento);
        callback.cuandoFinalice(elementos);
    }

    void actualizar(Elemento elemento, float valoracion, Callback callback) {
        elemento.valoracion = valoracion;
        callback.cuandoFinalice(elementos);
    }
}
