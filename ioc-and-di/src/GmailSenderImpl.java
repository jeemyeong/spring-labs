/**
 * Created by Leo.
 * User: Leo.fp
 * Date: 19/02/2018
 * Time: 7:51 PM
 */

public class GmailSenderImpl implements EmailSender {
    public void sender(String msg) {
        System.out.println("Gmail : " + msg);
    }
}