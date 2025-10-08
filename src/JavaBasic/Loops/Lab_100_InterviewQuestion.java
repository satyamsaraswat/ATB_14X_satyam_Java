package JavaBasic.Loops;
/*// Q: - exit code for this? as there is no condition in for loop.
// Ans: - in this case, loop will infinite times. so self killing will happen. E
exit code: - 130 will come. - Stop by yourself.  */
public class Lab_100_InterviewQuestion
{
    public static void main(String[] args) {
        for (int i = 0;  ; i++) {
            System.out.println(i);
        }
    }
}
