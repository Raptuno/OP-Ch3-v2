package core;
import core.methodScripts.*;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        DecToBin dtb=new DecToBin();
        DecToOct dto=new DecToOct();
        BinToDec btd=new BinToDec();
        OctToDec otd=new OctToDec();
        HexToDec htd=new HexToDec();
        
        CoreScript cs=new CoreScript();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingrese un número: ");
        String input=br.readLine();
        
        System.out.print("A qué sistema desea convertir? ");
    
        switch (br.readLine().toLowerCase()) {
            case "binario" -> cs.runner(dtb.binConverter(Integer.parseInt(input)));
            case "octal" -> cs.runner(dto.octConverter(Integer.parseInt(input)));
            case "decimal" -> {
                System.out.print("¿Desde qué sistema quiere convertir? ");
                switch (br.readLine().toLowerCase()) {
                    case "binario" -> cs.runner(String.valueOf(btd.btdCore(input)));
                    case "octal" -> cs.runner(String.valueOf(otd.otdCore(input)));
                    case "hexadecimal" -> cs.runner(String.valueOf(htd.hexConverter(input)));
                }
            }
        }
    }
}
