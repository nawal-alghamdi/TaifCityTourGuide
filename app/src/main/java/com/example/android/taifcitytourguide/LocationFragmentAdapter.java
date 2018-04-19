package com.example.android.taifcitytourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link LocationFragmentAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Location} objects.
 */
public class LocationFragmentAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context context;

    /**
     * Create a new {@link LocationFragmentAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public LocationFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelFragment();
        }  else if (position == 1) {
            return new RestaurantFragment();
        }  else if (position == 2) {
            return new ParkFragment();
        } else {
            return new MallFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Return the page title.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.hotel);
        } else if (position == 1) {
            return context.getString(R.string.restaurant);
        } else if (position == 2) {
            return context.getString(R.string.park);
        } else {
            return context.getString(R.string.mall);
        }
    }

}
