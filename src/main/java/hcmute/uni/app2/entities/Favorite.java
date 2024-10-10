package hcmute.uni.app2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "favorites")
@NamedQuery(name = "Favorite.findAll", query = "SELECT f FROM Favorite f")
public class Favorite {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long favoriteId;

    @Column(name = "Active")
    private int active;

    @Column(name = "UserId")
    private String userId;

    @Column(name = "VideoId")
    private String videoId;

    public Favorite() {
    }

    public Long getFavoriteId() {
        return this.favoriteId;
    }

    public void setFavoriteId(String favoriteId) {
        this.favoriteId = Long.valueOf(favoriteId);
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
