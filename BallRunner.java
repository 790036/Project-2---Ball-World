
/**
 * Write a description of class BallRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BallRunner
{
    // instance variables - replace the example below with your own
    private int x;
    private int heading;
    //private TGPoint gat = (0,0);
    /**
     * Constructor for objects of class BallRunner
     */
    public BallRunner()
    {
        // initialise instance variables
        x = 0;
    }

    public static void run(){
       BallWorld ballWorld = new BallWorld(200, 200);
       TGPoint tgPoint = new TGPoint(0,0);
       BallBot ballBot = new BallBot(ballWorld, tgPoint, 0, 25);
       while(x=0){
           if(ballBot.canMoveForward = true){
               ballBot.moveForward;
            }
           else{
               heading = ballBot.getHeading();
               ballBot.setHeading((heading%360)+90);
            }
        }
    }}