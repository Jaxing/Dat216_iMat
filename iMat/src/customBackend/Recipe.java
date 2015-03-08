package customBackend;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Recipe {
    private String name;
    private List<RecipeIngredient> ingredients;
    private ImageIcon iconSmall;
    private ImageIcon iconLarge;
    private String description;
    
    public Recipe(String name, List<RecipeIngredient> ingredients) {
        this.ingredients = new ArrayList<>();
        this.iconSmall = new ImageIcon();
        
        try {
            this.iconSmall = new javax.swing.ImageIcon(getClass().getResource("/imat/images/recipeImageSmall.png"));
            this.iconLarge = new javax.swing.ImageIcon(getClass().getResource("/imat/images/recipeImageLarge.png"));
        } catch (NullPointerException e) {
            //
        }
            
            
        this.ingredients = ingredients;
        this.name = name;
        
        // <editor-fold defaultstate="collapsed" desc="this.description = Lorem ipsum">
        this.description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus libero nisl, scelerisque eu nulla quis, porttitor sollicitudin justo. Vestibulum in massa a orci dignissim pulvinar. Sed justo ipsum, lacinia vitae sem ut, porta pharetra eros. Curabitur vel auctor sapien. Cras scelerisque scelerisque mi, vitae sollicitudin ligula rhoncus et. Ut consequat rutrum pellentesque. Aenean condimentum urna at erat ultrices ultricies. Suspendisse potenti. Praesent nec tellus ut massa scelerisque dignissim. Etiam nisl erat, consequat tempus placerat at, convallis ut lorem. Sed sed dolor bibendum, tempor erat vitae, efficitur nibh. Praesent purus libero, faucibus ut porta vitae, fermentum eu diam.\n" +
"\n" +"Morbi sit amet quam in tortor rhoncus suscipit. Integer vel sem nisi. Curabitur luctus convallis lectus, et finibus leo lacinia ut. Donec in vulputate ipsum, at pretium nulla. Quisque non purus a arcu ullamcorper ullamcorper. Nullam consectetur dignissim elit, vel malesuada odio tristique feugiat. Donec sit amet diam lacinia, rutrum lacus et, lobortis dui.";
        // </editor-fold>
    }
    
    public List<RecipeIngredient> getIngredients() {
        return this.ingredients;
        
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public ImageIcon getImageSmall() {
        return this.iconSmall;
    }
    
    public ImageIcon getImageLarge() {
        return this.iconLarge;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    
}
