
public class VarargsTest {
    public static void main(String[] args) {
        printParameters("1");
        printParameters("1", "2", "3","4");
    }

    static void printParameters(String ... args) {
        System.out.println(args);
        System.out.println(args.getClass());
        for (String arg: args) {
            System.out.println(arg);
        }
    }
}