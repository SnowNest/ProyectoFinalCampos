/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author nesto
 */
public class cuestionario {
    
    String [] preguntas = 
    { 
        "¿Capital de Mexico?",
        "¿Capital de Estados Unidos?",
        "¿Capital de Alemania?",
        "¿Capital de Francia?",
        "¿Capital de España?",
        "¿Capital de Italia?",
        "¿Capital de Argentina?",
        "¿Capital de Japon?",
        "¿Capital de Belgica?",
        "¿Capital de Peru?",
        "¿Capital de Hungria?",
        "¿Capital de Austria?",
        "¿Capital de Suecia?",
        "¿Capital de Venesuela?",
        "¿Capital de Clombia?",
    };
    
    String [] respuestas = 
    {
        "Ciudad de Mexico",
        "Washington D.C.",
        "Berlin",
        "Paris",
        "Madrid",
        "Roma",
        "Buenos Aires",
        "Tokio",
        "Bruselas",
        "Lima",
        "Budapest",
        "Viena",
        "Estocolmo",
        "Caracas",
        "Bogota",
    };
    
    public String mostrarPregunta(int i){
        return preguntas[i];
    }
    
}
