import java.util.ArrayList;

/* This class acts as a gradebook and holds the scores of students
 * @author Zion Eig-Tassiello
 */

public class GradeBook
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a gradebook with no scores and a given capacity.
      @capacity the maximum number of scores in this gradebook
   */
   public GradeBook(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   /*returns scores size
    * */
   public int getScoresSize() 
   {
	   return scoresSize;
   }
   
   /*returns all scores in a string
    * */
   public String toString() {
	   String toReturn  = "";
	   
	   for(int i = 0; i < scoresSize; i++) 
	   {
		   toReturn += scores[i] + " ";
	   }
	   
	   toReturn = toReturn.substring(0, toReturn.length()-1);
	   
	   return toReturn;
   }
   
   /**
      Adds a score to this gradebook.
      @param score the score to add
      @return true if the score was added, false if the gradebook is full
   */
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
	  if(scoresSize == 0)
		  return 0;
	   
	  double smallest = 101;
      
      for(int i = 0; i < scores.length; i++) 
	   {
		   if(scores[i] < smallest) {
			   smallest = scores[i];
		   }
	   }	   
      
      return smallest;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
}

