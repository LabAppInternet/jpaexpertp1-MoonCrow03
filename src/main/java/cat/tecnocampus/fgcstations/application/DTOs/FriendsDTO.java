package cat.tecnocampus.fgcstations.application.DTOs;

import cat.tecnocampus.fgcstations.domain.User;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class FriendsDTO {
    @Pattern(regexp = "^[a-z]*")
    @Size(min=3, max=255)
    private User username;

    @NotEmpty
    private String friends;

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }
}
