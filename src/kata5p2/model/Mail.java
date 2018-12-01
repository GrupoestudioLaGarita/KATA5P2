package kata5p2.model;

public class Mail {

    String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        return mail.substring(mail.lastIndexOf('@')+1, mail.lastIndexOf('.'));
    }
}
