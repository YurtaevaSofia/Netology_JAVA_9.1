package domain;

public class Repost {
    private int repostID;
    private int repostAuthorID;
    private int count;

    public int getRepostID() {
        return repostID;
    }

    public void setRepostID(int repostID) {
        this.repostID = repostID;
    }

    public int getRepostAuthorID() {
        return repostAuthorID;
    }

    public void setRepostAuthorID(int repostAuthorID) {
        this.repostAuthorID = repostAuthorID;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
