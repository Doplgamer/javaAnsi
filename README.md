# javaAnsi - An AnsiCode Enumerator
Providing a more user-friendly way of using ANSI escape codes in java.


This enumerator provides a set of ANSI escape codes that can be used to modify the appearance of text in a terminal or command-line interface.

## Purpose
I created this enumerator as a simple utility to provide a user-friendly way of using terminal escape codes, akin to the `attron()` and `attroff()` functions from curses/ncurses.

**Note**: Some of these escape codes might not work on all terminals, but the basic ones should be supported in most environments.

## Example Usage

```java
System.out.println("Normal Text");
System.out.print(AnsiCodes.UNDERLINE_ON.ansi());
System.out.println("Underline Text");
System.out.print(AnsiCodes.BOLD_ON.ansi());
System.out.println("Bold and Underline Text");
System.out.print(AnsiCodes.ALL_OFF.ansi());
```

### Terminal Output:

Normal Text  
<ins>Underline Text</ins>  
<b><ins>Bold and Underline Text</ins></b>

## Enum Constants

- `ALL_OFF`: Resets all text attributes to their default values.
- `BOLD_ON`: Enables bold text.
- `BOLD_OFF`: Disables bold text.
- `DIM_ON`: Enables dim (or faint) text.
- `DIM_OFF`: Disables dim text.
- `ITALIC_ON`: Enables italic text.
- `ITALIC_OFF`: Disables italic text.
- `UNDERLINE_ON`: Enables underlined text.
- `UNDERLINE_OFF`: Disables underlined text.
- `BLINK_ON`: Enables blinking text.
- `BLINK_OFF`: Disables blinking text.
- `REVERSE_ON`: Enables reverse text (swaps foreground and background colors).
- `REVERSE_OFF`: Disables reverse text.
- `INVISIBLE_ON`: Makes text invisible (useful for hiding sensitive information).
- `INVISIBLE_OFF`: Disables invisible text.
- `STRIKETHROUGH_ON`: Enables strikethrough text.
- `STRIKETHROUGH_OFF`: Disables strikethrough text.
- `OVERLINE_ON`: Enables overlined text.
- `OVERLINE_OFF`: Disables overlined text.

## Contribution
Feel free to contribute by adding more ANSI escape codes or improving the documentation.
