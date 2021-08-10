package homework4;

public class QuestionSix {

	public static void main(String[] args) {
		String[] strData = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < strData.length; i++) {
			sb.delete(0, sb.capacity());
			System.out.println(sb.append(strData[i]).reverse());
		}		
	}

}
