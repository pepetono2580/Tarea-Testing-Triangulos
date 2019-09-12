package com.mayab.calidad.tareas.Triangulos;

/**
 * Hello world!
 *
 */
public class App 
{
    public String triangulos(int l1, int l2, int l3) {
    	if(l1 > 0 || l2 > 0 || l3 > 0) {
    		if(l1 == l2 && l2 == l3) {
    			return "Equilatero";
    		}else if(l1 == l2 && l2 != l3) {
    			return "Isoceles";
    		}else if(l1 != l2 && l2 != l3) {
    			return "Escaleno";
    		}
    	}
    	return "No es un triangulo";
    }
}
