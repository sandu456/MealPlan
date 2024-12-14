@Document(collection = "meals")
public class Meal {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private boolean isAvailable;

    // Getters and setters
}
