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
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
		System.out.println("f(x)=x^2のx="+a+"における数値微分は"+dlib.getDx());
		System.out.println("相対誤差は"+(Math.abs(dlib.getRx()-dlib.getDx())/dlib.getRx()*100));
	}

}

//一番精度が良くなるhはh=0.0000000099999f
//(x)=x^2のx=1.0における数値微分は2.000000003830653
//相対誤差は1.9153265640170503E-7