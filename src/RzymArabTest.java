public class RzymArabTest {
    public static final String REGEX = "^([1-9][0-9]*)$";

    private static boolean isNumber(String wyrznie) {
        return wyrznie.matches(REGEX);
    }

    public static void main(String[] args) throws RzymArabException {

        for (String arg : args) {
            try {
                if (isNumber(arg)) {
                    int liczba = Integer.parseInt(arg);
                    System.out.println(arg + " = " + RzymArab.arab2rzym(liczba));
                } else {
                    System.out.println(arg + " = " + RzymArab.rzym2arab(arg));
                }
            } catch (RzymArabException e) {
                System.out.println(arg + " - " + e.getMessage());
            }
        }
    }
}
