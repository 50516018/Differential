package differential;
import java.util.Scanner;
public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("input number a");
		double a =Double.parseDouble(scan.next());
		System.out.println("input number h");
		double h =Double.parseDouble(scan.next());
		Diffierential_lib dlib=new Diffierential_lib(a,h);
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”‚Í"+dlib.getRx());
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”’l”÷•ª‚Í"+dlib.getDx());
		System.out.println("‘Š‘ÎŒë·‚Í"+(Math.abs(dlib.getRx()-dlib.getDx())/dlib.getRx()*100));
	}

}

//ˆê”Ô¸“x‚ª—Ç‚­‚È‚éh‚Íh=0.0000000099999f
//(x)=x^2‚Ìx=1.0‚É‚¨‚¯‚é”’l”÷•ª‚Í2.000000003830653
//‘Š‘ÎŒë·‚Í1.9153265640170503E-7