// Implements the game of Craps logic
//Some code by Matt Buffo
public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total)
  {
	int result=0;
	//Checks to see if it is a new round as point will only be zero when starting a new round
	if(point == 0)
	//first roll execution
	{
		if (total == 11 || total == 7)
		{
			result = 1;
		}
		else if (total == 12 || total == 2 || total == 3)
		{
			result = -1;
		}
		else
		{
			result = 0;
			point = total;
		}
		
	}
	else{
	//subsequent roll execution 
		if (total == point)
		{
			result = 1;
			point = 0;
		}
		else if (total == 7)
		{
			result = -1;
			point = 0;
		}
		else 
		{
			result = 0;
		}
	}

    return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}

