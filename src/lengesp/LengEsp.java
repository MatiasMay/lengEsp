/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lengesp;

/**
 *
 * @author julia
 */
public class LengEsp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            prEsp leng =new prEsp(System.in);
            leng.probar();
        } catch(TokenMgrError e){
            //Error lexico
            System.out.println("Error lexico: " + e.getMessage());
        }
        catch(ParseException e){
            //Error sintactico
            System.out.println("Error sintactico: " + e.getMessage());
    }
    }
    
}
