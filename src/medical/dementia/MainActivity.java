package medical.dementia;



import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private ViewPager mViewPager;
	ArrayList<View> viewList;
	private FingerPaintView			fingerPaintView				= null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		getLayoutInflater();
		LayoutInflater mInflater = LayoutInflater.from(this);

		View vLogin = mInflater.inflate(R.layout.login, null);
		View vPerson = mInflater.inflate(R.layout.person, null);
		View vSequence = mInflater.inflate(R.layout.sequence, null);
		View vCube = mInflater.inflate(R.layout.cube, null);
		View vClock = mInflater.inflate(R.layout.clock, null);
		View vName = mInflater.inflate(R.layout.name, null);
		View vMemory = mInflater.inflate(R.layout.memory, null);
		View vAttention = mInflater.inflate(R.layout.attention, null);
		View vLanguage = mInflater.inflate(R.layout.lanuage, null);
		View vAbstraction = mInflater.inflate(R.layout.abstraction, null);
		View vLocation = mInflater.inflate(R.layout.location, null);

		viewList = new ArrayList<View>();
		viewList.add(vLogin);
		viewList.add(vPerson);
		viewList.add(vSequence);
		viewList.add(vCube);
		viewList.add(vClock);
		viewList.add(vName);
		viewList.add(vMemory);
		viewList.add(vAttention);
		viewList.add(vLanguage);
		viewList.add(vAbstraction);
		viewList.add(vLocation);
//		fingerPaintView = (FingerPaintView) vSequence.findViewById(R.id.fingerPaintView1);
//		fingerPaintView.setVisibility(View.VISIBLE);
//		fingerPaintView.setIsCapturing(true);
		mViewPager = (ViewPager) findViewById(R.id.viewpager);
		mViewPager.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				return true;
			}

		});
		mViewPager.setCurrentItem(0);

		PagerAdapter pagerAdapter = new PagerAdapter() {

			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return viewList.size();
			}

			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				// TODO Auto-generated method stub
				return arg0 == arg1;
			}

			@Override
			public void destroyItem(ViewGroup container, int position,
					Object object) {
				container.removeView(viewList.get(position));
			}

			@Override
			public int getItemPosition(Object object) {
				return super.getItemPosition(object);
			}

			@Override
			public Object instantiateItem(ViewGroup container, int position) {
				container.addView(viewList.get(position));
				return viewList.get(position);
			}

		};

		mViewPager.setAdapter(pagerAdapter);

		// ** Login button **/
		Button btnLogin = (Button) vLogin.findViewById(R.id.buttonLogin);
		btnLogin.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				mViewPager.setCurrentItem(1, true);
				// Toast.makeText(getApplicationContext(), "click",
				// Toast.LENGTH_SHORT).show();
			}
		});

		Button btnCancel = (Button) vLogin.findViewById(R.id.buttonCancel);
		btnCancel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MainActivity.this.finish();
			}
		});

		// ** Person button **/
		Button btnPersonOK = (Button) vPerson.findViewById(R.id.buttonPOK);
		btnPersonOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(2, true);
			}
		});

		Button btnPersonCancel = (Button) vPerson
				.findViewById(R.id.buttonPCancel);
		btnPersonCancel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MainActivity.this.finish();
			}
		});

		// ** Sequence button **/
		Button btnSequenceOK = (Button) vSequence
				.findViewById(R.id.buttonSequenceRight);
		btnSequenceOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(3, true);
			}
		});

		Button btnSequenceErr = (Button) vSequence
				.findViewById(R.id.buttonSequenceErr);
		btnSequenceErr.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(3, true);
			}
		});

		// ** Cube button **/
		Button btnCubeOK = (Button) vCube.findViewById(R.id.buttonCubeRight);
		btnCubeOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(4, true);
			}
		});

		Button btnCubeErr = (Button) vCube.findViewById(R.id.buttonCubeErr);
		btnCubeErr.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(4, true);
			}
		});

		// ** Clock button **/
		Button btnClockOK = (Button) vClock.findViewById(R.id.buttonClockRight);
		btnClockOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(5, true);
			}
		});

		Button btnClockErr = (Button) vClock.findViewById(R.id.buttonClockErr);
		btnClockErr.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(5, true);
			}
		});

		// ** Name button **/
		Button btnNameOK = (Button) vName.findViewById(R.id.buttonNameOK);
		btnNameOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(6, true);
			}
		});

		// ** Memory button **/
		Button btnMemoryOK = (Button) vMemory.findViewById(R.id.buttonMemoryOK);
		btnMemoryOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(7, true);
			}
		});

		// ** Attention button **/
		Button btnAttentionOK = (Button) vAttention
				.findViewById(R.id.buttonAttentionOK);
		btnAttentionOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(8, true);
			}
		});

		// ** Language button **/
		Button btnLanguageOK = (Button) vLanguage
				.findViewById(R.id.buttonLanguageOK);
		btnLanguageOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(9, true);
			}
		});

		// ** Abstraction button **/
		Button btnAbstractionOK = (Button) vAbstraction
				.findViewById(R.id.buttonAbstractionOK);
		btnAbstractionOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(10, true);
			}
		});

		// ** Abstraction button **/
		Button btnLocationOK = (Button) vLocation
				.findViewById(R.id.buttonLocationOK);
		btnLocationOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewPager.setCurrentItem(0, true);
			}
		});

	}
}
