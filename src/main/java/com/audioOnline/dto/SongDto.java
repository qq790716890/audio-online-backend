package com.audioOnline.dto;

import com.audioOnline.entity.Lyric;

import java.util.List;

public class SongDto {
    int id;
    String title;
    int artistId;
    int duration;
    int bitrate;
    String album;
    int playCount; // 最大20亿
    String lyricsUrl;
    String fileUrl;
    String imageUrl;
    // 存放每首歌的歌词
    List<Lyric> lyricList;
}
