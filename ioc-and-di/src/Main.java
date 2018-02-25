public class Main {

    public static void main(String[] args) {
        /**
         * setter method 또는 생성자 주입 사용은 AccountService와 EmailSender에 의존을 줄이지만
         * JavaDI 클래스가 주입하는 주체가 되기 때문에 JavaDI와 의존가 생긴다.
         */
//        AccountService mailAccount = new AccountService();
//        // mailAccount = new AccountService(new MailSenderImpl());
//        mailAccount.setEmailSender(new MailSenderImpl());
//        mailAccount.newAccount("woniper");
        AccountService gmailAccount = FactoryPatternDI.getInstance().create(MailType.GMAIL);
        gmailAccount.newAccount("woniper");
    }
}
