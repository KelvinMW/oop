import java.awt.*;
import java.lang.*;
public class main {
/*

        Tree myownTree = new Tree(20,5, TreeType.OAK);
        Tree myownTree2 = new Tree(70,7,TreeType.PECAN);
        myownTree.Tall();
        myownTree2.Tall();

        Users mailusers = new Users();

        mailusers.userlist = new mailuserlist;
*/
public static void main(String[] args) {
    Employee supermarketEmployee = new Employee("Peter", 34, 500, Location.Kayaba);

    System.out.println(supermarketEmployee.getName() + supermarketEmployee.getSalary());

    Employee schoolEmployee = new Employee("Kamau",63, 200, Location.SouthB);
    schoolEmployee.salaryIncreament();
    System.out.println(schoolEmployee.getName()+schoolEmployee.getSalary());
}
}
