package ru.penza.aabr.deviceinfo.criminalIntent;

import androidx.fragment.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
        //return new FragmentCrime();
    }
}
