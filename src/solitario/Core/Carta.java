/*
 * Representa una carta, formada por un número y su palo correspondiente
 */
package solitario.Core;

public class Carta {

    private final int numero; // Final para quitar warnings (No se modifican los valores en ningún momento)
    private final Palos palo;
    private int ejeX;
    private final boolean posicion;

    public Carta(int numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
        posicion=true;
    }

    public int getNumero() {
        return this.numero; // por seguir el formato simplemente
    }

    public Palos getPalo() {
        return this.palo;
    }

    public int getEjeX() {
        return ejeX;
    }

    public boolean isPosicion() {
        return posicion;
    }
    

    @Override //toString() es un método que se está reescribiendo 
    public String toString() {

        StringBuilder toret = new StringBuilder();
        
        // Asignamos una inical a cada palo para que luego en mesa quede todo del mismo tamaño
        char inicial;
        switch(this.palo){
            case OROS: inicial = 'O'; break;
            case ESPADAS: inicial = 'E'; break;
            case BASTOS: inicial = 'B'; break;
            case COPAS: inicial = 'C'; break;
            default: inicial = '-';
        }
        
        // Formato número de 2 espacios para que en mesa quede todo del mismo tamaño.
        // Quito salto línea para que no aparezcan todas en pila ( representación mesa mas fácil) , cambio el get. por this. (acceso directo al atributo, más eficiente)
        toret.append("[").append(String.format("%2d",this.numero)).append("|").append(inicial).append("]"); 

        return toret.toString();
    }

}