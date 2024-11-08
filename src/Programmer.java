public class Programmer extends Person{
    private String companyName;
    private String coding;



    public Programmer(String name, String designation, String learn, String walk, String eat, String companyName, String coding) {
        super(name, designation, learn, walk, eat);
        this.companyName = companyName;
        this.coding = coding;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }



    @Override
    public String toString() {
        return String.format(super.toString()+"""
                Programmer!       
                Company name  : %s
                Coding       : %s
                """,companyName,coding);
    }
}
