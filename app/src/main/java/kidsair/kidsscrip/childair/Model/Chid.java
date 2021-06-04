package kidsair.kidsscrip.childair.Model;

public class Chid {
    public String name, time ;
    public String dust1;
    public String dust2;
    public String temperature;
    public Chid(String name, String time, String temperature, String dust1, String dust2){
        this.name=name;
        this.time=time;
        this.temperature=temperature;
        this.dust1=dust1;
        this.dust2=dust2;
    }

    public Chid(){
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getDust1() {
        return dust1;
    }

    public void setDust1(String dust1) {
        this.dust1 = dust1;
    }

    public String getDust2() {
        return dust2;
    }

    public void setDust2(String dust2) {
        this.dust2 = dust2;
    }
}

