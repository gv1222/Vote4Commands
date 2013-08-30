package net.craftminecraft.bungee.vote4commands;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import net.craftminecraft.bungee.bungeeyaml.supereasyconfig.Comment;
import net.craftminecraft.bungee.bungeeyaml.supereasyconfig.Config;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Plugin;
/**
 *
 * @author roblabla
 */
public class MainConfig extends Config {
    public MainConfig(Plugin pl) {
        this.CONFIG_FILE = new File(pl.getDataFolder(), "config.yml");
    }
    @Comment("Message sent when a player's vote is waiting confirmation.")
    public String confirmvotemessage = ChatColor.GREEN + ("Please type /cv to get your reward");
    @Comment("Message sent when a player uses a blocked command")
    public String blockedmessage = ChatColor.DARK_RED + ("You do not have permission to run this command");
    @Comment("Should the commands listed be blocked for direct access ?")
    public boolean blockCommands = true;
    @Comment("List of commands to run when a player confirms his vote.")
    public List<String> commands = Lists.newArrayList("/i diamond 1");
    @Comment("Set to false to disable broadcasting a message when a player voted")
    public boolean enableplayervotedmessage = true;
    @Comment("Message sent when a player has voted")
    public String playervotedmessage = ChatColor.GOLD + ("%player% has recieved 500 and 10 XP Bottles!");
    @Comment("Should we send a nag to all players if they didn't vote in the last 24 hours ?")
    public boolean votenag_enabled = true;
    @Comment("Message to send to the player when vote-nagging them")
    public String votenag_message = ChatColor.DARK_RED + ("You haven't voted in the past 24 hours! Type /vote");
    @Comment("Interval at which we should send votenags, in minutes.")
    public int votenag_interval = 60;
}