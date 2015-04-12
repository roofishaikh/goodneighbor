package whereilive.goodneighbor.myapplication.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import whereilive.goodneighbor.myapplication.R;
import whereilive.goodneighbor.myapplication.content.TwoColumnItem;

/**
 * Created by Chris on 4/11/2015.
 */
public class DateLinkArrayAdapter extends ArrayAdapter<TwoColumnItem> {
    private final Context context;
    private final List<TwoColumnItem> itemList;

    public DateLinkArrayAdapter(Context context, List<TwoColumnItem> itemList) {
        super(context, R.layout.item_date_link, itemList);
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_date_link, parent, false);
        TextView dateView = (TextView) rowView.findViewById(R.id.item_date);
        dateView.setText(itemList.get(position).date);
        TextView contentView = (TextView) rowView.findViewById(R.id.item_content);
        contentView.setText(itemList.get(position).content);
        contentView.setPaintFlags(contentView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        return rowView;
    }

}
