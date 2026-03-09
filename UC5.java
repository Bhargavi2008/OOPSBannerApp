public class UC5 {

    public static void main(String[] args) {

        // Inline array declaration and initialization using String.join()
        String[] lines = {
            String.join(" ", " *****  ", "  *****   ", " *****  ", " ***** "),
            String.join(" ", "*     * ", " *     *  ", "*     * ", "*     *"),
            String.join(" ", "*     * ", " *     *  ", "*     * ", "*     *"),
            String.join(" ", "*     * ", " *     *  ", " *****  ", " ***** "),
            String.join(" ", "*     * ", " *     *  ", "*       ", "     * "),
            String.join(" ", "*     * ", " *     *  ", "*       ", "*    * "),
            String.join(" ", " *****  ", "  *****   ", "*       ", " ****  ")
        };

        // Enhanced for-loop to print the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
