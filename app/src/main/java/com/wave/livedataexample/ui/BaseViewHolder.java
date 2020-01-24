package com.wave.livedataexample.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created on : Feb 26, 2019
 * Author     : AndroidWave
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    private int mCurrentPosition;

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    protected abstract void clear();

    public void onBind(int position) {
        mCurrentPosition = position;
        clear();
    }

    public int getCurrentPosition() {
        return mCurrentPosition;
    }
}
