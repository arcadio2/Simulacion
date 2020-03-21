package simulacion;
import java.lang.Math; 
import java.awt.Image;
import javax.swing.ImageIcon;

public class personas {
    
    public String random(){
        String a="/imagenes/fin1.png"; 
        String b="/imagenes/fin2.png";
        String c="/imagenes/fin1.png";
        String d="/imagenes/fin1.png";
        String e="/imagenes/fin2.png";
        String f="/imagenes/fin2.png";
        String[] img={a,b,c,d,e,f};
        int numal=(int) (Math.random()*5); 
        return img[numal];  
    }
    
    
    
}
