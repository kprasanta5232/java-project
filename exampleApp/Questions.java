package org.jmz.exampleApp;

public class Questions {
	String ques = null;
	String[] ans = null;
	@Override
	public String toString() {
		return "Questions [ques=" + ques + ", ans=" + ans + "]";
	}
	public Questions(String ques, String[] ans) {
		super();
		this.ques = ques;
		this.ans = ans;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public String[] getAns() {
		return ans;
	}
	public void setAns(String[] ans) {
		this.ans = ans;
	}
	
}
