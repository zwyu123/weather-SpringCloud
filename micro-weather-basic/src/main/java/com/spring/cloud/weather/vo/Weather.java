package com.spring.cloud.weather.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 天气信息
 */
public class Weather implements Serializable {

    private static final long serialVersionUID = 6865863193754950671L;

    private String city;
    private String aqi;
    private String ganmao;
    private String wendu;
    private Yesterday yesterday;
    private List<Forecast> forecase;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public Yesterday getYesterday() {
        return yesterday;
    }

    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public List<Forecast> getForecase() {
        return forecase;
    }

    public void setForecase(List<Forecast> forecase) {
        this.forecase = forecase;
    }
}
