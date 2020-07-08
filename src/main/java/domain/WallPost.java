package domain;

import java.util.Date;

public class WallPost {

    int postID;
    int authorID;
    int date;
    String name;
    String text;
    Comment [] comments;
    Like [] likes;
    Repost [] reposts;


}
