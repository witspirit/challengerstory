package com.mazdaeur.challenger;

public class MyPassionStory {

    public static void main(String... arguments) {
        Story story = new Story().by("Bert Van Vlerken").on("Creating Elegant Software Code");

        story.section("What")
          .content("Writing software code such that it is easy to understand and fun to work with.");
        story.section("Why")
          .content("Code has to be read much more than written; make it enjoyable for the next programmer");
        story.section("At Work")
          .content("Applied daily, appreciated by colleagues");
        story.section("Challenge")
          .content("'It Works' is not enough, go further and make it elegant, invest the effort !");

        StoryPresenter presenter = new TextPresenter(System.out);
        presenter.present(story);

    }
}
