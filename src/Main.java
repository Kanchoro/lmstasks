import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Programmer programmer = new Programmer("Kana" , "Programmist","It","Car","Burger","KM","Very well");
        Dancer dancer = new Dancer("Aliya", "Dancer","Dancing","Bus","KFC","TZY","Professional");
        Singer singer = new Singer("Alice","Singer","Song","Taxi","Fast food","CW","Fire","Does not");
    Person [] people ={programmer,dancer,singer};
        for (Person person1 : people) {
            System.out.println(person1.toString());
        }
    }
}