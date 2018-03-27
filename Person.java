
public class Person {
    private String name;
    private String[] diet;
    private Sring cuisine;
    private String[] type;
    private ArrayList available;
    private ArrayList unavailable;

    public Person() {
        this.name = null;
        this.diet = new String[7];
        this.cuisine = null;
        this.type = new String[7];
        this.available = new ArrayList();
        this.unavailable = new ArrayList();
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

    public void addAvailable(Date date) {
        if(this.unavailable.empty) {
            this.available.add(date);
        }
        else {
            //throw exception
        }
    }

    public void addAvailable(Date date) {
        if(this.unavailable.empty) {
            this.available.add(date);
        }
        else {
            //throw exception
        }
    }
}