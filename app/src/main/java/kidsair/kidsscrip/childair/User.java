package kidsair.kidsscrip.childair;

public class User {
    public String name;  // 사용자 id
    public String time; // 사용자명
    public String temperature; // 계정명
    public String dust1; // 개인키
    public String dust2; // 비밀키


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setDust1(String dust1) {
        this.dust1 = dust1;
    }

    public String getDust1() {
        return dust1;
    }

    public void setDust2(String dust2) {
        this.dust2 = dust2;
    }

    public String getDust2() {
        return dust2;
    }
}