/**
 * Created by Leo.
 * User: Leo.fp
 * Date: 19/02/2018
 * Time: 7:57 PM
 */
public class FactoryPatternDI {

    private static FactoryPatternDI factory;
    private FactoryPatternDI() {}

    public static FactoryPatternDI getInstance() {
        if(factory == null)
            factory = new FactoryPatternDI();

        return factory;
    }

    public AccountService create(MailType type) {
        switch (type) {
            case GMAIL:
                return new AccountService(new GmailSenderImpl());

            case MAIL:
                return new AccountService(new MailSenderImpl());

            default:
                throw new RuntimeException();
        }
    }
}