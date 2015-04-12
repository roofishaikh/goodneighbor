package whereilive.goodneighbor.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import whereilive.goodneighbor.myapplication.adapter.IconTextArrayAdapter;
import whereilive.goodneighbor.myapplication.adapter.TwoColumnArrayAdapter;
import whereilive.goodneighbor.myapplication.content.IconTextItem;
import whereilive.goodneighbor.myapplication.content.TwoColumnItem;
import whereilive.goodneighbor.myapplication.dummy.DummyContent;

public class NeighborFragment extends Fragment implements AbsListView.OnItemClickListener {

    /**
     * The fragment's ListView/GridView.
     */
    private AbsListView mListView;

    /**
     * The Adapter which will be used to populate the ListView/GridView with
     * Views.
     */
    private ListAdapter mAdapter;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public NeighborFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Change Adapter to display your content
        ArrayList<TwoColumnItem> list = new ArrayList<TwoColumnItem>();
        list.add(new TwoColumnItem("1", "Today", "Anyone want to hit up concerts on Wednesday?"));
        list.add(new TwoColumnItem("2", "4/11", "Car pool?"));
        list.add(new TwoColumnItem("3", "4/10", "Dog park @ 10am"));
        mAdapter = new TwoColumnArrayAdapter(getActivity(), list);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_neighbor, container, false);

        // Set the adapter
        mListView = (AbsListView) view.findViewById(android.R.id.list);
        ((AdapterView<ListAdapter>) mListView).setAdapter(mAdapter);

        // Set OnItemClickListener so we can be notified on item clicks
        mListView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    /**
     * The default content for this Fragment has a TextView that is shown when
     * the list is empty. If you would like to change the text, call this method
     * to supply the text it should use.
     */
    public void setEmptyText(CharSequence emptyText) {
        View emptyView = mListView.getEmptyView();

        if (emptyView instanceof TextView) {
            ((TextView) emptyView).setText(emptyText);
        }
    }

}
