package game02package;

public class AppGaming01BasicJava {
    public static void main(String[] args) {
        //var game=new supercon();
      var game=new Mariogame();
        var gamerunner=new GameRunner(game);//
        gamerunner.run();//
    }

}

