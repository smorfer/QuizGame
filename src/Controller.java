import com.failexe.GUI.GUI;
import com.failexe.List.End;
import com.failexe.List.List;
import com.failexe.Questions.Questions;
import java.io.File;

public class Controller{
     static Questions questions = new Questions(new List(),new File("src\\com\\failexe\\Questions\\Questions.txt"));
     static GUI gui = new GUI();

    public static void main(String[] args) {
        gui.startGUI(args);
    }

}
