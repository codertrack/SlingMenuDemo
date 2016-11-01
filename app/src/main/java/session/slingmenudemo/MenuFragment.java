package session.slingmenudemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by wukai on 16/11/1.
 */

public class MenuFragment extends Fragment {


	private ListView listView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		listView = new ListView(getActivity());
		listView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
		return listView;
	}


	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		listView.setVerticalScrollBarEnabled(false);

		listView.setAdapter(new BaseAdapter() {
			@Override
			public int getCount() {
				return 10;
			}

			@Override
			public Object getItem(int i) {
				return null;
			}

			@Override
			public long getItemId(int i) {
				return 0;
			}

			@Override
			public View getView(int i, View view, ViewGroup viewGroup) {

				TextView textView = new TextView(getActivity());

				textView.setText("postion"+i);
				textView.setGravity(Gravity.CENTER);
				textView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,200));

				return textView;
			}
		});

	}
}
