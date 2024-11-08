public class Person {
    private String name;
    private String designation;
    private String learn;
    private String walk;
    private String eat;

    public Person() {
    }

    public Person(String name, String designation, String learn, String walk, String eat) {
        this.name = name;
        this.designation = designation;
        this.learn = learn;
        this.walk = walk;
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public String setEat() {
        return eat;
    }

    public void getEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {


        return String.format("""
                Person ->
                Name        : %s
                Designation : %s
                Learn       : %s
                Walk        : %s
                Eat         : %s
                """,name,designation,learn,walk,eat);

    }

}

