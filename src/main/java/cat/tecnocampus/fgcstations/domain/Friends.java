package cat.tecnocampus.fgcstations.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "friend")
public class Friends {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Id
    private String friends;

    public Friends(){}

    public User getUser() {
        return user;
    }

    public void setUser(User username) {
        this.user = username;
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }
}
