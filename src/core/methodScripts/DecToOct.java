package core.methodScripts;

/* Pasos para convertir
Nota: Los números que sean menores que o iguales a 7 se pasan tal cual son. En caso contrario seguir estos pasos

Paso 1: Dividir el número entre 8
Paso 2: Tomar el residuo
Paso 3: Repetir pasos 1 y 2 hasta que el cociente sea 0
Paso 4: Leer los números en orden inverso
 */

public class DecToOct {
    public String octConverter (int input){
        String output;
        
        if(input<=7){
            output=String.valueOf(input);
        } else {
            StringBuilder optBuilder=new StringBuilder();
            while (input/8!=0) {
                optBuilder.append(input%8);
                input=input/8;
            }
            optBuilder.append(input%8);
            output=optBuilder.reverse().toString();
        }
        return output;
    }
}
