package sg.edu.np.mad.madpractical5;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;
    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }
    public  User() {}
    public User(String name, String description, boolean followed) {
        this.name = name;
        this.description = description;
        this.followed = followed;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean getFollowed() {
        return followed;
    }
}