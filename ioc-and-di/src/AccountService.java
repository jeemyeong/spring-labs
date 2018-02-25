/**
 * Created by Leo.
 * User: Leo.fp
 * Date: 19/02/2018
 * Time: 7:47 PM
 */
public class AccountService {

    private EmailSender emailSender;

    public AccountService() {
        emailSender = new GmailSenderImpl();
    }

    public AccountService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void newAccount(String user) {
        System.out.println(user + "님이 회원가입 하셨습니다.");
        emailSender.sender(user + "회원가입 완료");
    }
}