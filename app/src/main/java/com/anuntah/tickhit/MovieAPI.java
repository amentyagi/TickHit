package com.anuntah.tickhit;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface MovieAPI {

    @GET("movie/popular?api_key=4b4e67d5132e642d0f6bfc206d5e28d0&page=1")
    Call<Movie_testclass> getPopularMovieList();

    @GET("https://api.themoviedb.org/3/movie/{movie_id}?api_key=4b4e67d5132e642d0f6bfc206d5e28d0&language=en-US&append_to_response=videos")
    Call<Movie> getMovieDetail(@Path("movie_id")int id);

    @GET("movie/now_playing?api_key=4b4e67d5132e642d0f6bfc206d5e28d0&language=en-US&page=1&region=IN")
    Call<Movie_testclass> getNowShowing();

    @GET("movie/upcoming?api_key=4b4e67d5132e642d0f6bfc206d5e28d0")
    Call<Movie_testclass> getUpcomingMovieList(@QueryMap Map<String, String> pop);

    @GET("movie/{movie_id}/videos?api_key=4b4e67d5132e642d0f6bfc206d5e28d0")
    Call<com.anuntah.tickhit.TrailersTestClass> getTrailerList(@Path("movie_id")String id);

    @GET("movie/top_rated?api_key=4b4e67d5132e642d0f6bfc206d5e28d0&page=1")
    Call<Movie_testclass> getTopRated();

    @GET("authentication/token/new?api_key=4b4e67d5132e642d0f6bfc206d5e28d0")
    Call<com.anuntah.tickhit.RequestToken> getRequestToken();
    @GET("authentication/session/new?api_key=4b4e67d5132e642d0f6bfc206d5e28d0")
    Call<com.anuntah.tickhit.SessionId> getSessionId(@Query("request_token") String req);

}
