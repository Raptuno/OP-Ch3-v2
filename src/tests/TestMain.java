package tests;
import core.methodScripts.BinToDec;
import core.methodScripts.HexToDec;
import core.methodScripts.OctToDec;

import java.io.*;

public class TestMain {
    public static void main (String[] args){
        char pst='A';
        int value=10;
        
        while (value<=15){
            System.out.println(pst+"="+value);
            pst++;
            value++;
        }
    
        String ipt="3721";
        HexToDec htd=new HexToDec();
        BinToDec btd=new BinToDec();
        OctToDec otd=new OctToDec();
        System.out.println("Conversión de "+ipt+" a decimal: "+otd.otdCore(ipt));
    }
}
