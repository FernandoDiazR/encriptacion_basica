
package projecttest;
import java.util.Random;

public class Funciones {
    
    Random r=new Random();
    String abc="AÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚÜVWXYZ0123456789\\\"()¿¡?!:.";
    String pal="", enig="";
    int[] encripted;
    int key;
    
    
    public void encriptar() {
        key = r.nextInt(abc.length()) + 1;
        for (int i = 0; i < pal.length(); i++) {
            switch (encripted[i]) {
                case -1:
                    enig += " ";
                    break;
                case -2:
                    enig += ",";
                    break;
                case -3:
                    enig += ";";
                    break;
                case -4:
                    enig += "\n";
                    break;
                default:
                    int y = (encripted[i] + key) % abc.length();
                    enig += abc.charAt(y);
            }
        }
        Ventana.jTextArea1.setText(enig);
        Ventana.jTextField1.setText(String.valueOf(key));
        Ventana.jTextField2.setText("Clave");
        enig="";
    }
    
    public void desencriptar(int k) {
        key = k;
        for (int i = 0; i < pal.length(); i++) {
            switch (encripted[i]) {
                case -1:
                    enig += " ";
                    break;
                case -2:
                    enig += ",";
                    break;
                case -3:
                    enig += ";";
                    break;
                case -4:
                    enig += "\n";
                    break;
                default:
                    int y = (encripted[i] - key) % abc.length();
                    if (y < 0) {
                        y = abc.length() + (encripted[i] - key);
                    }
                    enig += abc.charAt(y);
            }
        }
        Ventana.jTextArea1.setText(enig);
        Ventana.jTextField1.setText("Clave");
        Ventana.jTextField2.setText("Clave");
        enig="";
    }
    
    public void limpiar(){
        Ventana.jTextArea1.setText("");
        Ventana.jTextField1.setText("Clave");
        Ventana.jTextField2.setText("Clave");
    }
}
