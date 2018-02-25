/**
 * Created by Leo.
 * User: Leo.fp
 * Date: 19/02/2018
 * Time: 7:52 PM
 */
public class MailSenderImpl implements EmailSender {
    public void sender(String msg) {
        System.out.println("Mail : " + msg);
    }
}
