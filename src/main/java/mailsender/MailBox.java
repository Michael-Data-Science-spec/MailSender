package mailsender;

import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> infos;
    private MailSender mailSender = new MailSender();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo info : infos ) {
            mailSender.sendMail(info);
        }
    }
}