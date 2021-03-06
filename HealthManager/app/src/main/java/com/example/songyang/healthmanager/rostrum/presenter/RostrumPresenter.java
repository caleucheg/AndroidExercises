package com.example.songyang.healthmanager.rostrum.presenter;

import com.example.songyang.healthmanager.rostrum.model.IRostrumModel;
import com.example.songyang.healthmanager.rostrum.model.RostrumModel;
import com.example.songyang.healthmanager.rostrum.view.IRostrumView;

import java.util.List;

/**
 * Created by SongYang on 2016/4/13.
 */
public class RostrumPresenter implements IRostrumPresenter {
    private IRostrumModel mRostrumModel;
    private IRostrumView mRostrumView;

    public RostrumPresenter(IRostrumView view) {
        mRostrumView = view;
        mRostrumModel = new RostrumModel();
    }

    @Override
    public void load() {
        List<String> rostrumData = mRostrumModel.getRostrumData();
        mRostrumView.setRostrumData(rostrumData);
    }
}
