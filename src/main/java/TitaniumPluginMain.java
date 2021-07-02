import com.github.ocraft.s2client.bot.S2Agent;
import com.github.ocraft.s2client.protocol.game.Race;
import com.sakurawald.plugin.PluginBase;
import com.sakurawald.plugin.PluginManager;

public class TitaniumPluginMain extends PluginBase {

    @Override
    public String getPluginName() {
        return "TerranRushBot";
    }

    @Override
    public S2Agent generateS2Agent() {
        return new TerranRushBot();
    }

    @Override
    public void beforeLaunch() {
        if (this.getChooseBotRace() != Race.TERRAN) {
            throw new RuntimeException("TerranRushBot只支持选择人族！");
        }
    }
}
