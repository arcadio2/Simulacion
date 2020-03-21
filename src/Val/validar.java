
package Val;


public class validar {
    
    public boolean validarnum(String cant){
        boolean a=true; 
        String nums="1234567890";
        for (int i = 0; i < cant.length(); i++) {
            for (int j = 0; j < nums.length(); j++) {
                if (cant.charAt(i)==nums.charAt(j)) {
                    a=false; 
                    break; 
                }
            }
        }  
        return a; 
    }
    
    public boolean valcant(int cant){
        boolean a=true; 
        
        if (cant>1000 || cant<10) {
            a=false; 
        }
        
       return a;  
    }
    
    
    
}
