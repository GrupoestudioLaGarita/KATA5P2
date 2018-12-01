package kata5p2.view;

import java.util.List;
import kata5p2.model.Histogram;

public class MailHistogramBuilder {
    
    public  static Histogram<String> build(List<String> mails){
        Histogram res = new Histogram();
        
        for (String mail: mails){
            res.increment(mail);
        }
        
        return res;
    }
}
