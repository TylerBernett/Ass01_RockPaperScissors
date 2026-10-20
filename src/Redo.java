import java.util.Scanner;

public class Redo
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        boolean done = false;
        boolean playing = true;
        String playAgain = "";

        do
        {


            do
            {
                IO.print("Player A, enter your RPS move [RPSrps]: ");
                playerA = in.nextLine();

                if (playerA.matches("[RPSrps] ")) {
                    IO.println("Got player A move " + playerA);
                    done = true;
                } else // Illegal value not [RPSrps]
                {
                    IO.println("You must enter [RPSrps], not " + playerA);
                }
            }
            while (!done);

            done = false;
            do
            {
                IO.print("Player B, enter your RPS move [RPSrps]: ");
                playerB = in.nextLine();

                if (playerB.matches("[RPSrps] ")) {
                    IO.println("Got player A move " + playerB);
                    done = true;
                } else // Illegal value not [RPSrps]
                {
                    IO.println("You must enter [RPSrps], not " + playerB);
                }
            }while(!done);

            }while(!done);
        }
    }











