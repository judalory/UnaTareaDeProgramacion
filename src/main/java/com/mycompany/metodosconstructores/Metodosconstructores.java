package com.mycompany.metodosconstructores;
import javax.swing.JOptionPane;
public class Metodosconstructores {
    public static void main(String[] args) {
        Persona persona1 = new Persona(JOptionPane.showInputDialog("nombre por favor"), Integer.parseInt(JOptionPane.showInputDialog("edad por favor")));
        System.out.println(persona1.saludar());
        Calculadora calc = new Calculadora();
        int resultadoSuma = calc.sumar(Integer.parseInt(JOptionPane.showInputDialog("primer número por favor")), Integer.parseInt(JOptionPane.showInputDialog("segundo número por favor")));
        System.out.println("Suma: " + resultadoSuma);
        Libro libro1 = new Libro("La metamorfosis", "Franz Kafka", 1915);
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año de Publicación: " + libro1.getAnioPublicacion());
    }
}
