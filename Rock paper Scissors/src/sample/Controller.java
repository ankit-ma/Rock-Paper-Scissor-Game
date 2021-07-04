package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.image.*;
import javafx.scene.control.*;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public ImageView img1;
    public ImageView img2;
    public Button rock;
    public Button paper;
    public Button scissor;
    public Button go;
    public Label result;

    int r=0,p=0,s=0,comrand;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void rockFun(ActionEvent actionEvent) throws FileNotFoundException {

        //InputStream stream = new FileInputStream("/Users/ankitsharma/IdeaProjects/Game/src/sample/rock.png");
        Image image = new Image(getClass().getResourceAsStream("/sample/rock.png"));
        img1.setImage(image);
        r=1;
        p=0;
        s=0;

    }

    public void paperFun(ActionEvent actionEvent) throws FileNotFoundException {
       // InputStream stream = new FileInputStream("/Users/ankitsharma/IdeaProjects/Game/src/sample/paper.png");
        Image image = new Image(getClass().getResourceAsStream("/sample/paper.png"));
        img1.setImage(image);
        r=0;
        p=1;
        s=0;
    }

    public void scissorFun(ActionEvent actionEvent) throws FileNotFoundException {
       // InputStream stream = new FileInputStream("/Users/ankitsharma/IdeaProjects/Game/src/sample/scisser.png");
        Image image = new Image(getClass().getResourceAsStream("/sample/scisser.png"));
        img1.setImage(image);
        r=0;
        p=0;
        s=1;

    }

    public void goFun(ActionEvent actionEvent) {
        Random rand = new Random();
        comrand = rand.nextInt(30);
        if (comrand <=10)
        {
            Image image = new Image(getClass().getResourceAsStream("/sample/rock.png"));
            img2.setImage(image);
        }
        else if(comrand>10 && comrand <=20)
        {
            Image image = new Image(getClass().getResourceAsStream("/sample/paper.png"));
            img2.setImage(image);
        }
        else if(comrand>20 &&comrand <= 30)
        {
            Image image = new Image(getClass().getResourceAsStream("/sample/scisser.png"));
            img2.setImage(image);
        }
        if((r ==1 && comrand<=10)||(p==1 && (comrand>10 && comrand <=20))||(s==1 && (comrand<=30 && comrand>20)))
        {
           result.setText("Draw");
        }
        else if(r==1)
        {
            if(comrand>20 && comrand<=30)
                result.setText("You Won");
            else
                result.setText("You Loose");
        }
        else if(p==1 )
        {
            if(comrand<=10)
                result.setText("You Won");
            else
                result.setText("You Loose");
        }
        else if(s==1)
        {
            if(comrand>10 && comrand<=20)
                result.setText("You Won");
            else
                result.setText("You Loose");
        }
        if(r==0 && s==0 && p==0)
            result.setText("Select Your Choice");

        r=0;
        s=0;
        p=0;
    }

}
