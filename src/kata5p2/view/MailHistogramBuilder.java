package kata5p2.view;

import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;

public class MailHistogramBuilder {
    
    public  static Histogram<String> build(List<Mail> mails){
        Histogram res = new Histogram();
        
        for (Mail mail: mails){
            res.increment(mail.getDomain());
        }
        
        return res;
    }
}
