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
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l������"+dlib.getDx());
		System.out.println("���Ό덷��"+(Math.abs(dlib.getRx()-dlib.getDx())/dlib.getRx()*100));
	}

}

//��Ԑ��x���ǂ��Ȃ�h��h=0.0000000099999f
//(x)=x^2��x=1.0�ɂ����鐔�l������2.000000003830653
//���Ό덷��1.9153265640170503E-7