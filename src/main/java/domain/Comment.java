package domain;

public class Comment {
    private int commentID;
    private int commentAuthorID;
    private int commentDate;
    private String commentText;
    private int count;

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getCommentAuthorID() {
        return commentAuthorID;
    }

    public void setCommentAuthorID(int commentAuthorID) {
        this.commentAuthorID = commentAuthorID;
    }

    public int getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(int commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
