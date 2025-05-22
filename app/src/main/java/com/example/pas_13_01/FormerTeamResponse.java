package com.example.pas_13_01;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class FormerTeamResponse {
    @SerializedName("former_teams")
    private List<FormerTeam> formerTeams;

    public List<FormerTeam> getFormerTeams() {
        return formerTeams;
    }
}
