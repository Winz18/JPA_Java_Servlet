package hcmute.uni.app2.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "videos")
@NamedQuery(name = "Video.findAll", query = "SELECT v FROM Video v")
public class Video implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "VideoId")
    private String videoId;

    @Column(name = "Active")
    private int active;

    @Column(name = "Description")
    private String description;

    @Column(name = "Poster")
    private String poster;

    @Column(name = "Title")
    private String title;

    @Column(name = "Views")
    private int views;

    // bi-directional many-to-one association to Favorite
    @OneToMany(mappedBy = "videoId")
    private List<Favorite> favorites;

    // bi-directional many-to-one association to Share
    @OneToMany(mappedBy = "videoId")
    private List<Share> shares;

    // bi-directional many-to-one association to Category
    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String videoId;
        private int active;
        private String description;
        private String poster;
        private String title;
        private int views;
        private Category category;

        public Builder videoId(String videoId) {
            this.videoId = videoId;
            return this;
        }

        public Builder active(int active) {
            this.active = active;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder poster(String poster) {
            this.poster = poster;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder views(int views) {
            this.views = views;
            return this;
        }

        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        public Video build() {
            Video video = new Video();
            video.setVideoId(this.videoId);
            video.setActive(this.active);
            video.setDescription(this.description);
            video.setPoster(this.poster);
            video.setTitle(this.title);
            video.setViews(this.views);
            video.setCategory(this.category);
            return video;
        }
    }

    public String getVideoId() {
        return this.videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public int getActive() {
        return this.active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public List<Favorite> getFavorites() {
        return this.favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }

    public Favorite addFavorite(Favorite favorite) {
        getFavorites().add(favorite);
        favorite.setVideoId(this.getVideoId());
        return favorite;
    }

    public Favorite removeFavorite(Favorite favorite) {
        getFavorites().remove(favorite);
        favorite.setVideoId(null);
        return favorite;
    }

    public List<Share> getShares() {
        return this.shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }

    public Share addShare(Share share) {
        getShares().add(share);
        share.setVideoId(this.getVideoId());
        return share;
    }

    public Share removeShare(Share share) {
        getShares().remove(share);
        share.setVideoId(null);
        return share;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}