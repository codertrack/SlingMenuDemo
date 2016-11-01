package session.slingmenudemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import session.slidnglibrary.SlidingMenu;
import session.slidnglibrary.app.SlidingFragmentActivity;

public class SldingMenuDemoActivity extends SlidingFragmentActivity {


	private MenuFragment mFrag;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slding_menu_demo);

		//设置我们背后菜单的布局
		setBehindContentView(R.layout.menu_frame);

		//我们需要初始化fragment
		FragmentTransaction t = this.getSupportFragmentManager().beginTransaction();
		mFrag = new MenuFragment();
		t.replace(R.id.menu_frame, mFrag);
		t.commit();


		SlidingMenu sm = getSlidingMenu();
		sm.setShadowWidthRes(R.dimen.shadow_width);
		//sm.setShadowDrawable(R.drawable.shadow);
		sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		sm.setFadeDegree(0.35f);
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

	}


}
