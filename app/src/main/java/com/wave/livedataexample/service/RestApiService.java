package com.wave.livedataexample.service;

import com.wave.livedataexample.model.BlogWrapper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created on : Feb 25, 2019
 * Author     : AndroidWave
 */
public interface RestApiService {


	@GET("cgzNBZDlwy")
	Call<BlogWrapper> getPopularBlog(@Query("indent") String indent);

}
