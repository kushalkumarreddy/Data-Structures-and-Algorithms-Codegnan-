package Pack1;
public class Pack1 {
		
		public int a =10;
		protected int b =20;
		int c =30;
		private int d =40;
		
		public static void main(String[] args) {
			Pack1 p = new Pack1();
			
			System.out.println(p.a);
			System.out.println(p.b);
			System.out.println(p.c);
			System.out.println(p.d);  //d is in protected so can't use
		}

		
}
