package ProcessClass;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class InputandOutputStream
{
    public static void main(String args[]) throws IOException, InterruptedException
        {
        try{
        
        Runtime rt=Runtime.getRuntime();//Line A
        Process Ispro=rt.exec("notepad.exe");//Line B
        InputStream in= (InputStream) Ispro.getInputStream();//Line C
        Ispro.destroy();//Line D
        System.out.println(Ispro.exitValue());//Line E
    
        
        }
        catch (Exception ex) {
            ex.printStackTrace();
         }
        try{
            
            Runtime rt=Runtime.getRuntime();//Line F
            Process pro=rt.exec("notepad.exe");// Line G
            OutputStream out= (OutputStream)pro.getOutputStream();//Line H
            System.out.println("good");
            System.out.println("bad");
            out.close();
            }
        catch (Exception ex) {
            ex.printStackTrace();
         }
        
        
    }
}