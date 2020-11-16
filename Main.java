//package avaliacao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente p1 = new Paciente("Cássio Mello",1.90,130);
		p1.setAltura(-5);
		p1.setPeso(-19);
		System.out.println("teste 1:"+(p1.getAltura()==1.90));
		System.out.println("teste 2:"+(p1.getPeso()==130));
		System.out.println("teste 3:"+(p1.getNome().equals("Cássio Mello")));
		System.out.println("teste 4:"+(p1.getImc()==36.011080332409975));
		System.out.println("teste 5:"+(p1.getImcStatus().equals("Obesidade")));
		
		p1.setPeso(108);
		System.out.println("teste 6:"+(p1.getImc()==29.91689750692521));
		System.out.println("teste 7:"+(p1.getImcStatus().equals("Sobrepeso")));
		
		
		p1.setPeso(89);
		System.out.println("teste 8:"+(p1.getImcStatus().equals("Normal")));
		
		p1.setPeso(66);
		System.out.println("teste 9:"+(p1.getImcStatus().equals("Magreza")));
		
		
		p1.setAltura(1.88);
		System.out.println("teste 10:"+(p1.getImcStatus().equals("Normal")));
		System.out.println("teste 11:"+(p1.getAltura()==1.88));
		System.out.println("teste 12:"+(p1.getPeso()==66));
		
		Paciente p2 = new Paciente("Joana",-1.90,-130);
		System.out.println("teste 13:"+(p2.getAltura()==0));
		System.out.println("teste 14:"+(p2.getPeso()==0));
	}
}
