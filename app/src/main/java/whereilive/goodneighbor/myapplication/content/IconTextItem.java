package whereilive.goodneighbor.myapplication.content;

/**
 * Created by Chris on 4/11/2015.
 */
public class IconTextItem {
    public String id;
    public int icon;
    public String content;

    public IconTextItem(String id, int icon, String content) {
        this.id = id;
        this.icon = icon;
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
