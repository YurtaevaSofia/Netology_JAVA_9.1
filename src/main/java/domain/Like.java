package domain;

public class Like {
    private int likeId;
    private int likeAuthorId;
    private int count;

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public int getLikeAuthorId() {
        return likeAuthorId;
    }

    public void setLikeAuthorId(int likeAuthorId) {
        this.likeAuthorId = likeAuthorId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
