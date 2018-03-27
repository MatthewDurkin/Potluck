public class Person {
    String name;
    String[] diet;
    Sring cuisine;
    String[] type;
    String available;
    String unavailable;

    public Person() {
        this.name = null;
        this.diet = new String[7];
        this.cuisine = null;
        this.type = new String[7];
        this.available = null;
        this.unavailable = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiet(String[] diet) {
        if(diet.length <= 7) {
            for (int i = 0; i < diet.length; i++) {
                this.diet[i] = diet[i];
            }
        }
        else {
            System.out.println("Error: unable to set diet, array input is too long.")
        }
    }

    public void setCuisine(Sring cuisine) {
        this.cuisine = cuisine;
    }

    public void setType(String[] type) {
        if(type.length <= 7) {
            for (int i = 0; i < type.length; i++) {
                this.type[i] = type[i];
            }
        }
        else {
            System.out.println("Error: unable to set type, array input is too long.")
        }
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}