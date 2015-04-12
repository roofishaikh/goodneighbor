package whereilive.goodneighbor.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import whereilive.goodneighbor.myapplication.R;
import whereilive.goodneighbor.myapplication.content.IconTextItem;

/**
 * Created by Chris on 4/11/2015.
 */
public class IconTextArrayAdapter extends ArrayAdapter<IconTextItem> {
    private final Context context;
    private final List<IconTextItem> itemList;

    public IconTextArrayAdapter(Context context, List<IconTextItem> itemList) {
        super(context, R.layout.item_icon_text, itemList);
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_icon_text, parent, false);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.item_icon);
        imageView.setImageResource(itemList.get(position).icon);
        TextView contentView = (TextView) rowView.findViewById(R.id.item_content);
        contentView.setText(itemList.get(position).content);
        return rowView;
    }

}
