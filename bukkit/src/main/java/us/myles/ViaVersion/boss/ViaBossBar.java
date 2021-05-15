package us.myles.ViaVersion.boss;

import org.bukkit.entity.Player;
import us.myles.ViaVersion.api.boss.BossBar;
import us.myles.ViaVersion.api.boss.BossColor;
import us.myles.ViaVersion.api.boss.BossStyle;

public class ViaBossBar extends CommonBoss<Player> {

    public ViaBossBar(String title, float health, BossColor color, BossStyle style) {
        super(title, health, color, style);
    }

    @Override
    public BossBar<Player> addPlayer(Player player) {
        addPlayer(player.getUniqueId());
        return this;
    }

    @Override
    public BossBar<Player> addPlayers(Player... players) {
        for (Player p : players)
            addPlayer(p);
        return this;
    }

    @Override
    public BossBar<Player> removePlayer(Player player) {
        removePlayer(player.getUniqueId());
        return this;
    }
}
