package com.management.member.model.dto;

public class MemberDTO {

    private String memberCode;
    private String name;
    private String birthDay;
    private String gender;
    private String detail;
    private String contact;
    private String teamCode;
    private String activeStatus;

    public MemberDTO() {
    }

    public MemberDTO(String memberCode, String name, String birthDay, String gender, String detail, String contact, String teamCode, String activeStatus) {
        this.memberCode = memberCode;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.detail = detail;
        this.contact = contact;
        this.teamCode = teamCode;
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberCode='" + memberCode + '\'' +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", detail='" + detail + '\'' +
                ", contact='" + contact + '\'' +
                ", teamCode='" + teamCode + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    public String getDetail() {
        return detail;
    }

    public String getContact() {
        return contact;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public String getActiveStatus() {
        return activeStatus;
    }
}