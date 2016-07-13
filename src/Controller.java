import com.failexe.List.End;
import com.failexe.Questions.Questions;
import java.io.File;

public class Controller{
     static Questions questions = new Questions(new End(),new File("src\\com\\failexe\\Questions\\Questions.txt"));
     static GUI gui = new GUI();

    public static void main(String[] args) {
        gui.startGUI(args);
    }

}
