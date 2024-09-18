package piggy.listeners;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelpListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (event.getAuthor().isBot()) return;
        Message message = event.getMessage();
        String content = message.getContentRaw();
        if (content.equals("!help"))
        {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("``` Type !piggy for monkey!\n Type !monkey for piggy!\n Type !kiky for an emergency period compliment.```").queue();
        }
    }
}
