package theaxontech.com.animatedrecyclerview.Model;

public class Superhero {

    private String name, description;
    private int image_url;

    public Superhero() {
    }

    public Superhero(String name, String description, int image_url) {
        this.name = name;
        this.description = description;
        this.image_url = image_url;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public int getImage_url() {

        return image_url;
    }

    public void setImage_url(int image_url) {

        this.image_url = image_url;
    }

}