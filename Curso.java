package com.arreglos.arreglosObjetos;
import java.util.Random;
import java.util.Scanner;
 
public class Curso {

    //CANGO


    Scanner sc = new Scanner(System.in);
    private String nombre;
    private int capacidadMaxima;
    private int inscritos;
 
    public Curso(String nombre, int inscritos) {
        this.nombre = nombre;
 
        Random random = new Random();
        this.capacidadMaxima = random.nextInt(16) + 20; 
 
        if (inscritos > capacidadMaxima) {
            System.out.println("El número de alumnos no puede exceder a "
                    + capacidadMaxima);
            this.inscritos = capacidadMaxima;
        } else {
            this.inscritos = inscritos;
        }
    }
 

    
    public static void main(String[] args) {
        Curso [] sucursalA = {new Curso("Matemaricas", 18),
        new Curso("Fisica", 25),
        new Curso("Quimica", 20)
        } ;


        Curso [] sucursalB = {new Curso("Matemaricas", 32),
        new Curso("Fisica", 15),
        new Curso("Quimica", 28),
        new Curso("Bioligia", 32),
        new Curso("Historia", 32),
        new Curso("Geografia", 32)
    };
        

        Curso [] sucursalC = {new Curso("Literaura", 18),
        new Curso("Artes", 25),
        new Curso("Botanica", 20),
        new Curso("Pregamacion" , 34)
        };



        for(int i=0 ; i<Curso.length;i++){
            for(int j=0 ; j<Curso[i].length;j++){
            System.out.println(Curso[i][j]);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
 
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
 
    public int getInscritos() {
        return inscritos;
    }
 
    @Override
    public String toString() {
        return "Curso: " + nombre +
                ", Inscritos: " + inscritos +
                ", Capacidad Máxima: " + capacidadMaxima;
    }

    
}
