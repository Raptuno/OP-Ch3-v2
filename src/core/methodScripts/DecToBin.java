package core.methodScripts;

public class DecToBin {
    /* Pasos para convertir decimal a binario
    1. Dividir el número entre 2
    2. Obtener el cociente de la división
    3. Obtener el residuo de la división
    4. Repetir hasta que el cociente sea 0 (cero)
     */
    
    public int bitCalc(int input) { //Método para calcular tamaño de bits
        return (int)(Math.log(input)/Math.log(2)+1);
    }

    public String binConverter(int input){
        StringBuilder output=new StringBuilder();
        
        while (input/2!=0){
            output.append(input%2);
            input=input/2;
        }
        output.append(input%2);
        return output.reverse().toString();
    }
}
