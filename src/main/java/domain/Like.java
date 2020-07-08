package domain;

public class Like {
    private int likeID;
    private int likeAuthorID;
    private int count;

    public int getLikeID() {
        return likeID;
    }

    public void setLikeID(int likeID) {
        this.likeID = likeID;
    }

    public int getLikeAuthorID() {
        return likeAuthorID;
    }

    public void setLikeAuthorID(int likeAuthorID) {
        this.likeAuthorID = likeAuthorID;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
