package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona persona = new Persona();
        persona.setEdad((byte) 33);
        persona.setNombre("Renzo Santillán");
        persona.setTelefono("993297151");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Telefono: "+persona.getTelefono());
    }
}
