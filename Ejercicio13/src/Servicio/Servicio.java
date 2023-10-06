/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Servicio {
    
    Curso curso = new Curso();
    
    public String[] cargarAlumnos(Curso curso){
        
        Scanner read = new Scanner(System.in);
        
        Curso cc = curso;
        
        String[] alumnos = new String[5];
        
        for (int i = 0; i < alumnos.length; i++) {
            
            System.out.println("Ingrese el nombre completo del alumno");
            alumnos[i] = read.nextLine();
            String e = alumnos[i];
            cc.setAlumno(alumnos);
            
        }
        // this piece of code was amde so as to print all the members of the course. But it is no longer needed as I created an Arra.toString() in the @override
//        for (int i = 0; i < alumnos.length; i++) { 
//            String e = alumnos[i];
//            System.out.println("Estudiante " + i + ": " + e);
//        }
        return alumnos;
    }
    
    public Curso crearCurso(Curso curso){

        Scanner read = new Scanner(System.in);
        
        Curso c1 = curso;
            
        System.out.println("Ingrese el nombre del curso");
        c1.setNombreCurso(read.next());

        System.out.println("Ingrese la cantidad de horas por dia");
        c1.setCantidadHorasPorDia(read.nextInt());

        System.out.println("Ingrese la cantidad de horas por semana");
        c1.setCantidadDiasPorSemana(read.nextInt());

        System.out.println("Ingrese la jornada del curso");
        c1.setTurno(read.next());

        System.out.println("Ingrese el precio del curso por hora");
        c1.setPrecioPorHora(read.nextInt()); 

        c1.setAlumno(cargarAlumnos(curso));
   
       
        return c1;
    }
    
    public double calcularGananciaSemanal(Curso curso){
        
        Curso c1 = curso;
               
        double gananciaDiurna = c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * c1.getAlumno().length * c1.getCantidadDiasPorSemana();
                     
        if (c1.getTurno().equalsIgnoreCase("Nocturno")) {
            double recargoNocturno = c1.getPrecioPorHora() * 0.35;
            double gananciasNocturna = gananciaDiurna + recargoNocturno;
            return gananciasNocturna;
        } else{
           gananciaDiurna = c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * c1.getAlumno().length * c1.getCantidadDiasPorSemana(); 
           return gananciaDiurna;
        }
    }
}
