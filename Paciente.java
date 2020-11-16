public class Paciente {
		public Paciente(String nome, double altura, double peso){
			this.nome = nome;
			if (peso < 0) {
				this.peso = 0;
			}else this.peso = peso;
			if (altura < 0) {
				this.altura = 0;
			}else this.altura = altura;
		}
		
		private String nome;
		private double peso = 0;
		private double altura = 0;
		private double imc = 0;
		private String imcStatus;
		
    public double getPeso(){
		    return this.peso;
		}

		public String getNome(){
			return this.nome;
		}
    public double getImc(){
			this.imc = peso/(altura*altura);

		    return this.imc;
		}

		public double getAltura(){
		    return this.altura;
		}
	
	

  		public void setImcStatus(String bmiStatus) {
			this.imcStatus = bmiStatus;
		}		
		
		public void setNome(String name){
		    this.nome = name;
		}
		public void setPeso(double weight){
	     getImcStatus();
	     
			if (weight <= 0) weight = this.peso;
	     
			else this.peso = weight;
	     
		}

    public String getImcStatus() {
	    	getImc();
		    if(imc < 18.5) this.imcStatus = "Magreza";
		    else if(imc >= 18.5 && imc < 24.9) this.imcStatus = "Normal";
		    else if(imc >= 24.9 && imc < 30) this.imcStatus = "Sobrepeso";
		    else if(imc >= 30) this.imcStatus = "Obesidade";
		    return this.imcStatus;
		}

		public void setAltura(double height){
			if (height <= 0) height = this.altura;
			else this.altura = height;
		}
		public void setImc(double bmiValue){
		    this.imc = bmiValue;
		}

}