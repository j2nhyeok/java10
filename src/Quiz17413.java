import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Quiz17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
	    String sentence = bf.readLine();
	    
	    Stack<Character> stack = new Stack<>();

	    boolean flag = false;
	    
	    for(int i = 0; i < sentence.length(); i++) {
	    	if(sentence.charAt(i) == '<') {
	    		flag = true;
	    		while(!stack.isEmpty()) {
	    			sb.append(stack.pop());
	    		}
	    	}
	    	
	    	else if(sentence.charAt(i) == '>') {
	    	flag = false;	
	    	sb.append(sentence.charAt(i));
	    	continue;
	    	}else if(sentence.charAt(i) == ' ' ) {
	    		while(!stack.isEmpty()) {
	    			sb.append(stack.pop());
	    		}
	    		sb.append(' ');
	    		 continue;
	    	}
	    	
	    	if(flag) {
	    		sb.append(sentence.charAt(i));
	    	} else if(!flag) {
	    		stack.push(sentence.charAt(i));

	    	}
	    	
	    	if(i == sentence.length() -1) {
	    		while(!stack.isEmpty()) {
	    			sb.append(stack.pop());
	    		}
	    	}
	    	
	    	
	  
	    
	    }
	    
	 
	    
	    
	    System.out.println(sb);
	}

}
