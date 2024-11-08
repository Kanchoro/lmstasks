public class Dancer extends  Person{
    private String groupName;
    private String dancing;

    public Dancer(String name, String designation, String learn, String walk, String eat,String groupName, String dancing) {
        super(name, designation, learn, walk, eat);
        this.groupName = groupName;
        this.dancing = dancing;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDancing() {
        return dancing;
    }

    public void setDancing(String dancing) {
        this.dancing = dancing;
    }
    @Override
    public String toString() {
        return String.format(super.toString()+"""
                Dancer!       
                Group name  : %s
                dancing     : %s
                """,groupName,dancing);
    }
}
