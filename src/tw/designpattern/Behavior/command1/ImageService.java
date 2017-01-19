package tw.designpattern.Behavior.command1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chiachen on 2017/1/19.
 */
public class ImageService {
    private Map<String, Command> commands = new HashMap<>();
    private Drawing drawing = new DrawingImpl();
    void addCommand(String effect, Command command) {
        commands.put(effect, command);
    }
    void doEffect(String effect) {
        commands.get(effect).execute(drawing);
    }
}
