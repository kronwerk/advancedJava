package com.learning;

public class PageGenerator {
    final static Integer timeout = 1000;
    final static Integer maxCounter = 10;
    static Integer counter = 0;

    public static String getPage() {
        final String header = "<html><head></head><body>";
        final String footer = "</form></body></html>";
        final String body = "<script>" +
        "function refresh(){location.reload(true)}" +
        "window.onload() = setInterval(refresh, " + timeout.toString() + ")" +
        "</script>" +
        "<h1>Hello Server!</h1>" +
        counter.toString() +
        "<form method = post>";
        final String output = header + body + footer;
        if (counter++ > maxCounter) {
            counter = 0;
        }
        return output;
    };
}
