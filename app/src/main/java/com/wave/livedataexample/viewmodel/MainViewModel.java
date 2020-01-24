package com.wave.livedataexample.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.wave.livedataexample.model.Blog;
import com.wave.livedataexample.model.BlogRepository;

import java.util.List;

/**
 * Created on : Feb 26, 2019
 * Author     : AndroidWave
 */
public class MainViewModel extends AndroidViewModel {
	private BlogRepository movieRepository;

	public MainViewModel(@NonNull Application application) {
		super(application);
		movieRepository = new BlogRepository(application);
	}

	public LiveData<List<Blog>> getAllBlog() {
		return movieRepository.getMutableLiveData();
	}


}
