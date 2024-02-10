/**
 * This enumerator is something I whipped up simply because I was bored.
 * <p>It works by utilizing the terminal escape codes and putting them in a more user-friendly format,
 * to the point where it works in a similar way to the attron() and attroff() functions from curses/ncurses</p>
 * <b>NOTE - Some of these might not work on your terminal, but the basic ones should.</b>
 * <p>Example Usage:</p>
 * <p>System.out.println("Normal Text"); <br>
 * System.out.print(AnsiCodes.UNDERLINE_ON.ansi());<br>
 * System.out.println("Underline Text");<br>
 * System.out.print(AnsiCodes.BOLD_ON.ansi()); <br>
 * System.out.println("Bold and Underline Text"); <br>
 * System.out.print(AnsiCodes.ALL_OFF.ansi());</p>
 *
 * <p>Output:</p>
 * Normal Text<br>
 * <u>Underline Text</u><br>
 * <b><u>Bold and Underline Text</u></b>
 */
enum AnsiCodes {
    ALL_OFF("\u001B[0m"),
    BOLD_ON("\u001B[1m"),
    BOLD_OFF("\u001B[22m"),
    DIM_ON("\u001B[2m"),
    DIM_OFF("\u001B[22m"),
    ITALIC_ON("\u001B[3m"),
    ITALIC_OFF("\u001B[23m"),
    UNDERLINE_ON("\u001B[4m"),
    UNDERLINE_OFF("\u001B[24m"),
    BLINK_ON("\u001B[5m"),
    BLINK_OFF("\u001B[25m"),
    REVERSE_ON("\u001B[7m"),
    REVERSE_OFF("\u001B[27m"),
    INVISIBLE_ON("\u001B[8m"),
    INVISIBLE_OFF("\u001B[28m"),
    STRIKETHROUGH_ON("\u001B[9m"),
    STRIKETHROUGH_OFF("\u001B[29m"),
    OVERLINE_ON("\u001B[53m"),
    OVERLINE_OFF("\u001B[55m");

    private final String value;

    AnsiCodes(String value) {
        this.value = value;
    }

    public String ansi() {
        return value;
    }
}