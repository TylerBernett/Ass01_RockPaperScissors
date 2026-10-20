import java.util.Scanner;

public class RockPaperScissors
{
    static void main() {
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

                if (playerA.matches("[RPSrps]"))
                {
                    IO.println("Got player A move " + playerA);
                    done = true;
                }
                else // Illegal value not [RPSrps]
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

                if (playerB.matches("[RPSrps]")) {
                    IO.println("Got player A move " + playerB);
                    done = true;
                } else // Illegal value not [RPSrps]
                {
                    IO.println("You must enter [RPSrps], not " + playerB);
                }
            } while (!done);


            if(playerA.equalsIgnoreCase(playerB))
                IO.println(playerA + " vs " + playerB + " it's a Tie!");
            else if(playerA.equalsIgnoreCase("R"))
            {
                if(playerB.equalsIgnoreCase("p"))
                    IO.println(playerA + " vs " + playerB + " paper covers rock, Player B wins! ");
                else
                    IO.println(playerA + " vs " + playerB + " rock breaks scissors, Player A wins! ");
            }
            else if(playerA.equalsIgnoreCase("P"))
            {
                if(playerB.equalsIgnoreCase("r"))
                    IO.println(playerA + " vs " + playerB + " paper covers rock, Player A wins! ");
                else
                    IO.println(playerA + " vs " + playerB + " scissors cuts paper, Player B wins! ");
            }
            else
            {
                if(playerB.equalsIgnoreCase("r"))
                    IO.println(playerA + " vs " + playerB + " rock breaks scissors, Player B wins! ");
                else
                    IO.println(playerA + " vs " + playerB + " scissors cuts paper, Player A wins! ");
            }

            IO.println("Do you want to play again? [YN]: ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("Y"))
            {
                playing = true;
            }
            else
            {
                playing = false;

            }
        } while (playing);
    }
}
