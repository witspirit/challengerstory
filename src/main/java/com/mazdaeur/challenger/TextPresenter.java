package com.mazdaeur.challenger;

import java.io.PrintStream;

/**
 * Outputs a story to a text output. Modestly formatted.
 */
public class TextPresenter implements StoryPresenter {


    private final PrintStream output;

    public TextPresenter(PrintStream output) {
        this.output = output;
    }

    @Override
    public void present(Story story) {
        output.println(story.getTitle());
        output.println(repeat("-", story.getTitle().length()));
        output.println();

        for (Section section : story.getSections()) {
            output.println(section.getTitle());
            output.println(repeat(" ",2)+section.getContent());
            output.println();
        }

        output.println();
        output.println(repeat(" ", 30)+"by "+story.getAuthor());
    }

    private String repeat(String value, int amount) {
        String result = "";
        for (int i=0; i < amount; i++) {
            result += value;
        }
        return result;
    }
}
