package kata5p2.main;


import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReader;

public class Kata5P2 {

    public static void main(String[] args) {
        Kata5P2 kata = new Kata5P2();
        kata.execute();
    }
    
    String fileName;
    List<Mail> mailList;
    Histogram histogram;
    
    private void execute(){
        input();
        process();
        output();
    }
    
    private void input(){
        fileName = "email.txt";
        mailList = MailListReader.Read(fileName);
    }
    
    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }

}
