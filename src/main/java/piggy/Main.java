package piggy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import piggy.listeners.HelpListener;
import piggy.listeners.KikyPeriodCarePackage;
import piggy.listeners.PingListener;
import piggy.token.BotToken;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JDA api = JDABuilder.createDefault(BotToken.BOT_TOKEN).enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new PingListener())
                .addEventListeners(new KikyPeriodCarePackage())
                .addEventListeners(new HelpListener())
                .build();
    }
}