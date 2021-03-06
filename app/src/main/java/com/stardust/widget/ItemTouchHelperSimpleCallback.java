package com.stardust.widget;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by Stardust on 2017/4/6.
 */

public class ItemTouchHelperSimpleCallback extends ItemTouchHelper.SimpleCallback {

    private boolean mLongPressDragEnabled, mItemViewSwipeEnabled;

    public ItemTouchHelperSimpleCallback(int dragDirs, int swipeDirs) {
        super(dragDirs, swipeDirs);
        mItemViewSwipeEnabled = swipeDirs != 0;
        mLongPressDragEnabled = dragDirs != 0;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

    }

    @Override
    public boolean isLongPressDragEnabled() {
        return mLongPressDragEnabled;
    }

    @Override
    public boolean isItemViewSwipeEnabled() {
        return mItemViewSwipeEnabled;
    }
}
