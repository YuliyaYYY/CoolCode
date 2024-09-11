package Week_14.Discord;

import java.time.LocalDate;

public class Student extends DiscordUser {


    public Student(String role, String name, String id, LocalDate accountCreationDate) {
        super(role, name, id, accountCreationDate);
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message in class chat");
    }

    public void sendMessage(String name) {
        System.out.println("Sending message to" + name);
    }

    @Override
    public void joinDiscord(String url) {
        System.out.println("Joining as Student to " + url);

    }
}
