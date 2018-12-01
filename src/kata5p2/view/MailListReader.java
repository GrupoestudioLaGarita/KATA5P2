package kata5p2.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kata5p2.model.Mail;

public class MailListReader {

    public static List<Mail> Read(String filename) {
        List<Mail> lista = new LinkedList<>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(filename));
            String s;

            while ((s = bf.readLine()) != null) {

                lista.add(new Mail(s));

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MailListReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MailListReader.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
}
