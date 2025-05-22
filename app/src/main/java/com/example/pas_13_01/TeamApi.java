package com.example.pas_13_01;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;


public interface TeamApi {
    @GET("search_all_teams.php")
    Call<TeamResponse> getAllTeams(@Query("l") String league);

    @GET
    Call<FormerTeamResponse> getFormerTeams(@Url String url);

}
