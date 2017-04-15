
package proyecto;

/*
 * @author Nestor M.Hernandez
 */
public class preguntas {
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
    
    public String pregunta(int i){
        return preguntas[i];
    }
    
    public String respuesta(int i){
        return respuestas[i];
    }
}
