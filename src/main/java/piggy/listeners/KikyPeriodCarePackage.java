package piggy.listeners;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class KikyPeriodCarePackage extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (event.getAuthor().isBot()) return;
        Message message = event.getMessage();
        String content = message.getContentRaw();
        if (content.equals("!kiky"))
        {
            String[] list = getKikyCompliments();
            int length = list.length;
            int random = new Random().nextInt(length);
            MessageChannel channel = event.getChannel();
            channel.sendMessage("This is an emergency compliment for Kiky's period!").queue();
            channel.sendMessage(list[random]).queue();
        }
    }

    private String[] getKikyCompliments() {
        String[] compliments = {"Your smile is just the best.",
                "I love the way you laugh.",
                "You light up the room.",
                "You have a great sense of humor.",
                "Every moment anyone spends with you is a gift.",
                "You're like sunshine on a rainy day.",
                "You're the best piggy in the world.",
                "It's impossible to get tired of you.",
                "Time spent with you is always worth it.",
                "Your friends are lucky to have you in their lives.",
                "There's just something about you that makes it impossible to feel sad.",
                "Everything seems brighter when you're around.",
                "You always look beautiful.",
                "You deserve all the best things life has to offer.",
                "You always know how to have fun, and you're fun to just be around.",
                "Jokes are funnier when you tell them.",
                "Your eyes are beautiful.",
                "You're cute when you're shy.",
                "You always lift up anyone's mood when you're around.",
                "You always know what to say to make anyone feel better.",
                "Being around you is like a happy little vacation.",
                "You're more fun than bubble wrap.",
                "You're someone's reason to smile.",
                "You look like the kind of person that is fun to hug.",
                "Being around you makes everything better.",
                "You deserve every bit of happiness.",
                "You look even more beautiful than usual today.",
                "You are worth it.",
                "You deserve to be happy",
                "Anyone is lucky to have you in their life.",
                "Even your flaws makes you a valuable and interesting person to know.",
                "You're the only person who can always make me laugh."};
        return compliments;
    }

}
