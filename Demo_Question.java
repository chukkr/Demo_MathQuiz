/**********************************************************/
// Filename:  Demo_Question.java
// Purpose:   Framework of question and used to create the question that is used
//            by both student and teacher GUI (Demo Only)
// Author:    Christopher Morley & Rik Reyes
// Version:   1.0
// Date:	   9-June-2020	   
/**********************************************************/
package mathquiz;

public class Demo_Question
{
    private int answer;
    private int leftOperand;
    private String operator;
    private int rightOperand;
    
    public Demo_Question (int lOp, String op, int rOp, int ans)
    {
        answer = ans;
        leftOperand = lOp;
        operator = op;
        rightOperand = rOp; 
    }
    
    public int getLOp()
    {
        return leftOperand;
    }
    public int getROp()
    {
        return rightOperand;
    }
    public String getOperator()
    {
        return operator;
    }
    public int getAnswer()
    {
        return answer;
    }
}
