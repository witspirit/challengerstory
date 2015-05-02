package com.mazdaeur.challenger;

/**
 * Contains the elements of a section of a story
 */
public class Section {
    private Story story;

    private String title;
    private String content;

    public Section(Story story, String title) {
        this.story = story;
        this.title = title;
    }

    public Story content(String content) {
        this.content = content;
        return story;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
