package domain;

public class Repost {
    private int repostId;
    private int repostAuthorId;
    private int count;

    public int getRepostId() {
        return repostId;
    }

    public void setRepostId(int repostId) {
        this.repostId = repostId;
    }

    public int getRepostAuthorId() {
        return repostAuthorId;
    }

    public void setRepostAuthorId(int repostAuthorId) {
        this.repostAuthorId = repostAuthorId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
