package money.tracker.app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class IncomeFragmentAdapter extends FragmentStateAdapter {
    public IncomeFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new PendingIncomeFragment();
        }
        return new RecievedIncomeFragement();

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
