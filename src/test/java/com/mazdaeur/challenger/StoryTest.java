package com.mazdaeur.challenger;

import org.junit.Test;

public class StoryTest {

    @Test
    public void myPassionStory() {
        Story story = new Story().by("Bert Van Vlerken").on("Creating Elegant Software Code");

        story.section("What").content("Writing software code such that the code is easy to understand and is fun to work with.");
        story.section("Why").content("Code has to be read much more than written, make it enjoyable and efficient for the next programmer");
        story.section("At Work").content("Applied daily, appreciated by colleagues");
        story.section("Challenge").content("'It works' is not enough, go further and make it elegant, invest the effort !");

        StoryPresenter presenter = new TextPresenter(System.out);
        presenter.present(story);
    }
}
