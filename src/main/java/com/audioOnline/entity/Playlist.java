package com.audioOnline.entity;

import java.util.Date;
import java.util.List;

public class Playlist {
    int id;
    String playlistTitle;
    String description;
    int owner;
    Date createTime;
    long playCount;
    long collectCount;
    String imageUrl;
    List<Song> songList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public void setPlaylistTitle(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getPlayCount() {
        return playCount;
    }

    public void setPlayCount(long playCount) {
        this.playCount = playCount;
    }

    public long getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(long collectCount) {
        this.collectCount = collectCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "id=" + id +
                ", playlistTitle='" + playlistTitle + '\'' +
                ", description='" + description + '\'' +
                ", owner=" + owner +
                ", createTime=" + createTime +
                ", playCount=" + playCount +
                ", collectCount=" + collectCount +
                ", imageUrl='" + imageUrl + '\'' +
                ", songList=" + songList +
                '}';
    }
}
