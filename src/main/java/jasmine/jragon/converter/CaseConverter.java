package jasmine.jragon.converter;

import jasmine.jragon.tool.regex.Regex;

public class CaseConverter {
    private static final Regex SPACE_DELIMITED_REGEX, SCREAMING_KEBAB_CASE_REGEX, SCREAMING_SNAKE_CASE_REGEX,
            SNAKE_CASE_REGEX, KEBAB_CASE_REGEX, CAMEL_CASE, PASCAL_CASE_REGEX;

    static {
        SCREAMING_KEBAB_CASE_REGEX = new Regex("\\b([A-Z]+)-?\\b");
        SCREAMING_SNAKE_CASE_REGEX = new Regex("\\b([A-Z]+)_?\\b");
        SPACE_DELIMITED_REGEX = new Regex("\\b([a-zA-Z0-9]+) ?\\b");
        SNAKE_CASE_REGEX = new Regex("\\b([a-z]+)_?\\b");
        KEBAB_CASE_REGEX = new Regex("\\b([a-z]+)-?\\b");
        CAMEL_CASE = new Regex("[a-z]+((\\d)|([A-Z0-9][a-z0-9]+))*([A-Z])?");
        PASCAL_CASE_REGEX = new Regex("([A-Z][a-z0-9]+)((\\d)|([A-Z0-9][a-z0-9]+))*([A-Z])?");
    }


}
