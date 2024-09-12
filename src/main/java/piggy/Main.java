package piggy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import piggy.listeners.PingListener;
import piggy.token.BotToken;

public class Main {
    public static void main(String[] args) {
        JDA api = JDABuilder.createDefault(BotToken.BOT_TOKEN).enableIntents(GatewayIntent.MESSAGE_CONTENT).addEventListeners(new PingListener()).build();

    }
}