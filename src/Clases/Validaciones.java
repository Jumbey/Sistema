
package Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author NETO
 */
public class Validaciones {
    
    public boolean validarCorreo(String correo) {
        
        if (correo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de correo electrónico no puede quedar en blanco.","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        // Patrón regex para validar un correo electrónico
        String patronCorreo = "[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{2,5}";

        // Compilar el patrón en un objeto Pattern
        Pattern pattern = Pattern.compile(patronCorreo);

        // Crear un objeto Matcher para la cadena de correo y el patrón
        Matcher matcher = pattern.matcher(correo);
        
        if(matcher.matches()){
            
            return true;
        }else{
             JOptionPane.showMessageDialog(null, "El formato del correo electrónico es incorrecto. \nPor favor, ingrese una dirección válida.","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       
    }
    
      public boolean validarNombre(String nombre) {
        // Verificar si el nombre está vacío
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo nombre o apellido no pueden estar vacios","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Verificar si el nombre contiene números o caracteres especiales (excluyendo letras y espacios)
        Pattern patron = Pattern.compile("^[a-zA-Z\\s]+$");
        Matcher matcher = patron.matcher(nombre);
        
        if(matcher.matches()){
             return true;
        }else{
            
            JOptionPane.showMessageDialog(null, "El nombre no puede contener numeros ni caracteres especiales","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
    }
      
    public boolean validarNumero(String numero){
        
         numero = numero.replaceAll("\\s+", "").replaceAll("-", "");
       
        if(numero.length() != 8){
            JOptionPane.showMessageDialog(null, "El número de teléfono no esta completo","Error", JOptionPane.ERROR_MESSAGE);
           return false;
        }else{
            return true;
        }
    }
    
    public boolean validarNumeroLicencia(String numero){
        
         numero = numero.replaceAll("\\s+", "").replaceAll("-", "");
       
        if(numero.length() != 14){
            JOptionPane.showMessageDialog(null, "El número de licencia no esta completo" ,"Error",  JOptionPane.ERROR_MESSAGE);
           return false;
        }else{
            return true;
        }
    }
    
    public boolean validarContraseña(String contraseña){
    
          if (contraseña.length() < 8) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!contieneMayuscula(contraseña)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra mayúscula.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!contieneMinuscula(contraseña)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra minúscula.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!contieneNumero(contraseña)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos un número.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
    }
}
    
private boolean contieneMayuscula(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean contieneMinuscula(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean contieneNumero(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}

