package whereilive.goodneighbor.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import whereilive.goodneighbor.myapplication.R;
import whereilive.goodneighbor.myapplication.content.IconTextItem;
import whereilive.goodneighbor.myapplication.content.MessageItem;

/**
 * Created by Chris on 4/11/2015.
 */
public class MessageArrayAdapter extends ArrayAdapter<MessageItem> {
    private final Context context;
    private final List<MessageItem> itemList;

    public MessageArrayAdapter(Context context, List<MessageItem> itemList) {
        super(context, R.layout.item_message, itemList);
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_message, parent, false);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.item_icon);
        imageView.setImageResource(itemList.get(position).icon);

        TextView senderView = (TextView) rowView.findViewById(R.id.item_sender);
        senderView.setText(itemList.get(position).sender);

        TextView dateView = (TextView) rowView.findViewById(R.id.item_date);
        dateView.setText(itemList.get(position).date);

        TextView subjectView = (TextView) rowView.findViewById(R.id.item_subject);
        subjectView.setText(itemList.get(position).subject);

        return rowView;
    }

}
