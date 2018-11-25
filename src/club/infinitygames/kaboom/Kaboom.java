package club.infinitygames.kaboom;

import org.bukkit.plugin.java.JavaPlugin;

public class Kaboom extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// When the plugin starts we need to setup like the one command that this plugin has
		getCommand("kaboom").setExecutor(new KaboomCommand());
		
	}

}
