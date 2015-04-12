package whereilive.goodneighbor.myapplication.content;

/**
 * Created by Chris on 4/11/2015.
 */
public class MessageItem {
    public String id;
    public int icon;
    public String sender;
    public String date;
    public String subject;

    public MessageItem(String id, int icon, String sender, String date, String subject) {
        this.id = id;
        this.icon = icon;
        this.sender = sender;
        this.date = date;
        this.subject = subject;
    }

}
