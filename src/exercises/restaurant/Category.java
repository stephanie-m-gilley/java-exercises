package exercises.restaurant;

public enum Category {
    Appetizer("Appetizer"),
    MainCourse("Main Course"),
    Desert("Desert");

    private String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

}
