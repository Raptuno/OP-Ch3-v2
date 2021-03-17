package core.methodScripts;

public class BinToDec {
    public int btdCore(String input){
        StringBuilder iptStore=new StringBuilder();
        iptStore.append(input).reverse();
        int result=0;
        
        for(int i=(iptStore.length()-1); i>=0; i--){
            result+=Character.getNumericValue(iptStore.charAt(i))*(int)Math.pow(2, i);
        }
        
        return result;
    }
}
