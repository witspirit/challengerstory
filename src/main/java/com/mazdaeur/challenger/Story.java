package com.mazdaeur.challenger;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds all the elements of a Challenger Story
 */
public class Story {
    private String author;
    private String title;
    private List<Section> sections = new ArrayList<>();


    public Story by(String author) {
        this.author = author;
        return this;
    }

    public Story on(String title) {
        this.title = title;
        return this;
    }

    public Section section(String title) {
        Section section = new Section(this, title);
        sections.add(section);
        return section;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public List<Section> getSections() {
        return sections;
    }
}
