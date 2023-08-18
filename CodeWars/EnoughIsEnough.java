/*Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie
their entire collection. However, Charlie doesn't like these sessions, since the motif usually repeats. He isn't fond of seeing
the Eiffel tower 40 times.He tells them that he will only sit for the session if they show the same motif at most N times.
Luckily, Alice and Bob are able to encode the motif as a number. Can you help them to remove numbers such that their list contains
each number only up to N times, without changing the order?

Task
Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since 
this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
With list [20,37,20,21] and number 1, the result would be [20,37,21].

*/
//Start of the program
import java.util.*;
public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		//Code here ;
    Map<Integer,Integer> occurencesMap=new HashMap<Integer,Integer>();
    List<Integer> answer = new ArrayList<Integer>();
    for(int e:elements){
      int occurences=occurencesMap.getOrDefault(e,0);/*at first the map will be empty
      so it will return 0 mapped with 'e' eg 20:0 */
      if(occurences<maxOccurrences)//*since the first is 0 ad > maxOcc it satisfies and goes in 
      {
        answer.add(e);//the element is sadded into the list 
        occurencesMap.put(e,occurences+1);/*the occurences of the element is increaseed 
        by 1 this goes on and on*/  
      }
    }
    int[] finalAnswer=new int[answer.size()];//initializing array fro saving the answr in array
        for (int i = 0; i < answer.size(); i++) {
            finalAnswer[i] = answer.get(i);; // Get the count for each element //converting list to array
        }
    return finalAnswer;
    }
		
	}

