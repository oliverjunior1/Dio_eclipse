package petShop;

public class PetMachine {
	private boolean clean;
	private int water;
	private int shampoo;
	private Pet pet;
	
	public void takeAShowerInAPet() {
		if (this.pet == null) {
			System.out.println("Coloque o pet na máquina para iniciar o banho");
			return;
		}
		
		pet.setClean(true);
		System.out.println("O pet " + pet.getName()+"está limpo");
		
	public void addWater() {
		if (water == 30) {
			System.out.println("A capacidade de água na máquina está no máximo.");
			return;
		}
		water += 2;
	}
	public void addShampoo() {
		if (shampoo == 10) {
			System.out.println("A capacidade de Shampoo da máquina está no máximo.");
			return;
		}
		shampoo += 2;
	
	}
	
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getShampoo() {
		return shampoo;
	}
	public void setShampoo(int shampoo) {
		this.shampoo = shampoo;
	}
	public Pet getPet() {
		return pet;
	}
	public boolean hasPet() {
		return pet != null;
	}
	
	public void setPet(Pet pet) {
		if(!this.clean) {
			System.out.println("A máquina está suja, para colocar o pet é necesssário limpa-la");
		}
		
		if(hasPet()) {
			System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento.");
			return;
		}
		this.pet = pet;
	}

}
