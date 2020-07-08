package domain;

import java.util.ArrayList;
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

    int ownerID;
    int administratorID;
    int replyOwnerID;
    int replyPostID;
    int friendsOnly;
    String postType;
    ArrayList<Object> attachments;
    int signerID;
    boolean canPin;
    boolean canDelete;
    boolean canEdit;
    boolean isPinned;
    boolean markedAsAds;
    boolean isFavorite;
    Geo geo;

}
