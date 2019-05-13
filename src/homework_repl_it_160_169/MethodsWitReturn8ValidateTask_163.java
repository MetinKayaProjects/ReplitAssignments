package homework_repl_it_160_169;

public class MethodsWitReturn8ValidateTask_163 {
	public static void main(String[] args) {
		
		System.out.println(validateTask(true,2,1));
		
//		We have a to do list app, every time a user adds a task - a few things needed to be checked.
//
//		It should not be empty. boolean parameter needs to be true
//		taskId should be only 1 greater than currentID. for example 
//		if we have 7 tasks(currentId is 7) so the next task id is 8 , it can't be 10.
	}
	
	public static boolean validateTask(boolean notEmpty,int taskId,int currentId)
	  {
	   return (notEmpty && (taskId == currentId + 1));
	    
		
	}

}
