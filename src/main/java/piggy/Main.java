package piggy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import piggy.listeners.PingListener;

public class Main {
    public static void main(String[] args) {
        // MTI4MzgxOTE5NDI0MDA3Nzg5NA.GkncFF.i-3ulNiK3IFmqfCA7LCiZD49q96uUdxFwqDEss
        String BOT_TOKEN = "MTI4MzgxOTE5NDI0MDA3Nzg5NA.GkncFF.i-3ulNiK3IFmqfCA7LCiZD49q96uUdxFwqDEss";
        JDA api = JDABuilder.createDefault(BOT_TOKEN).enableIntents(GatewayIntent.MESSAGE_CONTENT).addEventListeners(new PingListener()).build();

    }
}