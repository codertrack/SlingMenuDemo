package session.slingmenudemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import session.slidnglibrary.SlidingMenu;
import session.slidnglibrary.app.SlidingFragmentActivity;

public class SldingMenuDemoActivity extends SlidingFragmentActivity {


	private MenuFragment mFrag;

	SlidingMenu sm=null;
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



		//获取SlidingMenu对象
		sm = getSlidingMenu();
		//设置阴影宽度
		sm.setShadowWidthRes(R.dimen.shadow_width);
		//sm.setShadowDrawable(R.drawable.shadow);
		sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		sm.setFadeDegree(0.35f);

		//全屏开始触摸
		//sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

		//从内容区域触摸有效
		sm.setTouchModeAbove(SlidingMenu.SLIDING_CONTENT);

	}

	private boolean opened = false;

	public void openAndclose(View view) {
		sm.toggle();
		opened = !opened;
	}
}
