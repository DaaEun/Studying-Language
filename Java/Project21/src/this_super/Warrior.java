package this_super;

public class Warrior extends Player{
	
	int rage;
	
	Warrior(String name){
		super(name);
		this.rage = 60;
	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}

	
}
