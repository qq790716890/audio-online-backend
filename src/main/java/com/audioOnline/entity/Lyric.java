package com.audioOnline.entity;

public class Lyric {
    private long time; // 歌词所在时间
    private String text; // 歌词内容

    public Lyric(long time, String text) {
        this.time = time;
        this.text = text;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Lyric{" +
                "time=" + time +
                ", text='" + text + '\'' +
                '}';
    }
}
