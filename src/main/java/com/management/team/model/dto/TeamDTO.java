package com.management.team.model.dto;

import java.io.Serializable;

public class TeamDTO implements Serializable {
    private String teamCode;
    private String name;
    private String detail;
    private String use;

    public TeamDTO() {
    }

    public TeamDTO(String teamCode, String name, String detail, String use) {
        super();
        this.teamCode = teamCode;
        this.name = name;
        this.detail = detail;
        this.use = use;
    }

    @Override
    public String toString() {
        return "TeamDTO{" +
                "teamCode='" + teamCode + '\'' +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", use='" + use + '\'' +
                '}';
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getUse() {
        return use;
    }
}
