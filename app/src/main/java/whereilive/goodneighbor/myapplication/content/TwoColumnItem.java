package whereilive.goodneighbor.myapplication.content;

/**
 * Created by Chris on 4/11/2015.
 */
public class TwoColumnItem {
    public String id;
    public String date;
    public String content;

    public TwoColumnItem(String id, String date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
