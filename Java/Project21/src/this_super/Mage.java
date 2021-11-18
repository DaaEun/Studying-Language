package this_super;

public class Mage extends Player{
	
	int mana;
	
	Mage(String name){
		super(name);
		this.mana = 100;
	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 마나: " + mana);
	}

	
}
