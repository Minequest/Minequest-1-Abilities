package com.theminequest.MQCoreAddon.Abilities;

import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerEvent;

import com.theminequest.MineQuest.AbilityAPI.Ability;

public class TestAbility extends Ability {

	@Override
	public String getName() {
		return "Random test ability";
	}

	@Override
	public int getMana() {
		return 0;
	}

	@Override
	public int getCooldown() {
		return 10;
	}

	@Override
	public String isRightEvent(PlayerEvent e) {
		if (e instanceof PlayerEggThrowEvent)
			return "";
		return null;
	}

	@Override
	public void executeEvent(PlayerEvent e, String details) {
		e.getPlayer().sendMessage("Hi there! You triggered TestAbility!");
	}

}
