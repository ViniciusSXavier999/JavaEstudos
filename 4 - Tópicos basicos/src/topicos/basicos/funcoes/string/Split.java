package topicos.basicos.funcoes.string;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Corinthians;Flamengo;Palmeiras;Sãopaulo";
		
		String[] split = s.split(";");
		
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
	}

}
