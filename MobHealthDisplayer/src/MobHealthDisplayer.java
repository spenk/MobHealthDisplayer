import java.util.logging.Logger;


public class MobHealthDisplayer extends Plugin{
	MobHealthDisplayerListener l = new MobHealthDisplayerListener();
	static Logger log = Logger.getLogger("Minecraft");
	public void initialize(){log.info("MobHealthDisplayer v1.0 by Spenk is Initalized");
	etc.getLoader().addListener(PluginLoader.Hook.COMMAND, l, this, PluginListener.Priority.MEDIUM);
	etc.getLoader().addListener(PluginLoader.Hook.ATTACK, l, this, PluginListener.Priority.MEDIUM);}
	public void enable(){log.info("MobHealthDisplayer v1.0 by Spenk is enabled");}
	public void disable(){log.info("MobHealthDisplayer v1.0 by Spenk is disabled");}
}
