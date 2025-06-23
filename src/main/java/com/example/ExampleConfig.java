package com.example;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface ExampleConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello Albert and Parker";
	}
	
	@ConfigItem(
		keyName = "greeting2",
		name = "Welcome Greeting2",
		description = "The second message to show to the user when they login"
	)
	default String greeting()
	{
		return "2nd";
	}
}
