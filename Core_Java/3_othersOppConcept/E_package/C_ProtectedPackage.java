//protected modifier accessibility within class and within package and out package by subclass.

package E_package;

class college {

	protected void info() {

		System.out.println("college name:g.v.i.s.h.amravati.");
		System.out.println("college code:101");
		System.out.println("college contact no:9545755694");
	}
}

public class C_ProtectedPackage extends college {

	public static void main(String[] args) {

		C_ProtectedPackage obj = new C_ProtectedPackage();
		obj.info();
	}
}
