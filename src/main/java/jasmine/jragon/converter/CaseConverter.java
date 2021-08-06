package jasmine.jragon.converter;

import jasmine.jragon.tool.regex.Regex;

public class CaseConverter {
    private static final Regex SPACE_DELIMITED_REGEX, SCREAMING_KEBAB_CASE_REGEX, SCREAMING_SNAKE_CASE_REGEX,
            SNAKE_CASE_REGEX, KEBAB_CASE_REGEX, CAMEL_CASE, PASCAL_CASE_REGEX;

    static {
        SCREAMING_KEBAB_CASE_REGEX = new Regex("\\b([A-Z]+)-?\\b");
        SCREAMING_SNAKE_CASE_REGEX = new Regex("\\b([A-Z]+)_?\\b");
        SPACE_DELIMITED_REGEX = new Regex("\\b([a-zA-Z0-9]+) ?\\b");
        SNAKE_CASE_REGEX = new Regex("");
        KEBAB_CASE_REGEX = new Regex("");
        CAMEL_CASE = new Regex("");
        PASCAL_CASE_REGEX = new Regex("");
    }


}
