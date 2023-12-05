package ie.atu;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Cathal", "Dunmore", "12345678");
        System.out.println(myPerson.toString());
        System.out.println("\n");

        Customer myCustomer = new Customer("Cathal", "Dunmore", "12345678","9d876",true);
        System.out.println(myCustomer.toString());
        System.out.println("\n");

        Part3 Part1 = new Part3("John", "Tuam", "11111111", "675A", false);
        System.out.println(Part1.toString());

        Part3 Part2 = new Part3();
        Part2.setAddress("Galway");
        Part2.setMail(true);
        Part2.setName("Jane");
        Part2.setNumber("0875432276");
        Part2.setCustNumber("523G");


        System.out.println("\nPart2");
        System.out.println(Part2.getCustNumber());
        System.out.println(Part2.getAddress());
        System.out.println(Part2.getName());
        System.out.println(Part2.getNumber());
        System.out.println(Part2.getMail());
    }
}