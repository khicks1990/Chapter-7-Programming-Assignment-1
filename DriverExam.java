/**
   The DriverExam class stores data about a driver's license exam
   for the Driver�s License Exam programming challenge.
*/

public class DriverExam
{
   //variables
  

   /**
      The constructor copies an array of answers
      to the student field.
      @param s The array of answers to copy.
   */
   
   public DriverExam(char[] s)
   {
  
   }
   
   /**
      The gradeExam method determines the number of
      correct and incorrect answers. It calls the
      makeMissedArray method.
   */
   
   private void gradeExam()
   {

   }  
   
   /**
      The makeMissedArray method makes the missed array and
      stores the numbers of all the questions that the
      student missed in it.
   */
   
   private void makeMissedArray()
   {

   }
   
   /**
      The passed method determines whether the student
      passed or failed the exam.
      @return true if the student passed, false otherwise.
   */
   
   public boolean passed()
   {

   }
   
   /**
      The totalCorrect method returns the number of
      questions correctly answered.
      @return The number of questions correctly answered.
   */

   public int totalCorrect()
   {
      return numCorrect;
   }

   /**
      The totalInCorrect method returns the number of
      questions incorrectly answered.
      @return The number of questions incorrectly answered.
   */

   public int totalIncorrect()
   {
      return numIncorrect;
   }

   /**
      The questionsMissed method returns an array containing
      the numbers of the missed questions. 
      @return An array containing the numbers of the missed
              questions.If no questions were missed, returns null.
   */

   public int[] questionsMissed()
   {
      int[] temp = null;
      
      if (missed != null)
      {
         // First, make a copy of the array.
         temp = new int[missed.length];
         for (int i = 0; i < missed.length; i++)
            temp[i] = missed[i];
      }
      
      // Return the copy.
      return temp;
   }
}