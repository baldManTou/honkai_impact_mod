package io.github.bald_mantou.honkai_impact_mod;

import net.minecraft.Util;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("honkai_impact_mod")
@Mod.EventBusSubscriber
public class main {

    @SubscribeEvent
    public static void playerJoinEvent(PlayerEvent.PlayerLoggedInEvent event){
        Player player = event.getPlayer();
        Level level = player.level;

        player.sendMessage(new TextComponent("Hello, "+player.getDisplayName().getString()), Util.NIL_UUID);
    }

}
