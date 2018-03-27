
public class Person {
    private String name;
    private ArrayList diet;
    private Sring cuisine;
    private ArrayList type;
    private ArrayList available;
    private ArrayList unavailable;

    public Person() {
        this.name = null;
        this.diet = new ArrayList();
        this.cuisine = null;
        this.type = new ArrayList();
        this.available = new ArrayList();
        this.unavailable = new ArrayList();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiet(ArrayList diet) {
        int j = 0;
        if((diet.length + this.diet.length) <= 7) {
            for (int i = 0; i < diet.length; i++) {
                this.diet.add(diet.get(i));
            }
        }
        else {
            System.out.println("Error: unable to set diet, array input is too long.")
        }
    }

    public void setCuisine(Sring cuisine) {
        this.cuisine = cuisine;
    }

    public void setType(ArrayList type) {
        int j = 0;
        if((type.length + this.type.length) <= 7) {
            for (int i = 0; i < type.length; i++) {
                this.type.add(type.get(i));
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