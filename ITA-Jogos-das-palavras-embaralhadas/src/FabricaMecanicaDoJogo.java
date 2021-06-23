

public class FabricaMecanicaDoJogo {
	
	public MecanicaDoJogo retornoMecanica(int n){
		if(n == 1){ 
			return new MecanicaEpica();
		}
		
		return new MecanicaLendaria();
	}

	

}
