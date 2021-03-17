package core.methodScripts;

public class OctToDec {
    public int otdCore(String input){
        int result=0;
        StringBuilder iptStore=new StringBuilder();
        iptStore.append(input).reverse();
        
        for(int i=(iptStore.length()-1); i>=0; i--){
            result+=Character.getNumericValue(iptStore.charAt(i))*(int)Math.pow(8, i);
        }
        
        return result;
    }
}
