import java.util.ArrayList;


public class MobHealthDisplayerListener extends PluginListener {
	ArrayList<String> a = new ArrayList<String>();
	public boolean onCommand(Player player,String[] split){
		if ((split[0].equalsIgnoreCase("/healthcheck"))&&(player.canUseCommand("/healtcheck"))){
			if (split.length <1 || split.length >1){
				player.notify("the correct usage is '/healthcheck'");
				return true;
			}else{
				a.add(player.getName());
				player.sendMessage("§2Now attack your animal to check its health");
				return true;
			}	
		}
		return false;
	}
	public boolean onAttack(LivingEntity attacker,LivingEntity defender,java.lang.Integer amount){
		if (attacker.isPlayer() && defender.isAnimal()){
			Player player = attacker.getPlayer();
		if (a.contains(player.getName())){
				attacker.getPlayer().sendMessage("§3Health: "+defender.getHealth());
				a.remove(player.getName());
				return true;
			}
		}
		return false;
	}

}
