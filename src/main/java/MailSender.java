public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        int client_id = mailInfo.getClient().getAge();
        System.out.print("Mail sent to " + Integer.toString(client_id) +
                " mail text: " + mailInfo.getMailCode().generateText());
    }
}
