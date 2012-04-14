package com.theminequest.MQCoreAddon.Abilities;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerEvent;

import com.theminequest.MQCoreRPG.API.Abilities.Ability;
import com.theminequest.MQCoreRPG.Player.PlayerDetails;

public class MessageAbility extends Ability {

	@Override
	public String getName() {
		return "Message Event";
	}

	@Override
	public int getPower(PlayerDetails d) {
		return 50;
	}

	@Override
	public long getCooldown() {
		return 30;
	}

	@Override
	public boolean isRightEvent(PlayerEvent e) {
		return (e instanceof PlayerEggThrowEvent);
	}

	@Override
	public void executeEvent(Player p, PlayerEvent e) {
		p.sendMessage("You threw an egg and triggered this message event!");
	}

}