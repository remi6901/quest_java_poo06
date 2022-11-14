public class Classroom {
    public static void main(String[] args) {
        Wilder david = new Wilder("David", true);
        System.out.println(david.whoAmI());
        Wilder leon = new Wilder("Leon", false);
        System.out.println(leon.whoAmI());
        Wilder nicole = new Wilder("Nicole", true);
        System.out.println(nicole.whoAmI());
    }
}
