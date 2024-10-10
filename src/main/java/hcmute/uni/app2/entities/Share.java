package hcmute.uni.app2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shares")
@NamedQuery(name = "Share.findAll", query = "SELECT s FROM Share s")
public class Share {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long shareId;

    @Column(name = "Active")
    private int active;

    @Column(name = "UserId")
    private String userId;

    @Column(name = "VideoId")
    private String videoId;

    public Share() {
    }

    public Long getShareId() {
        return this.shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = Long.valueOf(shareId);
    }

    public int getActive() {
        return this.active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
